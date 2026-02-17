import java.util.Date;


abstract class GeometricShape implements Drawable, Cloneable {

    protected String outlineColor;

    private Date creationDate;

    public GeometricShape(String outlineColor) {
        this.outlineColor = outlineColor;
        this.creationDate = new Date();
    }

    public abstract double calcArea();

    public void setCreationDate(Date date){
        this.creationDate = new Date(date.getTime());
    }

    public Date getCreationDate() {
        return new Date (creationDate.getTime());
    }

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

    @Override
    public GeometricShape clone() throws CloneNotSupportedException {
        GeometricShape copy = (GeometricShape) super.clone();
        copy.creationDate = new Date (this.creationDate.getTime());
        return copy;
    }
}