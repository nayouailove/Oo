package lang.immutable.address;

public class MemberV1Main {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원a", address);
        MemberV1 memberB = new MemberV1("회원b", address);

        //회원A,B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원 B의 주소를 부산으로 변경해야함
//        Address address1 = memberB.getAddress();
//        address1.setValue("부산");
        //---> 축약 버전
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA); //A도 같이 바뀌어버림..
        System.out.println("memberB = " + memberB);
    }
}
