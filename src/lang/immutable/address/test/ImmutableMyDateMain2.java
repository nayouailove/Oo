package lang.immutable.address.test;

public class ImmutableMyDateMain2 {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024,1,1);
        MyDate date2 = date1; //같은 날짜를 보게한다.
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("2025->data1");
        date1.changeYear(2025);
        System.out.println(date1);
        System.out.println(date2);
    }
}
