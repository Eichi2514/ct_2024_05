//package com.ki.level0.p120808;
//
//public class Main {
//    public static void main(String[] args) {
//        int 분자1 = 1;
//        int 분모1 = 15;
//        int 분자2 = 1;
//        int 분모2 = 3;
//        int[] a = new int[2];
//        int 최소공배수;
//        int 큰분모;
//        int 작은분모;
//
//        if (분모1 < 분모2) {
//            큰분모 = 분모2;
//            작은분모 = 분모1;
//            int 작은분모2 = 1;
//            for (int N = 1; N <= 분모1*분모2; N++) {
//                for (int n = 1; n <= 분모1*분모2; n++) {
//                    if ((작은분모2 * n) == (큰분모 * N)) {
//                    } else if ((작은분모2 * n) != (큰분모 * N)) {
//                        최소공배수 = 작은분모2 * n;
//                        a[0] = ((최소공배수 / 분모1) * 분자1) + ((최소공배수 / 분모2) * 분자2);
//                        a[1] = 최소공배수;
//                    }
//                }
//            }
//        } else if (분모2 < 분모1) {
//            큰분모 = 분모1;
//            작은분모 = 분모2;
//            int 작은분모2 = 1;
//            for (int N = 1; N <= 분모1*분모2; N++) {
//                for (int n = 1; n <= 분모1*분모2; n++) {
//                    if ((작은분모2 * n) != (큰분모 * N)) {
//                    } else if ((작은분모2 * n) == (큰분모 * N)) {
//                        최소공배수 = 작은분모2 * n;
//                        a[0] = ((최소공배수 / 분모1) * 분자1) + ((최소공배수 / 분모2) * 분자2);
//                        a[1] = 최소공배수;
//                    }
//                }
//            }
//        } else {
//            최소공배수 = 분모1;
//            a[0] = ((최소공배수 / 분모1) * 분자1) + ((최소공배수 / 분모2) * 분자2);
//            a[1] = 최소공배수;
//            }
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//    }
//}
//
////class Solution {
////    public int[] solution(int 분자1, int 분모1, int 분자2, int 분모2) {
////        int[] a = new int[2];
////        int 최소공배수;
////        int 큰분모;
////        int 작은분모;
////
////        if (분모1 < 분모2) {
////            큰분모 = 분모2;
////            작은분모 = 분모1;
////            int 작은분모2 = 1;
////            for (int N = 1; N <= 1000; N++) {
////                for (int n = 1; n <= 1000; n++) {
////                    if ((작은분모2 * n) == (큰분모 * N)) {
////                    } else if ((작은분모2 * n) != (큰분모 * N)) {
////                        최소공배수 = 작은분모2 * n;
////                        a[0] = ((최소공배수 / 분모1) * 분자1) + ((최소공배수 / 분모2) * 분자2);
////                        a[1] = 최소공배수;
////                    }
////                }
////            }
////        } else if (분모2 < 분모1) {
////            큰분모 = 분모1;
////            작은분모 = 분모2;
////            int 작은분모2 = 1;
////            for (int N = 1; N <= 1000; N++) {
////                for (int n = 1; n <= 1000; n++) {
////                    if ((작은분모2 * n) != (큰분모 * N)) {
////                    } else if ((작은분모2 * n) == (큰분모 * N)) {
////                        최소공배수 = 작은분모2 * n;
////                        a[0] = ((최소공배수 / 분모1) * 분자1) + ((최소공배수 / 분모2) * 분자2);
////                        a[1] = 최소공배수;
////                    }
////                }
////            }
////        } else {
////            최소공배수 = 분모1;
////            a[0] = ((최소공배수 / 분모1) * 분자1) + ((최소공배수 / 분모2) * 분자2);
////            a[1] = 최소공배수;
////        }
////        int[] ints = {a[0], a[1]};
////        return ints;
////    }
////}