package bagic;

import java.util.Scanner;

public class bagic1077 {
    public static void main(String[] args) {
        /*
            정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.

            for((반복전 실행/준비 내용); (조건 검사 내용); (한번 실행한 후 처리할 작업))
            { //코드블록
              ...
            }
            반복 구조를 사용하자.

            참고
            for((반복전 실행/준비내용); (조건 검사 내용); (한번 실행한 후 처리할 작업))
            { //코드블록
              ...
            }
            구조는 while( ) {...}, do {...} while( ); 구조와 같이
            어떤 작업을 반복적으로 수행할 때 가장 일반적으로 많이 사용하는 구조이다.

            while( ) {...}, do {...} while( ); 과 다르게
            반복을 위한 초기화/준비, 조건검사, 반복 후 증감 등을 한 번에 작성할 수 있다.

            for( ... ) 를 사용할 때에는 반복 실행되는 과정에 대해 정확히 이해할 필요가 있는데.
            1. 반복 전 실행 수행(1번만 실행된다.)
            2. 조건검사
            3. 조건이 참이면 코드블록 실행
            4. 코드블록 실행 후 증감 또는 처리 : 한 번 반복 후 처리
            5. 조건검사
            6. 조건이 참이면 코드블록 실행
            ...
            의 순서로 처리된다.

            예시
            int i, n;
            scanf("%d", &n);
            for(i=0; i<=n; i++)
            {
              printf("%d ");
            }
            printf("\n");

            ** 일반적으로 반복 횟수를 카운트하면서 비교하기 위해 i 변수를 많이 사용한다.
              i : index, iterator ?


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=0; i<=a; i++) {
            System.out.println(i);
        }
    }
}