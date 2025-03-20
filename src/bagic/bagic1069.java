package bagic;

import java.util.Scanner;

public class bagic1069 {
    public static void main(String[] args) {
        /*
            평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

            평가 내용
            평가 : 내용
            A : best!!!
            B : good!!
            C : run!
            D : slowly~
            나머지 문자들 : what?


            참고
            조건/선택문을 복합적으로 구성해 출력할 수도 있지만,

            switch(정수값)
            {
              case 'A': //문자 'A'가 정수값 65('A'의 아스키 값)로 저장되기 때문에 가능하다.
                ...;
                break;
              case 'B':
                ...;
                break;
              case 'C':
                ...;
                break;
              default:
                ...;
            }

            위와 같은 switch( ) ... case... break; 제어문을 사용할 수 있다.

            ** break; 를 사용하지 않으면 이후의 명령들도 계속 실행된다.
            default: 는 제시된 case 를 제외한 나머지 모든 경우에 실행된다.
            switch( ) 에 주어지는 값은 “정수"값만 가능하며,
            문자도 아스키코드 정수값이기 때문에 가능하다.

         */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        switch (a) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;

        }


    }
}