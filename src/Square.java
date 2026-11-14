public class Square implements Shape {
    private final double side;
    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона квадрата має бути більшою за нуль.");
        }
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
