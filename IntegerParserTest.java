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

    // Sanity check of all 3.

    @Test public void testAllSimple10() { testAll(1234, "1234", 10); }

    // Checking impl. 1.
    @Test public void test1_10_a_16() { test1(10, "a", 16); }
    @Test public void test1_15_f_16() { test1(15, "f", 16); }
    @Test public void test1_16_g_17() { test1(16, "g", 17); }
    @Test public void test1_2_10_2() { test1(2, "10", 2); }
    @Test public void test1_3_11_2() { test1(3, "11", 2); }
    @Test public void test1_4_100_2() { test1(4, "100", 2); }
    @Test public void test1_4312_4312_10() { test1(4312, "4312", 10); }

    // Checking impl. 2.
    @Test public void test2_10_a_16() { test2(10, "a", 16); }
    @Test public void test2_15_f_16() { test2(15, "f", 16); }
    @Test public void test2_16_g_17() { test2(16, "g", 17); }
    @Test public void test2_2_10_2() { test2(2, "10", 2); }
    @Test public void test2_3_11_2() { test2(3, "11", 2); }
    @Test public void test2_4_100_2() { test2(4, "100", 2); }
    @Test public void test2_4312_4312_10() { test2(4312, "4312", 10); }

    // Checking impl. 3.
    @Test public void test3_10_a_16() { test3(10, "a", 16); }
    @Test public void test3_15_f_16() { test3(15, "f", 16); }
    @Test public void test3_16_g_17() { test3(16, "g", 17); }
    @Test public void test3_2_10_2() { test3(2, "10", 2); }
    @Test public void test3_3_11_2() { test3(3, "11", 2); }
    @Test public void test3_4_100_2() { test3(4, "100", 2); }
    @Test public void test3_4312_4312_10() { test3(4312, "4312", 10); }

    // What am I missing in this test suite?
}
