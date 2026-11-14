public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3.0),
                new Square(4.0),
                new Triangle(3.0, 4.0, 5.0)
        };
        printTotalArea(shapes);
    }
    public static void printTotalArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            System.out.println("Масив фігур порожній. Сумарна площа: 0.00");
            return;
        }
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", totalArea);
    }
}
