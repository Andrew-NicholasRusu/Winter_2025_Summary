class Square extends Rectangle
implements Drawable{
    public Square(String outlineColor, double side) {
        super(outlineColor, side, side);
    }

    @Override
    public String toString() {
        return "Square: Side = " + height + ", Outline Colour: " + outlineColor;
    }

    @Override
    public void Draw() {
        System.out.println("I am a square, the length of my sides are equal.");
    }

    @Override
    public Square clone() throws CloneNotSupportedException {
        return (Square) super.clone();
    }
}