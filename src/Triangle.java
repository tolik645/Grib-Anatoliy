public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Сторони трикутника мають бути більшими за нуль.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Трикутник із такими сторонами не існує.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
