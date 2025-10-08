package lang.string.method;

public class StringChangedMain1 {
    public static void main(String[] args) {
        String str =  "Hello, Java! Welcome to Java";
        System.out.println("인덱스 7부터의 부분 문자열"+str.substring(7));
        System.out.println("index 7-17 부분 문자열"+str.substring(7,17));
        System.out.println("문자열 결합 "+str.concat("!!!"));

        System.out.println("java를 world로 대체"+str.replace("Java", "World"));
        System.out.println("첫번째 java만 world로 대체 "+str.replaceFirst("Java", "World"));


        String strWithSpaces = " Java Programming   ";

        System.out.println("소문자로 변환 : "+strWithSpaces.toLowerCase());
        System.out.println("소문자로 변환 : "+strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim)"+strWithSpaces.trim());
        //문자열 양쪽 끝의 공백을 제거한다. 단순 whitespace만 제거할 수 있다.
        System.out.println("공백 제거(strip)"+strWithSpaces.strip());
        //whitespace와 유니코드 공백을 포함해서 제거한다.
        System.out.println("앞   공백 제거(strip)"+strWithSpaces.stripLeading());
        System.out.println("뒷공백 제거(strip)"+strWithSpaces.stripTrailing());
    }
}
