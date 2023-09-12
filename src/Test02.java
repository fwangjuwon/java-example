public class Test02 {
    public static void main(String[] args) {
        int total_score = 140;

        if (total_score >= 150) {
            System.out.println("매우 노력하세요. 재수강 대상자는 아닙니다");
            if (total_score >= 180) {
                System.out.println("잘 하셨네요..");
            }
        } else {
            System.out.println("걍못함 ㅎㅎㅎ");
        }
    }
}
