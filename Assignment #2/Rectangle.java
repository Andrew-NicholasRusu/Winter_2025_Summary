class Rectangle extends GeometricShape {
    private double height;
    private double width;

    public Rectangle(String outlineColor, double height, double width) {
        super(outlineColor);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle - " + super.toString() + ", Height: " + height + ", Width: " + width + ", Area: " + calcArea();
    }
}