package com.dev.출력;

import java.util.*;

public class No2439_별찍기2 {
    public static void main(String[] args) {
        /*
별 찍기 - 2
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	58926	33989	30596	59.341%
문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
5
예제 출력 1
    *
   **
  ***
 ****
*****
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x=1; x<=n; x++) {
            for(int y=0; y<n-x; y++) System.out.print(" ");
            for(int y=0; y<x; y++) System.out.print("*");
            System.out.println();
        }
    }
}
