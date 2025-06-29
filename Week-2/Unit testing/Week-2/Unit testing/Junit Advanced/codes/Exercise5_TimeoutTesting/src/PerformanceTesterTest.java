import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskWithinTime() {
        PerformanceTester tester = new PerformanceTester();
        assertTimeout(Duration.ofMillis(1000), () -> tester.performTask());
    }
}