package bagic;

import java.util.Scanner;

public class bagic1066 {
    public static void main(String[] args) {
        /*
            세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.


            참고
            if(조건)
            { //코드블록1 시작
              ... 실행...;
              ...
            }
            else
            { //코드블록2 시작
              ... 다른실행...;
              ...
            }
            의 조건/선택 실행구조는 주어진 “조건”을 검사해 참인 경우에는 코드블록1을 실행하고,
            거짓인 경우에는 코드블록2를 실행한다.

            예시
            if(a%2==0)
            {
              printf(“even”);
            }
            else
            {
              printf(“odd”);
            }

            ** else는 if 없이 혼자 사용되지 않는다. 또한, else 다음에 조건이 없는 이유는?
            참이 아니면 거짓이고, 거짓이 아니면 참이기 때문에...
            즉 if문의 조건식의 판별 결과는 2가지 경우(참 또는 거짓)로 계산되는데,
            else 부분은 if문의 조건식의 결과가 거짓인 경우에 해당하기 때문이다.

            ** 실행해야 할 명령들이 여러 개일 때 코드블록 기호 { }로 묶어 주는데,
            코드블록의 내용이 논리적으로 1개 단위라면 코드블록 기호를 생략할 수 있다.

            if(a%2==0) printf("even");
            else printf("odd");


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if(b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if(c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}