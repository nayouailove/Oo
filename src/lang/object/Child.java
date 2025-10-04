package lang.object;

public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
} //명시적으로 상속받은 것이 있다면 오브젝트 상속 안받음, 아무것도 없으면 오브젝트 상속임.
