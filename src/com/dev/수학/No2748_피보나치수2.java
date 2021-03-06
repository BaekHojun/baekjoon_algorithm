package com.dev.수학;

import java.util.*;

public class No2748_피보나치수2 {
    public static void main(String[] args) {
        /*
    피보나치 수 2
    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
    1 초	128 MB	23402	9390	8116	41.465%
    문제
    피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

    이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.

    n=17일때 까지 피보나치 수를 써보면 다음과 같다.

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

    n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 n이 주어진다. n은 90보다 작거나 같은 자연수이다.

    출력
    첫째 줄에 n번째 피보나치 수를 출력한다.

    예제 입력 1
    10
    예제 출력 1
    55
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = go(n);
        System.out.println(res);
        System.out.println();

        res = go2(n);
        System.out.println(res);
        System.out.println();
    }

    //20191106
    private static long go2(int n){
        long n1=0;
        long n2=1;
        long temp;
        for(int x=2; x <= n; x++){
            temp = n1+n2;
            n1=n2;
            n2=temp;
        }
        return n2;
    }

    public static long go(int n){
        long f = 0;
        long s = 1;
        long r = 1;
        for(int x=3; x<=(n+1); x++){
            r = f+s;
            f = s;
            s = r;
        }
        return r;
    }
}
