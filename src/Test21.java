import java.util.Arrays;
import java.util.Scanner;

public class Test21 {

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
        for (int i = 1; i <= a; i++) {
            System.out.println(i + "번째 행에 입력할 문자 3개를 입력하고 enter치세요");
            strAr[i] = sc.next();
            for (int j = 1; j <= b; j++) {
                arr[i][j] = strAr[i].charAt(j);
            }
        }

        for (int c = 1; c <= b; c++) {
            System.out.println(Arrays.toString(arr[c]));
        }
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
