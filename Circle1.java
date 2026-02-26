public class Circle1 extends Shape {
    private double radius;

    // No-arg constructor
    public Circle1() {
        super();
        this.radius = 1.0;
    }

    // Constructor radius saja
    public Circle1(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor lengkap
    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method tambahan
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString
    @Override
    public String toString() {
        return "A Circle with radius=" + radius +
               ", which is a subclass of " + super.toString();
    }
} 
    

