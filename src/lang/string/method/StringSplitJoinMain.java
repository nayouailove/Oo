package lang.string.method;

import static java.lang.String.join;

public class StringSplitJoinMain    {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split
        String[] split1 = str.split(",");
        for (String s : split1)
        {System.out.println(s);}

        //join
        String joinedStr = join(",","apple","banana","orange");
        System.out.println(joinedStr);

        String j = join(",",split1[0],split1[1]);
        System.out.println(j);

        //문자열 배열
        String result = join("-",split1);
        System.out.println("배열 연합 :"+result);


        }
}
