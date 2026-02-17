public class Rectangle extends GeometricShape {
    protected double height;
    protected double width;

    public Rectangle(String outlineColor, double height, double width) {
        super(outlineColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.width, width) == 0 && Double.compare
                (rectangle.height, height) == 0;
    }

    @Override
    public String toString() {
        return "Rectangle: Height = " + height
                +", Width = " + width + ", " + super.toString();
    }

    @Override
    public void Draw() {
        System.out.println("I am a rectangle, and I have different lengths for my height and width.");
    }
    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}