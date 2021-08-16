package com.codingtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //
    //In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    //Example 1:
    //
    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalList = new ArrayList<>();
        pascalList.add(Arrays.asList(1));
        for(int i=1; i<numRows; i++)
        {
            List<Integer> internalList = pascalList.get(pascalList.size()-1);
            List<Integer> createPascal = new ArrayList<>();
            createPascal.add(internalList.get(0));

            for(int j=1; j<internalList.size(); j++)
            {
                createPascal.add(internalList.get(j-1) + internalList.get(j));
            }
            createPascal.add(internalList.get(0));
            pascalList.add(createPascal);
        }

        return pascalList;
    }
}
