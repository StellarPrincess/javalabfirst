package classes;

class Vector3D {
    private double x, y, z;

    Vector3D() { this.x = this.y = this.z = 0; }                //создает нулевой вектор
    Vector3D(double x, double y, double z) {                    //конструктор по коордианатам
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Vector3D(Point3D p1, Point3D p2) {                          //конструктор по двум точкам
        x = p2.getX() - p1.getX();
        y = p2.getY() - p1.getY();
        z = p2.getZ() - p1.getZ();
    }

    @Override
    public boolean equals(Object o) {                           //проверка равенства с заданным вектором
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector3D vector3D = (Vector3D) o;

        if (Double.compare(vector3D.x, x) != 0) return false;
        if (Double.compare(vector3D.y, y) != 0) return false;
        return Double.compare(vector3D.z, z) == 0;
    }

    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }
    double getZ() { return this.z; }
    void setX(double x) { this.x = x; }
    void setY(double y) {
        this.y = y;
    }
    void setZ(double z) { this.z = z; }
    double length() { return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z); }
    @Override
    public String toString() { return ("(" + this.x + ", " + this.y + ", " + this.z + ")"); }
}
