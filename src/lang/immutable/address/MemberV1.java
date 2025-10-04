package lang.immutable.address;

public class MemberV1 {

    private String name;
    private Address address;

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }//생성자는 반환타입이 없다.

    public Address getAddress(){
        return address;
    }

    public void setAddress(){
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
