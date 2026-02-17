abstract class GeometricShape {

    protected String outlineColor;

    public GeometricShape(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Outline Color: " + outlineColor;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        GeometricShape shape = (GeometricShape) obj;
        return outlineColor.equals(shape.outlineColor);
    }
}

