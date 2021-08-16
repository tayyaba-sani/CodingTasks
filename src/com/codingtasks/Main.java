package com.codingtasks;

import static com.codingtasks.PascalTriangle.generate;
import static com.codingtasks.ThreeSum.threeSum;

public class Main {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(generate(5));
    }
}
