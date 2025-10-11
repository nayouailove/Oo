package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //박싱
        Integer integerObj = Integer.valueOf(10); //박싱 : 기본형을 넣어서 Integer로
        //문자열 폴에 -128~127 자주 사용하는 숫자값 재사용, 불변

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger: " + newInteger);//newInteger.toString()해서 String으로 출력함
        System.out.println("integerObj: " + integerObj);
        System.out.println("longObj: " + longObj);
        System.out.println("doubleObj: " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); //기본형으로 꺼냄
        //integerObj에는 객체가 들어있음
        System.out.println("intValue : " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue : " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); //다른 참조
        System.out.println("equals: " + newInteger.equals(integerObj));
        //내부에 있는 값으로 비교
    }
}//==는 참조형 비교이다.
//만약 newInteger도 valueOF로 꺼낸다면 캐싱된 값 꺼내기 때문에 TRUE임
