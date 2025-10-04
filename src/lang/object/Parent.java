package lang.object;

//부모가 없으면 묵시적으로 Object클래스를 상속받는다.
public class Parent extends Object {

    public void parentMethod() {
        System.out.println("Parent.parentMethod"); //soutm하면 메서드이름까지 찍어준다.

    }
} //최상위부모는 오브젝트예요.
