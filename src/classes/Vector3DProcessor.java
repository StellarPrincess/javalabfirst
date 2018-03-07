package classes;

public class Vector3DProcessor {

    public static Vector3D sum(Vector3D v1, Vector3D v2) {                 //сумма двух векторов
        return new Vector3D(
                v1.getX() + v2.getX(),
                v1.getY() + v2.getY(),
                v1.getZ() + v2.getZ()
        );
    }
    public static Vector3D diff(Vector3D v1, Vector3D v2) {                 //разность
        return new Vector3D(
                v1.getX() - v2.getX(),
                v1.getY() - v2.getY(),
                v1.getZ() - v2.getZ()
        );
    }
    public static double scalarProduct(Vector3D v1, Vector3D v2) {          //скалярное проивзедение
        return  v1.getX() * v2.getX() +
                v1.getY() * v2.getY() +
                v1.getZ() * v2.getZ();
    }
    public static Vector3D vectorProduct(Vector3D v1, Vector3D v2) {        //векторное произведение
        return new Vector3D(
                v1.getY() * v2.getZ() - v1.getZ() * v2.getY(),
                v1.getZ() * v2.getX() - v1.getX() * v2.getZ(),
                v1.getX() * v2.getY() - v1.getY() * v2.getX()
        );
    }
    public static boolean isCollinear(Vector3D v1, Vector3D v2) {
        Vector3D newVector = vectorProduct(v1, v2);
        return (newVector.getX() == 0) &&
                (newVector.getY() == 0) &&
                (newVector.getZ() == 0);
    }
}


