import java.util.Objects;

class Circle extends GeometricShape {
    private double radius;

    public Circle(String outlineColor, double radius) {
        super(outlineColor);
        this.radius = radius;
    }

    public double calcPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0 && Objects.equals(outlineColor, other.outlineColor);
    }

    @Override
    public String toString() {
        return "Circle: Radius = " + radius + super.toString();
    }
}