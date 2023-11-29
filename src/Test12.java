public class Test12 {
    public static void main(String[] args) {

        // 1. 변수 선언
        int num = 1;

        // 2. 반복문 돌면서 홀, 짝 체크

        while (num < 30) {
            // 반복문 돌면서 홀/짝인지 체크 -> 출력
            if (num % 2 == 0) {
                System.out.println("짝수!! + " + num);
            } else {
                System.out.println("홀수!! + " + num);
            }
            // 반복문 빠져나오기 위해서 num 값을 반복마다 증가
            num++;
        }
    }
}
