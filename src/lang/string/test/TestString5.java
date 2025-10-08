package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count=0;


//        if (str.indexOf(key)!=-1) {
//            int result1 = str.indexOf(key);
//            String result0=str.substring(result1,-1);
//            count++;
//        }
//        System.out.println(count);
        int index = str.indexOf(key);
        while(index>=-0){
            index = str.indexOf(key, index+1);
            count++;
        }
        System.out.println(count);
    }//못찾으면 -1을 반환함
}
