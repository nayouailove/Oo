package lang.object.tostring;

public class  ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체정보 출력 : " + obj.toString();
        System.out.println(string);
    }
} //변경안해도 된다. 얘는 부모인 Object타입을 받으니까
//static에 대하여.
// 클래스 변수는 한개만 존재한다. 가장 긴 생명주기를 갖는다. 클래스 변수
//정적 메소드는 참조값 없이 호출된다.