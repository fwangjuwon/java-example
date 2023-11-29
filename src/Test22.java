import java.util.Arrays;
import java.util.Scanner;

public class Test22 {
    // 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
    // 이때, 중첩 반복문을 사용하여 출력도 같이 해보시오.

    // 행의 갯수를 입력하고 [Enter] 치세요 = 3
    // 열의 갯수를 입력하고 [Enter] 치세요 = 3
    // 1번째 행에 입력할 문자3개를 차례대로 입력하고 [Enter] 치세요 = ※＠★
    // 2번째 행에 입력할 문자3개를 차례대로 입력하고 [Enter] 치세요 = ○★※
    // 3번째 행에 입력할 문자3개를 차례대로 입력하고 [Enter] 치세요 = ＠○♨

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("행을 입력하시오");
        int a = sc.nextInt();
        System.out.println("열을 입력하시오");
        int b = sc.nextInt();

        char[][] arr = new char[a][b];
        // 크기를 a만큼만 해주면 되는 이유? 어짜피 사용자가 입력하는 값은
        // 안쪽 for문을 돌면서 2차원 배열에 입력되기 때문이다.
        String[] strAr = new String[a];

        // 2차원 배열요소 -> 사용자가 입력하는값으로 세팅
        for (int i = 0; i < a; i++) {
            System.out.println("1번째 행에 입력할 문자 5개를 입력하고 enter치세요");
            strAr[i] = sc.next();
            for (int j = 0; j < b; j++) {
                arr[i][j] = strAr[i].charAt(j);
            }
        }
        for (int c = 0; c <= a; c++) {
            System.out.println(Arrays.toString(arr[c]));
        }
    }
}
