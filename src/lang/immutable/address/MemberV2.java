package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }//생성자는 반환타입이 없다.

    public ImmutableAddress getAddress(){
        return address;
    }

    public void setAddress(ImmutableAddress address){
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
