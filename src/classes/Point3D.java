package classes;

class Point3D {                                         //1. Разработайте класс Point3D (точка в трехмерном пространстве).
    private double x, y, z;                             //Точка хранится в виде набора декартовых координат. Методы:

    Point3D() {
        this.x = this.y = this.z = 0;                             //конструктор по умолчанию
    }
    Point3D(double x, double y, double z) {                       //конструктор по координатам
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {                             //проверка двух точек на равенство
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;

        Point3D point3D = (Point3D) o;

        if (Double.compare(point3D.getX(), getX()) != 0) return false;
        if (Double.compare(point3D.getY(), getY()) != 0) return false;
        return Double.compare(point3D.getZ(), getZ()) == 0;
    }

    double getX() { return this.x; }
    double getY() { return this.y; }
    double getZ() { return this.z; }
    void setX(double x) { this.x = x; }
    void setY(double y) { this.y = y; }
    void setZ(double z) { this.z = z; }

    @Override
    public String toString() { return ("(" + this.x + ", " + this.y + ", " + this.z + ")"); }
}
