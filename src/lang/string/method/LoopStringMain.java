package lang.string.method;

public class LoopStringMain   {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += "hello java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result : " + result);
        System.out.println("time : " + (endTime - startTime)+"ms");
    }
}
