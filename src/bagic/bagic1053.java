package bagic;

import java.util.Scanner;

public class bagic1053 {
    public static void main(String[] args) {
        /*
            1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
            반대로 출력하는 프로그램을 작성해보자.


            참고
            C언어에서 비교/관계 연산(==, !=, >, <, >=, <=)이 수행될 때,
            0은 거짓(false)으로 인식되고, 0이 아닌 모든 수는 참(true)으로 인식된다.

            참 또는 거짓의 논리값을 역(반대)으로 바꾸기 위해서는
            논리(logical)연산자 !를 사용할 수 있다.

            이러한 논리연산을 NOT 연산이라고도 부르고,
            프라임(기호 오른쪽에 따옴표) 이나 바(기호 위에 가로 막대)로 표시하고,
            집합 기호로는 c (여집합, complement)를 의미한다. 모두 같은 의미이다.

            참, 거짓의 논리값(boolean value)인 불 값을 다루어주는 논리연산자는
            !(not), &&(and), ||(or) 이 있다.

            ** 불 대수(boolean algebra)는 수학자 불이 만들어낸 것으로
            참/거짓만 가지는 논리값과 그 연산을 다룬다.

            예시
            printf("%d", !0); //거짓의 반대, 즉 참인 1로 계산됨
            printf("%d", !1); //참의 반대, 즉 거짓인 0으로 계산됨
            printf("%d", !999); //참의 반대, 즉 거짓인 0으로 계산됨

            어떤 변수 a에, !a 와 같은 논리 연산이 가능하다.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = 0;
        if(a == 0) {
            b = 1;
        }

        System.out.print(b);
    }
}