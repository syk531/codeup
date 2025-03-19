package bagic;

import java.util.Scanner;

public class bagic1049 {
    public static void main(String[] args) {
        /*
            두 정수(a, b)를 입력받아

            a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.


            참고
            어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational)를 사용할 수 있다.

            비교/관계연산자 > 는
            왼쪽의 값이 오른쪽 값 보다 큰 경우 참(true)을 나타내는 정수값 1로 계산하고,
            그 외의 경우에는 거짓(false)를 나타내는 정수값 0으로 계산한다.

            비교/관계연산자도 일반적인 사칙연산자처럼 주어진 두 수를 이용해 계산을 수행하고,
            그 결과를 1(참), 또는 0(거짓)으로 계산해 주는 연산자이다.

            비교/관계연산자는 >, <, >=, <=, ==(같다), !=(다르다) 6개가 있다.

            예시
            printf("%d", 123<456); //비교 연산자 < 의 계산 결과인 1(참)이 출력된다.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a>b?1:0);
    }
}