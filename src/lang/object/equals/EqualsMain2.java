package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("IDDRAGON");
        UserV2 user2 = new UserV2("IDDRAGON");

        System.out.println("identity ==> " + (user1 == user2)); //동일성 : 참조값 비교
        System.out.println(user1.equals(user2));
        //직접 정의함. id가 같으면 같다.
    }
}
