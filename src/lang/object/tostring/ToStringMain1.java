package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object o = new Object();
        String s = o.toString();

        //toString() 반환값 출력
        System.out.println(s);
        //java.lang.Object : 클래스 정보
        //@부터는 인스턴스 s의 참조값

        System.out.println(o);

    }
}
