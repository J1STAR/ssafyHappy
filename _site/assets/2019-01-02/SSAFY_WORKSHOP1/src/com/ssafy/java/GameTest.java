package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n>>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
            System.out.println("1. 5판 3승");
            System.out.println("2. 3판 2승");
            System.out.println("3. 1판 1승");
            System.out.print("번호를 입력하세요 : ");

            Scanner scan = new Scanner(System.in);
            int game_count = 7 - 2*Integer.parseInt(scan.nextLine());

            int user_win_count = 0;
            int com_win_count = 0;
            for(int i = 0; i< game_count; i++){
                int computer_hand = (int) (Math.random() * 3) + 1;

                System.out.print("가위 바위 보 중 하나 입력 : ");
//                System.out.println("컴퓨터 : "+ computer_hand);
                String user_hand = scan.nextLine();

                if (user_hand.equals("가위")) {

                    if (computer_hand == 1) {
                        // 가위
                        System.out.println("### 비겼습니다.");
                    } else if (computer_hand == 2) {
                        // 바위
                        System.out.println("### 졌습니다.");
                        com_win_count++;
                    } else if (computer_hand == 3) {
                        // 보
                        System.out.println("### 이겼습니다.");
                        user_win_count++;
                    }
                } else if (user_hand.equals("바위")) {
                    if (computer_hand == 1) {
                        // 가위
                        System.out.println("### 이겼습니다.");
                        user_win_count++;
                    } else if (computer_hand == 2) {
                        // 바위
                        System.out.println("### 비겼습니다.");
                    } else if (computer_hand == 3) {
                        // 보
                        System.out.println("### 졌습니다.");
                        com_win_count++;
                    }
                } else if (user_hand.equals("보")) {
                    if (computer_hand == 1) {
                        // 가위
                        System.out.println("### 졌습니다.");
                        com_win_count++;
                    } else if (computer_hand == 2) {
                        // 바위
                        System.out.println("### 이겼습니다.");
                        user_win_count++;
                    } else if (computer_hand == 3) {
                        // 보
                        System.out.println("### 비겼습니다.");
                    }
                }

                if (user_win_count == game_count / 2 + 1 || com_win_count == game_count / 2 + 1) {
                    break;
                }

            }

            if (user_win_count > com_win_count) {
                System.out.println("### 유저 승");
                break;
            } else if(user_win_count < com_win_count) {
                System.out.println("### 컴퓨터 승");
            } else
                System.out.println("### 무승부");
        }


    }
}
