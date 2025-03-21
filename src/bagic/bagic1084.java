package bagic;

import java.util.Scanner;

public class bagic1084 {
    public static void main(String[] args) {
        /*
            빨강(red), 초록(green), 파랑(blue) 빛을 섞어
            여러 가지 빛의 색을 만들어 내려고 한다.

            빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
            (빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)

            주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
            총 가짓 수를 계산해보자.


            예시
            int i, j, k, c=0;
            int r, g, b;
            scanf("%d%d%d”, &r, &g, &b);

            for(i=0; i<r; i++)
              for(j=0; j<g; j++)
                for(k=0; k<b; k++)
                {
                  printf("%d %d %d\n", i, j, k);
                  c++;
                }

            printf("%d ", c);


            빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
            예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.


            만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
            줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                for(int k = 0; k < c; k++) {
                    cnt++;
                    System.out.println(i + " " + j + " " + k + " ");
                }
            }
        }
        System.out.print(cnt);
    }
}