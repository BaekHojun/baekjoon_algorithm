package com.dev.문자열처리;

import java.io.*;
import java.util.Scanner;

public class No5622_다이얼 {

    public static void main(String[] args) throws IOException {
        /*
        다이얼
        문제
        상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.

        전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
        숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

        숫자 1을 걸려면 총 2초가 필요하다.
        1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

        상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
        즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

        할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.

        출력
        첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.

        예제 입력 1
        UNUCIC
        예제 출력 1
        36

         */
        go();
        System.out.println();
        go2();
        System.out.println();


    }

    public static void go2() throws IOException{
        //A:65 ~ Z:90
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();
        int tm=0;   //걸린시간
        int charNo;
        for(int x=0; x<alphabet.length(); x++){
            charNo = ((byte)alphabet.charAt(x)-65); //A:0 ~ Z:25
            if(charNo <= 14) tm+=charNo/3+3; // A ~ O
            else if(charNo >= 15 && charNo <= 18) tm+=8;    //P~S
            else if(charNo >= 19 && charNo <= 21) tm+=9; // T~V
            else tm+=10;    //W~Z
        }
        System.out.println(tm);
    }

    public static void go() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        String[] ch = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"}; // +3 가 걸리는 시간
        String[] str = br.readLine().split("");
        int res = 0;
        for(int x=0; x < str.length; x++){
            for(int y=0; y < ch.length; y++){
                if(ch[y].contains(str[x])) res+=(y+3);
            }
        }
        bw.write(res+"");
        bw.flush();
    }

}
