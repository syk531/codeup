package bagic;

import java.util.Scanner;

public class bagic1063 {
    public static void main(String[] args) {
        /*
            입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
            단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.

            참고
            3개의 요소로 이루어지는 3항(ternary) 연산자는
            "조건식 ? (참일 때의 값) : (거짓일 때의 값)” 의 형태로 사용하는 연산자이다.
            - 조건식의 계산 결과가 참인 경우에는 ':' 왼쪽의 값 또는 식으로 바뀌고,
            - 거짓인 경우에는 ':' 오른쪽의 값 또는 식으로 바뀐다.

            예를 들어
            123 > 456 ? 0 : 1
            과 같은 표현식은 123 > 456 의 비교연산 결과가 거짓이므로 1이 된다.

            예시
            printf("%d", a>b ? a:b); //두 값 중 큰 값이 출력된다.

            예시 코드는 a>b 의 결과가 참(1)이면 (a>b ? a:b)의 결과는 a가 되고,
            거짓(0)이면 (a>b ? a:b)의 결과는 b가 된다.


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a>b ? a : b);
    }
}