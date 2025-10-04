package lang.immutable.address.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate changeYear(int year) {
        return new MyDate(year, this.month, this.day);
    }

    public MyDate changeMonth(int month) {
        return new MyDate(this.year, month, this.day);
    }

    public MyDate changeDay(int day) {
        return new MyDate(this.year, this.month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
