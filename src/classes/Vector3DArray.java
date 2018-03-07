package classes;

public class Vector3DArray {
    private Vector3D[] arr;

    Vector3DArray(int size) {                                       //конструктор по размеру
        this.arr = new Vector3D[size];
        for (int i = 0; i < size; i++)
            arr[i] = new Vector3D();
    }
    Vector3D get(int n) throws IllegalArgumentException {
        if (n < 0 || n >= this.arr.length)
            throw new IllegalArgumentException("n ne lejit v range.");
        return this.arr[n];
    }
    int length() { return arr.length; }
    void set(Vector3D v, int n) throws IllegalArgumentException {
        if (n < 0 || n >= this.arr.length)
            throw new IllegalArgumentException("n ne lejit v range.");
        arr[n] = v;
    }
    double maxLength() {
        double res = this.arr[0].length();
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i].length() > res)
                res = this.arr[i].length();
        }
        return res;
    }
    int find (Vector3D v) {                                   //поиск заданного вектора в массиве
        int i = 0;
        while (i < this.arr.length) {
            if (this.arr[i].equals(v)) {
                return i;
            }
            else i++;
        }
        return -1;
    }
    Vector3D sumOfAll() {
        Vector3D res = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            res = Vector3DProcessor.sum(res, this.arr[i]);
        }
        return res;
    }
    Vector3D linearCombination(double[] coefficients) throws IllegalArgumentException {
        Vector3D res = new Vector3D();
        if (coefficients.length != this.arr.length)  {
            throw new IllegalArgumentException("Kolichestvo coefficientov ne sovpadaet s kolichestvom vectorov\n");
        }
        for (int i = 0; i < this.arr.length; i++)
                res = Vector3DProcessor.sum(res, new Vector3D(
                        coefficients[i] * this.arr[i].getX(),
                        coefficients[i] * this.arr[i].getY(),
                        coefficients[i] * this.arr[i].getZ()
                ));
        return res;
    }
    Point3D[] movePoint (Point3D p) {                    /*метод, который получает на вход точку P (типа Point3D)
                                                                    и вычисляет массив точек, каждая из которых – результат
                                                                    сдвига точки P, на соответствующий вектор.*/
        Point3D[] res = new Point3D[this.arr.length];
        for (int i = 0; i < this.arr.length; i++)
            res[i] = new Point3D(                                   //на i-тое место результирующего массива записываем
                    p.getX() + this.arr[i].getX(),               //новую точечку полученную из исходной сдвигом
                    p.getY() + this.arr[i].getY(),               //на вектор
                    p.getZ() + this.arr[i].getZ()
                    );
        return res;
    }
}
