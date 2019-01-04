package com.ssafy.java;

import java.util.Scanner;

public class DigitTest2 {

    public static void main(String[] args) {

//        int count = 0;
//        for (int i = 0; i < 5; i++) {
//
//            int limit = 0;
//            if (i == 1 || i == 3) {
//                System.out.print("\t");
//                limit = 1;
//            } else if (i == 2) {
//                System.out.print("\t\t");
//                limit = 2;
//            }
//            for (int j = 0; j < 5 - limit * 2; j++) {
//                System.out.print(++count + "\t");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(">> 홀수인 숫자를 입력해주세요 : ");

        Integer size = 0;
        while (true) {
            size = scanner.nextInt();
            System.out.println();

            if (size instanceof Integer && size > 0 && size % 2 != 0) {
                break;
            } else
                System.out.print(">> 잘못 입력하셨습니다. 다시 홀수를 입력해주세요 : ");
        }

        int count = 1;
        for (int i = -(size/2); i <= (size/2); i++) {

            for (int j = -(size/2); j <= (size/2); j++) {
                if (i - j >= 0 && i + j >= 0) {
                    System.out.printf("%3d\t", count);
                    count++;
                } else if (i - j <= 0 && i + j <= 0) {
                    System.out.printf("%3d\t", count);
                    count++;
                } else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
