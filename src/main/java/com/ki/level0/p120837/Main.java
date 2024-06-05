package com.ki.level0.p120837;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public static int solution(int hp) {

        int a = hp/5;
        int b = (hp-(a*5))/3;
        int c = ((hp-(a*5)-(b*3)))/1;

        return a+b+c;
    }
}