package com.akavrt.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * User: akavrt
 * Date: 14.05.14
 * Time: 13:06
 */
public class MatrixHelper {

    /**
     * Prints matrix of size [2n-1] x [2n-1]
     */
    public static void printMegaMatrix(int n) {
        if (n < 2) {
            throw new IllegalStateException("Parameter value must be equal or bigger than 2.");
        }

        int length = 2 * n - 1;
        List<String> holder = new ArrayList<String>();
        for (int i = 0; i < length / 2 + 1; i++) {
            StringBuilder builder = new StringBuilder();
            int value = 0;
            for (int j = 0; j < length; j++) {
                if (j < n - 1 - i || j > n - 1 + i) {
                    builder.append("*");
                } else {
                    builder.append(j <= n - 1 ? ++value : --value);
                }
            }

            holder.add(builder.toString());
        }

        for (String line : holder) {
            System.out.println(line);
        }

        for (int i = holder.size() - 2; i >= 0 ; i--) {
            System.out.println(holder.get(i));
        }
    }

    public static void main(String[] args) {
        printMegaMatrix(4);
    }

}
