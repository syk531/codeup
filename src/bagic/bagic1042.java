package bagic;

import java.util.Scanner;

public class bagic1042 {
    public static void main(String[] args) {
        /*
            정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
            단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.

            참고
            C언어에서 정수/정수 연산의 결과는 정수(몫)로 계산된다.
            실수/정수, 정수/실수, (float)정수/정수, 정수/(float)정수 등의 연산 결과는 실수 값으로 계산된다.

            (float)(정수/정수)는 정수/정수의 결과인 정수 값을 실수형(float)로 바꾸는 것으로,
            계산 결과인 정수 값이 실수 형태로 변환되는 것이니 주의해야 한다.

            정수/실수 계산결과가 자동으로 실수형으로 바뀌는 것을 묵시적 (데이터)형변환이라고 하고,
            어떤 값이나 결과의 데이터형을 강제로 바꾸는 것을 명시적 (데이터)형변환이라고 한다.

            int a;
            scanf("%d", &a);
            printf("%f", (float)a);

            와 같이 실행하면, 정수로 저장되어 있는 값을 실수형(float)으로 명시적으로 변환하여 출력한다.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a / b);
    }
}