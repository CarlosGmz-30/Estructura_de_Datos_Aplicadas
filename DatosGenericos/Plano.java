package DatosGenericos;

public class Plano<T  extends Number> {
    private T maxX, minX, maxY, minY;

    public Plano(T maxX, T minX, T maxY, T minY) {
        this.maxX = maxX;
        this.minX = minX;
        this.maxY = maxY;
        this.minY = minY;
    }

    public T getMaxX() {
        return maxX;
    }

    public void setMaxX(T maxX) {
        this.maxX = maxX;
    }

    public T getMinX() {
        return minX;
    }

    public void setMinX(T minX) {
        this.minX = minX;
    }

    public T getMaxY() {
        return maxY;
    }

    public void setMaxY(T maxY) {
        this.maxY = maxY;
    }

    public T getMinY() {
        return minY;
    }

    public void setMinY(T minY) {
        this.minY = minY;
    }

    @Override
    public String toString() {
        return "Plano [maxX=" + maxX + ", minX=" + minX + ", maxY=" + maxY + ", minY=" + minY + "]";
    }
    
    
}
