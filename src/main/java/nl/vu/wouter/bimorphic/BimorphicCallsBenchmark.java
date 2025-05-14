package nl.vu.wouter.bimorphic;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Fork(0)
@Warmup(iterations = 5, time = 1, timeUnit = java.util.concurrent.TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = java.util.concurrent.TimeUnit.SECONDS)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class BimorphicCallsBenchmark {

    @Param("100000")
    private int count;

    @Param({"0.0", "0.1", "0.5", "0.9", "1.0"})
    private double bias;

    private Data[] datas;

    @Setup
    public void setup() {
        Random r = new Random(0);

        List<Data> dataList = IntStream.range(0, count)
            .map(i -> i < count * bias ? 1 : 0)
            .mapToObj(id -> {
                byte[] randomData = new byte[10];
                r.nextBytes(randomData);

                return new Data((byte) id, randomData);
            })
            .collect(Collectors.toList());

        Collections.shuffle(dataList, r);

        datas = dataList.toArray(new Data[0]);
    }

    @Benchmark
    public void staticWork() {
        for (Data data : datas) {
            data.doStaticWorkBySwitchCase();
        }
    }

    @Benchmark
    public void interfaceWork() {
        for (Data data : datas) {
            data.doInterfaceWork();
        }
    }

    @Benchmark
    public void abstractWork() {
        for (Data data : datas) {
            data.doAbstractWork();
        }
    }

}
