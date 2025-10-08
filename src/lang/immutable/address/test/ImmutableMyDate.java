package lang.immutable.address.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;// this로 유일무이하게month의 값 한번 설정할 수 있다.
    }

    public ImmutableMyDate withYear(int newyear) {
        return new ImmutableMyDate(newyear, this.month, this.day);
    } //set : 기존 값을 바꾸낟.
    //with : 기존 값을 유지한 상태로 새로운 값을 반환한다.

    public ImmutableMyDate withMonth(int newmonth) {
        return new ImmutableMyDate(year, newmonth, day);
    }

    public ImmutableMyDate withDay(int newday) {
        return new ImmutableMyDate(year, month, newday);
    }
    //this로 하면 현재 객체 인스턴스를 가리킴. 현재 저장되어있는 객체의 값을 사용하게 되는거임.
    //불변객체이므로 새로운 객체를 만들어야함. this로 원래 애를 표현할 필요가 없음.

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
