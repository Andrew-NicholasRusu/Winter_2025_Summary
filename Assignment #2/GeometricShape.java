abstract class GeometricShape {
    protected String outlineColor;

    public GeometricShape(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    public String getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Outline Color: " + outlineColor;
    }
}