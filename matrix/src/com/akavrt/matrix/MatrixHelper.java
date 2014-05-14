package com.akavrt.matrix;

/**
 * @author Victor Balabanov <akavrt@gmail.com>
 */
public class MatrixHelper {
    private static final int DEFAULT_SIZE = 7;
    
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
            int shift = i < center ? - 1 : 1;
            left += shift;

            int value = 0;
            for (int j = 0; j < length; j++) {
                if (j <= left || j >= length - left - 1) {
                    builder.append("*");
                } else {
                    builder.append(j <= n - 1 ? ++value : --value);
                }
            }

            builder.append("\n");
        }

        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        int size = DEFAULT_SIZE;
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
            
        printMegaMatrix(size);
    }
}
