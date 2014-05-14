package com.akavrt.matrix;

/**
 * User: akavrt
 * Date: 14.05.14
 * Time: 13:06
 */
public class MatrixHelper {

    /**
     * Prints matrix of size [2n-1] x [2n-1].
     */
    public static void printMegaMatrix(int n) {
        if (n < 2) {
            throw new IllegalStateException("Parameter value must be equal or bigger than 2.");
        }

        int length = 2 * n - 1;
        int center = length / 2 + 1;
        int left = center - 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            left = i < center
                    ? left - 1
                    : left + 1;

            int value = 0;
            for (int j = 0; j < length; j++) {
                if (j <= left || j >= length - left - 1) {
                    builder.append("*");
                } else {
                    builder.append(j <= n - 1
                                           ? ++value
                                           : --value);
                }
            }
            builder.append("\n");
        }

        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        printMegaMatrix(8);
    }
}
