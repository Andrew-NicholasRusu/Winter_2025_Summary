class Circle extends GeometricShape {
    private double radius;

    public Circle(String outlineColor, double radius) {
        super(outlineColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle - " + super.toString() + ", Radius: " + radius + ", Area: " + calcArea() + ", Perimeter: " + calcPerimeter();
    }
}