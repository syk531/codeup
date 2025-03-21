package bagic;

import java.util.Scanner;

public class bagic1073 {
    public static void main(String[] args) {
        /*
            정수가 순서대로 입력된다.
            -2147483648 ~ +2147483647, 단 개수는 알 수 없다.

            0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.


            if(조건)
            { //코드블록
              ...;
            }
            구조를 사용하면 주어진 조건이 참인 경우만 코드블록 부분이 실행된다.

            비슷하게 어떤 조건에 따라 반복적으로 실행시킬 때에는 if를 while로 바꾸기만 하면

            while(조건)
            { //코드블록
              ...;
            }

            와 같은 방법으로 코드블록의 내용을 반복적으로 수행시킬 수 있다.

            수행되는 과정은
            1. 먼저 조건을 검사한다.
            2. 코드블록을 실행한다.
            3. 다시 조건을 검사한다.
            4. 코드블록을 실행한다.
            ...

            와 같이 주어진 조건이 참인 동안 계속적으로 반복 실행한다.
            이렇게 while(조건){...}을 이용하면 goto 명령을 사용하지 않고
            반복을 만들어낼 수 있다.

            예시
            int n=1; //처음 조건 검사를 넘어가기 위해 0이 아닌 값 입력
            while(n!=0)
            {
              scanf("%d", &n);
              printf("%d", n);
            }

         */
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();

            if(a == 0) break;
            System.out.println(a);
        }
    }
}