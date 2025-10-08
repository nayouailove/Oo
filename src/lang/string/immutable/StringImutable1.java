package lang.string.immutable;

public class StringImutable1 {
    public static void main(String[] args) {
        String str1 = "Hello";//new로 새
//        str.concat("!");
        String str2 = str1.concat("d");
        System.out.println(str1 );
    }
}
