package lang.object.poly;

public class ObjectPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object ob = new Object();

        Object[] obs = {dog, car, ob};
//        Object[] obs = new Object[3]
        //obs[]={dog,,,,}

        size(obs);
    }

    private static void size(Object[] obs) {
        System.out.println("전달된 객체의 수는" +obs.length);
    }
}
