package com.dev.에라토스테네스의체;

import java.util.Scanner;

public class No2581_소수 {

    public static void main(String[] args) {
    /*
        소수
        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
        1 초	128 MB	22920	8497	7457	38.385%
        문제
        자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

        예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

        입력
        입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

        M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

        출력
        M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.

        단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

        예제 입력 1
        60
        100
        예제 출력 1
        620
        61
        예제 입력 2
        64
        65
        예제 출력 2
        -1
        출처
        Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2006 > 중등부 1번

        데이터를 추가한 사람: hchanhong kyaryunha
        문제의 오타를 찾은 사람: jh05013 sky1357
        잘못된 데이터를 찾은 사람: myungwoo
    */
        go();
    }

    private static void go(){

        //"에라토스테네스의 체" 이용 ... 맞게 한건진 모르겠음
        /*
        [에라토스테네스의 체] - 위키백과 내용 참조.
        2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다. 그림에서 회색 사각형으로 두른 수들이 여기에 해당한다.
        2는 소수이므로 오른쪽에 2를 쓴다. (빨간색)
        자기 자신을 제외한 2의 배수를 모두 지운다.
        남아있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다. (초록색)
        자기 자신을 제외한 3의 배수를 모두 지운다.
        남아있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다. (파란색)
        자기 자신을 제외한 5의 배수를 모두 지운다.
        남아있는 수 가운데 7은 소수이므로 오른쪽에 7을 쓴다. (노란색)
        자기 자신을 제외한 7의 배수를 모두 지운다.
        위의 과정을 반복하면 구하는 구간의 모든 소수가 남는다.
        그림의 경우, {\displaystyle 11^{2}>120}{\displaystyle 11^{2}>120}이므로 11보다 작은 수의 배수들만 지워도 충분하다. 즉, 120보다 작거나 같은 수 가운데 2, 3, 5, 7의 배수를 지우고 남는 수는 모두 소수이다.
        */

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] arr = new boolean[n+1];   //0번도 포함해야 되니까 0+1
        for(int x=2; x<arr.length; x++) arr[x] = true;  //기본값 true 처리(소수) / 인덱스 0, 1은 소수아니므로 소수처리 안해줌

        //arr내에서 소수아닌 아이들 걸러내기
        for(int x=2; x<=n; x++){
            if(arr[x]){ //첫번째 아이는 소수 맞음
                for(int y=2; y<=n/x; y++){  //소소의 배수들에 대해 소수아님 처리
                    arr[x*y] = false;
                }
            }
        }
        int min=-1;
        int sum=0;
        for(int x=m; x<=n; x++){
            if(arr[x]){
                if(min==-1) min = x;
                sum+=x;
            }
        }
        if(sum>0)System.out.println(sum);    //범위내 소수합
        System.out.println(min);    //범위내 소수중 최소값

    }


}
