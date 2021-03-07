public class square implements Polygon{
    public float width;
    private int sides = 4;

    public square (width) {
        this.width = width;
    }

    public float getArea () {
        return Math.pow(this.width, 2);
    }

    public int getSides() {
        return sides;
    }
}