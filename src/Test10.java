public class Test10 {
    public static void main(String[] args) {
        // 1. 변수선언
        int time = 16;

        // 2. 삼항연산자
        int hour = time > 12 ? time - 12 : time;
        String ampm = time > 12 ? "오후" : "오전";
        System.out.println(ampm + hour + " 시 입니다.");
    }
}
