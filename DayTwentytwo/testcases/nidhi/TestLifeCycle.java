package DayTwentytwo.testcases.nidhi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Before Each Test"); 
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("After Each Test"); 
    }

    @BeforeAll
    void beforeAllTests() {
        System.out.println("Before All Tests"); 
    }

    @AfterAll
    void afterAllTests() {
        System.out.println("After All Tests");
    }

    @Test
    void testMethod1() {
        System.out.println("Test Method 1.....");
    }

    @Test
    void testMethod2() {
        System.out.println("Test Method 2.....");
    }
}