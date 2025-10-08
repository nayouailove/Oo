package lang.string.test;



public class TestStrint7 {
    public static void main(String[] args) {
        String str = "apple,banana,mango";
        //분리하기
        String[] str1 = str.split(",");
        for (String s : str1) {
            System.out.println(s);
        }
        // join
        String result = String.join("->",str1);

        String str3 = "babo is love";
//        String result2 = String.reverse(str3);
        String result2 = new StringBuilder(str3).reverse().toString();
        System.out.println(result2);

        //stringBuilder : 가변 String. 객체를 생성하지 않아도 된다.
        //메서드 체이닝하면 됨. 그러나 마지막에.toString();
        String resultex = new StringBuilder(str3).replace(2,4,"lo").toString();
        System.out.println(resultex);
        //balo is love ,
    }
}
