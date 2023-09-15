public class Test05 {
    public static void main(String[] args) {

        int time = 8;

        int text = time >= 12 ? time - 12 : time;
        String text2 = time >= 12 ? "오후 " : "오전 ";
        System.out.println("현재 시간은 " + text2 + text + "시 입니다.");

    }
}
