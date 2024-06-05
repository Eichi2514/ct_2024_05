package com.ki.level0.p120808;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(1, 2, 3, 4));
    }
}

class Solution {
    public static int solution(int a, int b, int c, int d) {
        int C = 0;
        int D = 0;


        for (int B = 0; B <= (d * b); B++) {
            C = C + b;
            for (int BB = 0; BB <= (d * b); BB++) {
                D = D + d;
            }
        }
        System.out.println();
        return 0;
    }
}