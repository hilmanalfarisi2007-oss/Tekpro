public class circle {

    private double radius;
    private String color;

    // Constructor default
    public circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor dengan radius saja
    public circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor dengan radius dan color
    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
