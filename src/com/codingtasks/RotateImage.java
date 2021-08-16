package com.codingtasks;

import java.util.ArrayList;
import java.util.List;

public class RotateImage {

    //You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    //
    //You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

    //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    //Output: [[7,4,1],[8,5,2],[9,6,3]]

    public static void rotate(int[][] matrix) {
        int i = 0;
        while (i < matrix.length) {
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < matrix.length; j++) {
                list.add(matrix[i][j]);
            }
            List<Integer> listTobeAdded = new ArrayList<>();
            int indexCount = list.size() - 1;
            for (int k = matrix.length - 1; k >= i; k--) {
                listTobeAdded.add(matrix[k][i]);
                if (indexCount >= 0) {
                    matrix[k][i] = list.get(indexCount);
                    indexCount--;
                }
            }
            for (int rem = i - 1; rem >= 0; rem--) {
                listTobeAdded.add(matrix[i][rem]);
            }
            for (int add = 0; add < matrix.length; add++) {
                matrix[i][add] = listTobeAdded.get(add);
            }
            i++;
        }
    }
}
