import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerParserTest {

    private void test1(int e, String s, int b) {
        assertEquals(e, IntegerParser.parseInt1(s, b));
    }

    private void test2(int e, String s, int b) {
        assertEquals(e, IntegerParser.parseInt2(s, b));
    }

    private void test3(int e, String s, int b) {
        assertEquals(e, IntegerParser.parseInt3(s, b));
    }

    private void testAll(int e, String s, int b) {
        test1(e, s, b);
        test2(e, s, b);
        test3(e, s, b);
    }

    @Test
    public void testAllGood() {
        testAll(10, "a", 16);
        testAll(15, "f", 16);
        testAll(16, "g", 17);
        testAll(2, "10", 2);
        testAll(3, "11", 2);
        testAll(4, "100", 2);
        testAll(1234, "1234", 10);
        testAll(4312, "4312", 10);
    }
}
