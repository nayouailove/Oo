package lang.immutable.address.test;

public class ImmutableMyDateMain2 {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1); //x001
        ImmutableMyDate date2 = date1; //같은 날짜를 보게한다.x001
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("2025->data1");
      ImmutableMyDate date3 = date1.withYear(2025);

//        date1 = date1.withYear(2025); // date1만 x002를 갖게 된다.

        System.out.println(date1);
        System.out.println(date2);
//        System.out.println(date3);
    }//3으로 받을 이유가 없는게 이미 with할 때 새로운 참조값이 생성됨. 그걸 data1에 복사해서 넣으면 됨.
}
