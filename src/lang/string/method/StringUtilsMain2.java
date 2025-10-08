package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello Java!";

        //format메서드
        String format1 = String.format("num = %d, bool = %b, str = %s", num, bool, str);
        System.out.println(format1);

        String ss = String.format("숫자 :%.2f", 10.3456);
        System.out.println(ss);

        System.out.printf("숫자 :%.2f\n", 10.3456);
        //soutln

        //matches메서드
        String regex = "Hello (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가?"+str.matches(regex));

    }
}
