package com.codingtasks;

import java.util.Arrays;

import static com.codingtasks.FourSum.fourSum;
import static com.codingtasks.PascalTriangle.generate;
import static com.codingtasks.RotateImage.rotate;
import static com.codingtasks.ThreeSum.threeSum;

public class Main {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(generate(5));
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

        System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}

