public class Solution1 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        } else if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }

        if (divisor == Integer.MIN_VALUE && dividend == Integer.MIN_VALUE) {
            return 1;
        } else if (divisor == Integer.MIN_VALUE) {
            return 0;
        }

        int result = 0;

        if (dividend > 0) {
            if (divisor > 0) {
                while (dividend >= divisor) {
                    dividend -= divisor;
                    result++;
                }
            } else {
                while (dividend >= -divisor) {
                    dividend += divisor;
                    result++;
                }
                result = -result;
            }
        } else {
            if (divisor > 0) {
                while (dividend <= -divisor) {
                    dividend += divisor;
                    result++;
                }
                result = -result;
            } else {
                while (dividend <= divisor) {
                    dividend -= divisor;
                    result++;
                }
            }
        }
        return result;
    }
}