package classes;

public class Point2D {
    private double x, y;
    Point2D () {
        this.x = 0;
        this.y = 0;
    }
    Point2D (double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    void setX (double x) {
        this.x = x;
    }
    void setY (double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point2D point2D = (Point2D) o;

        if (Double.compare(point2D.x, x) != 0) return false;
        return Double.compare(point2D.y, y) == 0;
    }


}
