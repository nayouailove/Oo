package lang.wrapper;

public class autoboxingMain {
    public static void main(String[] args) {
        //primitive -> wrapper
        int value=7;
        Integer boxedValue = Integer.valueOf(value);
        //기본형 7을 Integer박스에 넣어서 객체화 시킴
        //기본형을 wrapping해서 넣을 거야.

        //autoBoxing :
        //Integer boxedValue = value;

        //wrapper --> primitive
        int non = boxedValue.intValue();

        //int non = boxedValue;

        System.out.println("non: " + non);
        System.out.println("boxedValue: " + boxedValue);
        System.out.println("equls :"+boxedValue.equals(non));
        //equals는 참조형에서만 쓸 수 있다.
    }
}
