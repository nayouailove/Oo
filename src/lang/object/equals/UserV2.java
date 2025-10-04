package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    //id가 같으면 논리적으로 같은 객체이다. ==, equality
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj; //user라는 변수에 접근하기 위해서 ..
//        //캐스팅을 하는 이유는 obj는 id필드를 모른다. 부모니까.
//        //equals()는 Object타입을 매개변수로 사용한다. 따라서 객체의 특정 값을 사용하려면 다운 캐스팅이 필요하다.
//        return id.equals(user.id); //id == user.id이거 하는거
//        //this.id.equals(user.id)
//    }
    //횬재 인스턴스(this)에 있는 id문자열과 비교 대상으로 넘어온 객체의id문자열ㅇ르 비교환다.

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);//  == this.id.equals(user.id)
    } //논리적 동등성을 위한 메소드.
}
