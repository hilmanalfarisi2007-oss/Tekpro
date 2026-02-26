// Square.java
public class Square extends Rectangle {

    // No-arg constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor side
    public Square(double side) {
        super(side, side);
    }

    // Constructor lengkap
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter khusus side
    public double getSide() {
        return getWidth();
    }

    // Setter khusus side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth dan setLength
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Tidak perlu override getArea() dan getPerimeter()
    // karena sudah benar dari Rectangle

    @Override
    public String toString() {
        return "A Square with side=" + getSide() +
               ", which is a subclass of " + super.toString();
    }
}