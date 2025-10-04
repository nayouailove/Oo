package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();
//        dog.sound();
//        Object o = dog; //부모는 자식을 담을 수 있다.
        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.sound(); 컴파일 오류, Object는 sound()가 없다.
        //객체에 맞는 다운 캐스팅 필요
        //오브젝트는 개가 뭔지 차가 뭔지 모름 ( 부모니까 ) 위에 있으니까

        if( obj instanceof Dog dog){//다운캐스팅으로 해서 obj가 Dog타입이 됨
            dog.sound(); //((Dog)dog).sound - 위에서 선언할때 이미 함.
        } else if(obj instanceof Car car){
            car.move();
        }
    }
}
