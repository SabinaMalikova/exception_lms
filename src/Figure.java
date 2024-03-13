import java.util.Scanner;

public class Figure {

    private double length;
    private double width;
    private double height;
    private double radius;

    public Figure() {
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getCorrectValues(Scanner scanner, String valueName) throws MyException {
        System.out.print("Введите " + valueName + ": ");
        String digit = scanner.next();
        if (!digit.matches("\\d+")) {
            throw new MyException("Неверный формат данных. Введите положительное число.");
        }
        double value = Double.parseDouble(digit);
        if (value <= 0) {
            throw new MyException("Значение не должно быть отрицательным.");
        }
        return value;
    }


    public void parallelepiped(Scanner scanner) throws MyException {
        System.out.println("Введите длину, ширину и высоту параллелепипеда:");
        double length = getCorrectValues(scanner, "длину");
        double width = getCorrectValues(scanner, "ширину");
        double height = getCorrectValues(scanner, "высоту");

        double area = 2 * ((height * length) + (length * width) + (height * width));
        double volume = length * width * height;

        System.out.println("Площадь параллелепипеда: " + area);
        System.out.println("Объем параллелепипеда: " + volume);
    }

    public void cylinder(Scanner scanner) throws MyException {
        System.out.println("Введите радиус и высоту цилиндра:");
        double radius = getCorrectValues(scanner, "радиус");
        double height = getCorrectValues(scanner, "высоту");

        double area = 2 * Math.PI * radius * (height + radius);
        double volume = Math.PI * radius * radius * height;

        System.out.println("Площадь цилиндра: " + area);
        System.out.println("Объем цилиндра: " + volume);
    }


}
