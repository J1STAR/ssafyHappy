package com.ssafy.java;

import java.util.Scanner;

public class DigitTest1 {

    public static void main(String[] args) {
//        int n = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("\t");
//            }
//            for (int j = i; j <= 5; j++) {
//                System.out.print(n++ + "\t");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(">> 숫자를 입력해주세요 : ");

        Integer size = 0;
        while (true) {
            size = scanner.nextInt();
            System.out.println();

            if (size instanceof Integer && size > 0) {
                break;
            } else
                System.out.print(">> 잘못 입력하셨습니다. 다시 홀수를 입력해주세요 : ");
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j - i >= 0) {
                    System.out.printf("%3d\t", ++count);
                } else
                    System.out.printf("\t");
            }
            System.out.println();
        }
    }
}
