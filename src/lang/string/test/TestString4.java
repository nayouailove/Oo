package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
//        String filename = str.split("."); : split은 그냥 .앞뒤로 배열형태로 반환
        int extIndex = str.indexOf(ext);
        String filename = str.substring(0,extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + ext);
    }
}
