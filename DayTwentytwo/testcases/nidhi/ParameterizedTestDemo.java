package DayTwentytwo.testcases.nidhi;



import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "madam", "string"})
    void testPalindromes(String word) {
        assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
    }

    private void assertTrue(boolean equals) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

   
}
