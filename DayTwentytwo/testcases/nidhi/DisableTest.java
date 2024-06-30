package DayTwentytwo.testcases.nidhi;



import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableTest {

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Disabled
    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @Test
    void test3() {
        System.out.println("Test 3");
    }
}
