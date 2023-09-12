public class Test03 {
    public static void main(String[] args) {

        int age = 54;
        if (age > 10 && age < 20) {
            age = 10;
        } else if (age >= 20 && age < 30) {
            age = 20;
        } else if (age >= 30 && age < 40) {
            age = 30;
        } else {
            System.out.println("연령대를 다시 적어주세요");
            System.exit(0);
        }
        switch (age) {
            case 10:
                System.out.println("10대입니다.");
                break;
            case 20:
                System.out.println("20대입니다.");
                break;
            case 30:
                System.out.println("30대입니다.");
                break;
            default:
                System.out.println("뭐,,,");
                break;
        }

    }
}