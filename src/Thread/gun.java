package Thread;

public class gun {

    public static final gun PAZARTESI = new gun(1);
    public static final gun SALI = new gun(2);
    public static final gun CARSAMBA = new gun(3);
    public static final gun PERSEMBE = new gun(4);
    public static final gun CUMA = new gun(5);
    public static final gun CUMARTESI = new gun(6);
    public static final gun PAZAR = new gun(7);
    private int day;

    public gun(int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
