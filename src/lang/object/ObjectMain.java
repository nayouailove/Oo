package lang.object;

public class ObjectMain {
    
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
    //toString()은 Object 클래스의 메서드
        System.out.println(string);
        //객체에 대한 정보를 반환해준다.
    }
}
