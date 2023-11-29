import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("숫자 입력해라");
            a[i] = sc.nextInt();
        }
        System.out.println("궁금한 인덱스 번호를 입력하세요");
        int c = sc.nextInt();
        System.out.println(a[c]);
    }
}