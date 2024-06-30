package DayTwentytwo.testcases.nidhi; 

public class AssertTestDemo {

    @Test
    public void testForAssertEquals() {
        int result = 1;
        int expected = 1;
        assertEquals(result, expected);
    }

    private void assertEquals(int result, int expected) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testForAssertTrue() {
        assertTrue("Hello".contains("e"));
    }

    private void assertTrue(boolean contains) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    public void testForAssertFalse() {
        assertTrue("Hello".contains("k"));
    }

    @Test
    public void testForNull() {
        String s = null;
        assertNull(s);
    }

    private void assertNull(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertNull'");
    }

  

    private void assertThrows(Class<IllegalArgumentException> class1, Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertThrows'");
    }

    @Test
    public void testFail() {
        fail("It is supposed to be fail");
    }

    private void fail(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fail'");
    }
}
