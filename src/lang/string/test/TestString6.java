package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String ori = "    dd is died   ";
        String result = ori.trim(); //=strip()
        System.out.println(result);

        String input = " hello hahaha l hate you";
        String result2 = input.replace("hate", "love");
        System.out.println(result2);

        String email = "hahaha@gmail.com";
        String[] parts = email.split("@");
        String idPart = parts[0];
        String emailPart = parts[1];
        System.out.println("ID :" + idPart);
        System.out.println("Email :" + emailPart);

//        int idIndex = email.indexOf("@");
//        String id = email.split(idIndex); //split은 string타입만 받음
//
//        String result3 = email.split("@"); 배열로 받아야함.
//        System.out.println(result3);
        //substring에 시작 인덱스만 넣으면 끝까지 감.
    }
}
