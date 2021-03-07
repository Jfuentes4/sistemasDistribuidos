public class Rectangle {
    public int width;
    public int heigth;
    private int sides = 4;

    public Rectangle (width, heigth) {
        this.width = width;
        this.heigth =  heigth;
    }

    public float getArea () {
        return this.width * this.heigth;
    }

    public int getSides() {
        return sides;
    }
}