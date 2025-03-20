package bagic;

import java.util.Scanner;

public class bagic1065 {
    public static void main(String[] args) {
        /*
            세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.


            참고
            if(조건)
            { //조건이 참일 때에만 실행되는 구역(코드블록의 시작)
              실행1;
              실행2;
              ...
            } //코드블록의 끝

            의 조건/선택 실행 구조는
            주어진 “조건”을 검사해 그 결과가 참인 경우에만 코드블록 안에 작성된 내용들을 순서대로 실행한다.


            예시
            if(a%2==0)
            {
              printf(“%d”, a);
            }

            if(b%2==0)
            {
              printf(“%d”, b);
            }

            if(c%2==0)
            {
              printf(“%d”, c);
            }

            ** a%2==0 은 a%2가 먼저 수행되고 그 결과를 0과 비교한 참/거짓 값을 계산한다.

            a%2==0의 의미는 a를 2로 나눈 나머지를 0과 비교한 결과 값(참/거짓)이다.
            따라서, if(a%2 == 0) 는 “a가 짝수라면?” 이라는 의미로 해석할 수 있다.


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a % 2 == 0) {
            System.out.println(a);
        }

        if(b % 2 == 0) {
            System.out.println(b);
        }

        if(c % 2 == 0) {
            System.out.println(c);
        }
    }
}