package com.dev.출력;

import java.util.*;

public class No2742_기찍N {
    public static void main(String[] args) {
        /*
기찍 N 성공
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	57435	36614	33299	65.404%
문제
자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

예제 입력 1
5
예제 출력 1
5
4
3
2
1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x=n; x>0; x--) System.out.println(x);
    }
}

