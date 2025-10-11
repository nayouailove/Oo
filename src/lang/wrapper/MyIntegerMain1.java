package lang.wrapper;

public class MyIntegerMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(-0), new MyInteger(1)};
        System.out.println(findValue(intArr,-1));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger i : intArr) {
            if(i.getValue() == target){ //i는 객체고, target은 정수라서 int로 꺼내와야함
                //캡슐화 : 내부의 데이터를 노출하지 않고 메서드를 통해서만 접근하게한다.
                return i;
            }//return 값은 int, Integer가 아닌 MyInteger로 생성한 배열값이다.
        }return null;
    }
}
