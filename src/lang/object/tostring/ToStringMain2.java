package lang.object.tostring;

public class ToStringMain2 {
    
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Dog dog1 = new Dog("멍멍이", 2);
        Dog dog2 = new Dog("멍멍이", 2);

        System.out.println("1. 단순 to string 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

         System.out.println("3.Object 다형성 사용 "); //static이라 바로 호출
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

//        System.out.println(System.identityHashCode(dog1));
        int i = System.identityHashCode(dog1);
        System.out.println(i);

        String ver16 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(ver16);

        System.out.println(System.identityHashCode(System.out));


    }
}
