package nl.vu.wouter.polymorphic;

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
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Fork(0)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class PolymorphicCallsBenchmark {

    @Param("100000")
    private int count;

    // 0% (i.e. bimorphic), 33%, 50%, 67%, 90%, 95%, 98%
    @Param({"0", "1", "2", "3", "18", "38", "98"})
    protected int ratio0;

    @Param("1")
    protected int ratio1;

    @Param("1")
    protected int ratio2;

    private Data[] datas;

    @Setup
    public void setup() {
        Random r = new Random(0);

        int num0 = (count * ratio0) / (ratio0 + ratio1 + ratio2);
        int num1 = (count * ratio1) / (ratio0 + ratio1 + ratio2);

        IntUnaryOperator idxToId = idx -> idx < num0 ? 0 : idx < num0 + num1 ? 1 : 2;

        List<Data> dataList = IntStream.range(0, count)
        .map(idxToId)
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
