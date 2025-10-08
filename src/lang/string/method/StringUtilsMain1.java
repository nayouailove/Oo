package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num =100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello World!";

        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 : " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("불리언의 문자열 값 : " + objString);

        //문자 + X -->문자
        String str2 = "" + num; //"100"이 됨
        System.out.println(str2);

        //toCharAraay 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자배열로 변환"+strCharArray.length);
        for (char c : strCharArray) {
            System.out.print(c);

        }
    }
}
