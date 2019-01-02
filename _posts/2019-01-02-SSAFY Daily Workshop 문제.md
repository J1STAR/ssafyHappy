---
layout: post
title:  "19/01/02] Daily Workshop 문제풀이"
date:   2019-01-02 20:48:00 +0900
categories: ["SSAFY","Workshop","JAVA"]
author: "J1STAR"
---

# 1-1. 오른쪽 위를 향한 화살표 모양으로 숫자 출력

> 결과 화면

1. 첫 줄에 n개의 숫자 출력
2. 한 줄 내려갈 때마다 n-1개의 숫자 출력
3. 마지막 줄 1개의 숫자 출력
4. 모든 숫자는 우측으로 붙어있는 형태

<br>

> 소스코드

![ws1sc]({{site.url}}{{site.baseurl}}/assets/2019-01-02/ws1sc.png)

1. Scanner를 통해 최대 사이즈를 유저에게 입력받음.
2. 유저가 입력한 size가 Integer 또는 0보다 작을 경우 다시 입력하도록 반복
3. 유저가 입력한 size만큼 n x n이 출력되도록 반복문 2번 실행
4. j가 i보다 크거나 같은 경우, 숫자 출력
5. j가 i보다 작을 경우 'tab' 출력

<br>

> 설명

![ws1sv]({{site.url}}{{site.baseurl}}/assets/2019-01-02/ws1sv.png)
1. 문제에서 요구하는 출력 화면은 y = -x 그래프에서 빨간색 삼각형 모양으로 숫자를 출력하는 화면
2. 빨간색 삼각형에 해당하는 부분은 y >= -x (x + y >= 0과 같음)에 해당하는 부분
3. 결과화면에서는 아래로 갈수록 y가 커지는 모양이기 때문에 xy 좌표계에서 y = -y로 대치
4. if( x - y >= 0 )일 경우에 숫자 출력, 아닐 경우 tab을 출력하여 빈 칸 출력

<br>

> 결과화면

![ws1sv2]({{site.url}}{{site.baseurl}}/assets/2019-01-02/ws1sv2.gif)

<br><br>

# 1-2. 모래시계 모양으로 숫자 출력





# 2. 컴퓨터와 가위 바위 보

