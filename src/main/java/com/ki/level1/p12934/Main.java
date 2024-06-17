package com.ki.level1.p12934;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(121));
        // 144
        System.out.println(Solution.solution(3));
        // -1
        System.out.println(Solution.solution(25));
        // 36
    }
}

class Solution {
    public static long solution(long n) {
        for (long a=1; a <= n; a++) {
            if(a*a==n){
                return (a+1)*(a+1);
            }
        }
        return -1;
    }
}