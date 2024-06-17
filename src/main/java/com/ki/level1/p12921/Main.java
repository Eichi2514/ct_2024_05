package com.ki.level1.p12921;

public class Main {
    public static void main(String[] args) {
    System.out.println(Solution.solution(10));
    }
}

class Solution {
    public static int solution(int n) {
        int A = 1;
        if (n == 1) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                A++;
            }
        }
        return A;
    }
}