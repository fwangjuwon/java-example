import java.util.ArrayList;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        // 배열의 용도와 배열을 선언하는 방법에 대해서 작성해보시오.
        // 이 문제는 배열의 개념과 역할 그리고 배열을 사용하기 위해 선언하는 방법에 대해서 아는지를 묻는 문제이다.

        // [1] : 배열이란? --> 역할과 용도.. 필요성.
        // 자동차 판매 회사에서 영업사원의 판매 실적을 저장한다고 할 때 배열이 없으면 변수를 사용하여 저장할 것이다.
        // 영업사원이 10명 정도라면 모르겠지만, 100명이 넘는다면 변수를 일일이 선언하고 영업사원의 판매실적을 저장하는 것이 상당히 번거롭다.
        // 그러나 배열을 이용하면 일일이 변수를 선언할 필요없이 한방에 선언이 되고, 초기화 값도 한방에 셋팅해준다.
        // 즉, 배열은 동일한 데이터 타입의 값들을 하나의 배열명으로 저장시킬 수 있는 아주 편리한 자료구조이다.

        // [2] : 배열의 선언
        // 데이터타입[] 배열명 = new 데이터타입[배열크기];
        // 데이터타입 배열명[] = new 데이터타입[배열크기];

        // [3] : 배열의 선언 --> 배열 크기 지정 --> 배열 공간의 값은 자동으로 초기화 셋팅 됨(정수형 : 0, 실수형 0.0)

        // [4] : 자동차 판매 회사의 영업사원 100명에 대한 영업실적을 저장하는 배열 선언 및 크기 지정 --> 2가지 방식

        // [4-1] : 첫 번째 방식
        int[] sales_table = new int[100];

        // [4-2] : 두 번째 방식
        double[] sales_table2;
        sales_table2 = new double[100];

        for (int i = 0; i < sales_table.length; i++) {
            sales_table[i] = i;
        }

        System.out.println(sales_table.length);

        // [4-3]: 세 번째 방식
        List<String> arr = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            arr.add("나는!! " + i + "번째 인간이다!!");
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        List<Integer> arrInt = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrInt.add(i);
        }

        for (int i = 0; i < arrInt.size(); i++) {
            System.out.println(arrInt.get(i));
        }

        // 선언한 배열 사용하기
        System.out.println(sales_table[99]); // 0
        System.out.println(sales_table2[0]); // 0.0

    }
}
