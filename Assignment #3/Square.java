class Square extends Rectangle {
    public Square(String outlineColor, double side) {
        super(outlineColor, side, side);
    }

    @Override
    public String toString() {
        return "Square: Side = " + height + ", Outline Colour: " + outlineColor;
    }
}
