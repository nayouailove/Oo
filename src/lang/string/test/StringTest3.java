package lang.string.test;

public class StringTest3 {
    public static void main(String[] args) {
        String str = "hello.txt";
//        String result = str.indexOf(".txt");
        int index = str.indexOf(".txt");
        System.out.println("index = "+index);

        String str1 = str.substring(0,5);
        System.out.println("filename = "+str1);
        String str2 = str.substring(5,9);
        System.out.println("extName= "+str2);
    }

}
