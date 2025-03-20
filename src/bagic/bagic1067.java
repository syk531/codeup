package bagic;

import java.util.Scanner;

public class bagic1067 {
    public static void main(String[] args) {
        /*
            정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.

            입력된 정수에 대해
            첫 줄에 minus 나 plus 를 출력하고,
            두 번째 줄에 odd 나 even 을 출력한다.


            참고
            조건/선택 실행 구조의 안에 조건/선택 실행 구조를 다시 "중첩"할 수 있다.
            이는 "중첩(nested)"의 원리가 적용되는 내용으로 아래와 같은 구조가 가능하다.

            if(조건1)
            {
              if(조건2) //조건문의 중첩
              {
                ...
              }
              else
              {
                ...
              }
            }
            else
            {
              if(조건2)
              {
                ...
              }
              else
              {
                ...
              }
            }

            위와 같은 조건/선택 실행구조는 조건/선택 실행구조를 중첩해
            서로 다른 4가지(2가지*2가지)의 경우에 대해 다른 실행을 할 수 있도록 해준다.

            ** 어떤 조건들이 맞았을 때에는 해당부분의 코드블록 내용만 실행되고,
            전체 조건/선택 실행구조를 빠져나간다. 즉, 다른 부분들은 실행되지 않는다.

            ** 소스코드의 들여쓰기는 사람이 보고 이해하기 쉽도록 하는 것으로써
            들여쓰기나 줄바꿈을 하지 않더라도 동일하게 컴파일된다.


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

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