package nl.vu.wouter.polymorphic;

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

import java.util.concurrent.TimeUnit;

import static java.lang.Math.round;


@Fork(0)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class BiasedPolymorphicCallsBenchmark extends PolymorphicCallsBenchmark {

    @Param({"0.0", "0.1", "0.5", "0.9", "1.0"})
    private float bias;

    @Setup
    public void setup() {
        this.ratio0 = round(bias * 100);
        this.ratio1 = (100 - ratio0) / 2;
        this.ratio2 = ratio1;
        super.setup();
    }

}
