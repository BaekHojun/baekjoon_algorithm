package com.dev.기타;

import java.io.*;
import java.util.Scanner;

public class No2675_문자열반복 {

    public static void main(String[] args) {
        /*
문자열 반복
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	26672	14095	12551	55.123%
문제
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

출력
각 테스트 케이스에 대해 P를 출력한다.

예제 입력 1
2
3 ABC
5 /HTP
예제 출력 1
AAABBBCCC
/////HHHHHTTTTTPPPPP
         */

        try {
            go();
        } catch (Exception e) { e.printStackTrace(); }

        System.out.println();
        go2();
    }

    public static void go() throws Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        int t = Integer.parseInt(br.readLine());    //테스트갯수
        int i = 0;  //반복갯수
        String[] str;    //입력된 문자열
        String res = "";    //결과
        for(int x=0; x < t; x++){
            str = br.readLine().split(" ");
            for(int y=0; y<str[1].length(); y++) {
                for(int z=0; z < Integer.parseInt(str[0]); z++){
                    bw.write(str[1].substring(y, y+1)+"");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void go2() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String result = "";  //반복횟수
        int r = 0;
        String S = "";  //반복할 문자열
        for(int x=0; x<t; x++){
            r = sc.nextInt();
            S = sc.next();
            for(int y=0; y<S.length(); y++){
                for(int z=0; z<r; z++){
                    result+=S.charAt(y)+"";
                }
            }
            result+="\n";
        }
        System.out.print(result);

    }


}


