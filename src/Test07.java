public class Test07 {
    public static void main(String[] args) {

        // 크기 5의 정수형 배열을 선언하고 55, 88, 60, 100, 90 으로 각 요소의 값을 초기화하시오.
        // 이 문제는 배열 선언과 동시에 특정 값으로 초기화 할 수 있는지를 묻는 문제이다.
        // 이때, 2가지 방식으로 초기화를 할 수 있는데 모두 작성해보시오.
        // 아래 코드중 틀린 것을 찾아 말해보시오

        int[] arr = new int[] { 55, 88, 60, 100, 90 };
        System.out.println(arr[3]);
        System.out.println(arr.length);

        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println(arr2[2]);

        // 이렇게 하면 안됨!!
        // int[] arr3;
        // arr3={25,24,15,36,37};
        // System.out.println(arr3);
    }
}
