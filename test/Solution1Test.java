import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    Solution1 solution1 = new Solution1();

    @Test
    void divide() {
        int dividend = 5;
        int divisor = 2;
        int expected = 2;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide2() {
        int dividend = 10;
        int divisor = 3;
        int expected = 3;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide3() {
        int dividend = 40;
        int divisor = 3;
        int expected = 13;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide4() {
        int dividend = 7;
        int divisor = -3;
        int expected = -2;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide5() {
        int dividend = -2147483648;
        int divisor = -1;
        int expected = 2147483647;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide6() {
        int dividend = -2147483648;
        int divisor = 1;
        int expected = -2147483648;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide7() {
        int dividend = -2147483648;
        int divisor = 2;
        int expected = -1073741824;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide8() {
        int dividend = 1038925803;
        int divisor = -2147483648;
        int expected = 0;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }

    @Test
    void divide9() {
        int dividend = -2147483648;
        int divisor = -2147483648;
        int expected = 1;
        assertEquals(expected, solution1.divide(dividend, divisor));
    }
}