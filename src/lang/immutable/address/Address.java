package lang.immutable.address;

public class Address {
    public String value;

    public Address(String value) {
        this.value = value; //생성자
    }



    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "value='" + value + '\'' +
                '}';
    }
}

