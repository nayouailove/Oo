package lang.string.method;

public class StringCompareisonMain {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "hello, World";

        System.out.println("str1 equals str2 ="+str1.equals(str2));
        //                                      대소문자 다 같아야함
        System.out.println("str1 equals str2 ="+str1.equalsIgnoreCase(str2));
                                                //대소문자 무시

        System.out.println("'c' compareTo 'a' ="+"c".compareTo("a"));

        System.out.println("str1 compareTo str3 ="+str1.compareTo(str3));
        System.out.println("str1 compareTo str3 ="+str1.compareToIgnoreCase(str2));
        System.out.println("str start with Hello= "+str1.startsWith("Hello"));
        System.out.println("str ends with Hello= "+str1.endsWith("world"));
    }
}
