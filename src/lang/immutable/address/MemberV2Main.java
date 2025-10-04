package lang.immutable.address;

public class MemberV2Main {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원a", address);
        MemberV2 memberB = new MemberV2("회원b", address);

        //회원A,B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원 B의 주소를 부산으로 변경해야함
//        Address address1 = memberB.getAddress(); : 컴파일 오류
//        address1.setValue("부산");
        //---> 축약 버전
//        memberB.getAddress().setValue("부산");
//        System.out.println("부산 -> memberB.address");
//        System.out.println("memberA = " + memberA); //A도 같이 바뀌어버림..
//        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 바꿔야함. final value; 이라서
        memberB.setAddress(new ImmutableAddress("부산"));
        //address가 불변이지 memberB는 불변이 아님(memberv2)
        //새로운 주소 객체를 만들어서 전달한다.
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
