package com.dev.기타;

import java.util.*;

public class No2753_윤년 {
    public static void main(String[] args) {
        /*
윤년 (2753번)
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	16025	9738	8921	61.943%
문제
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.

예를들어, 2012년은 4의 배수라서 윤년이지만, 1900년은 4의 배수이지만, 100의 배수이기 때문에 윤년이 아니다.

하지만, 2000년은 400의 배수이기 때문에 윤년이다.

입력
첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

출력
첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

예제 입력 1
2000
예제 출력 1
1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n%4==0 && n%100!=0) || n%400==0) System.out.println(1);
        else System.out.println(0);
    }
}







