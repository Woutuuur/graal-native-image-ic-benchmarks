package nl.vu.wouter.complex;

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

@Fork(0)
@Warmup(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class ComplexPolymorphicCallsBenchmark {

    @Param("100000")
    private int count;

    @Param({"0.00", "0.33", "0.50", "0.66", "0.90", "0.95", "0.98", "0.99", "1.00"})
    protected double ratio0;

    private Data[] datas;
    private final Random random = new Random(0);

    @Setup
    public void setup() {
        long num0 = Math.round(ratio0 * count);
        
        List<Data> dataList = new java.util.ArrayList<>(count);
        
        for (int i = 0; i < num0; i++) {
            byte[] randomData = new byte[10];
            random.nextBytes(randomData);
            dataList.add(new Data(0, randomData));
        }
        
        for (long i = num0; i < count; i++) {
            byte[] randomData = new byte[10];
            random.nextBytes(randomData);

            int workerId = 1 + random.nextInt(249);
            dataList.add(new Data(workerId, randomData));
        }
        
        Collections.shuffle(dataList, random);
        
        datas = dataList.toArray(new Data[0]);
    }

    @Benchmark
    public int staticWork() {
        int sum = 0;
        for (Data data : datas) {
            sum += data.doStaticWorkBySwitchCase();
        }
        return sum;
    }

    @Benchmark
    public int interfaceWork() {
        int sum = 0;
        for (Data data : datas) {
            sum += data.doInterfaceWork();
        }
        return sum;
    }

    @Benchmark
    public int abstractWork() {
        int sum = 0;
        for (Data data : datas) {
            sum += data.doAbstractWork();
        }
        return sum;
    }
}
