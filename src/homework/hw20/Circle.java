package homework.hw20;

public class Circle<r> {
    private static final double pi = 3.14;
    private static double r;

    public static void setR(double r) {
        Circle.r = r;
    }

    public double S(){
        return pi*r*r;
    }

    public static double C(){
        return 2*r*pi;
    }
}
