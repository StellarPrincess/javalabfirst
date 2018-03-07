package classes;
public class Main {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2.5, 3.4),
                p2 = new Point3D(1, 2.5, 3.4),
                p3 = new Point3D(),
                p4 = new Point3D(6, -8.4, 9);

        Vector3D v1 = new Vector3D(),
                v2 = new Vector3D(-1, 2.7, -3.5),
                v3 = new Vector3D(p4, p2);

        Vector3DArray vArr = new Vector3DArray(3);
        System.out.println("Тестовые точки:");
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
        System.out.println("p4: " + p4.toString());
        System.out.println("Проверка на равенство:");
        if (p1.equals(p2)) {
            System.out.println("p1 = p2"); }
        else{
            System.out.println("p1 =/= p2"); }
        if (p1.equals(p3)) {
            System.out.println("p1 = p3"); }
        else{
            System.out.println("p1 =/= p3"); }
        if (p1.equals(p3)) {
            System.out.println("p1 = p3"); }
        else{
            System.out.println("p1 =/= p3"); }
        if (p1.equals(p4)) {
            System.out.println("p1 = p4"); }
        else{
            System.out.println("p1 =/= p4"); }


        System.out.println("Тестовые векторы:");
        System.out.println("v1: " + v1.toString());
        System.out.println("Длина v1: " + v1.length());
        System.out.println("v2: " + v2.toString());
        System.out.println("Длина v2: " + v2.length());
        System.out.println("v3: " + v3.length());
        System.out.println("Длина v3: " + v3.length());
        System.out.println("Проверка векторов на равенство:");
        if (v1.equals(v2)) {
            System.out.println("v1 = v2"); }
        else {
            System.out.println("v1 =/= v2");
        }
        if (v1.equals(v3)) {
            System.out.println("v1 = v3"); }
        else {
            System.out.println("v1 =/= v3");
        }
        if (v1.equals(v1)) {
            System.out.println("v1 = v1"); }
        else {
            System.out.println("v1 =/= v1");
        }

        System.out.println("Массив векторов перед заданием:");
        for (int i = 0; i < vArr.length(); i++)
            System.out.println (vArr.get(i).toString());
        vArr.set(v1, 0);
        vArr.set(v2, 1);
        vArr.set(v3, 2);
        System.out.println("Массив после задания векторов:");
        for (int i = 0; i < vArr.length(); i++)
            System.out.println(vArr.get(i).toString());
        System.out.println("Максимальная длина вектора в массиве: " + vArr.maxLength());
        System.out.println("Позиция v2 в массиве: " + vArr.find(v2));
        System.out.println("Позиция вектора с координатами (8,-7,-5): " + vArr.find(new Vector3D(8, -7, -5)));
        System.out.print("Сумма всех векторов в массиве: " + vArr.sumOfAll().toString());
        System.out.println("Линейная комбинация с коэффициентами {5, -8, 10}: ");
        double[] coeffs = {5, -8, 10};
        System.out.println(vArr.linearCombination(coeffs).toString());
        System.out.println("Массив сдвинутых точек от p1:");
        Point3D[] pArr = vArr.movePoint(p1);
        for (Point3D aPArr : pArr)
            System.out.println(aPArr.toString());
        System.out.println("Тестирование процессора векторов");
        System.out.println("Сумма v1 + vArr[2] = " + Vector3DProcessor.sum(v1, vArr.get(2)).toString());
        System.out.println("Разность v1 - vArr[2] = " + Vector3DProcessor.diff(v1, vArr.get(2)).toString());
        System.out.println("Скалярное произведение v2 * v3 = " + Vector3DProcessor.scalarProduct(v2, v3));
        System.out.println("Векторное произведение vArr[2] x vArr[1] = " + Vector3DProcessor.vectorProduct(vArr.get(1), vArr.get(2)).toString());
        System.out.println("Проверка на коллинеарность");
        System.out.println(
                Vector3DProcessor.isCollinear(
                new Vector3D(0, 0, 1),
                new Vector3D(0, 0, 5.5))
                ? "(0, 0, 1) коллинеарен (0, 0, 5.5)"
                : "(0, 0, 1) не коллинеарен (0, 0, 5.5)");
        System.out.println(Vector3DProcessor.isCollinear(new Vector3D(), new Vector3D(4, 0, 5.5))
                ? "(0, 0, 0) коллинеарен (4, 0, 5.5)"
                : "(0, 0, 0) не коллинеарен (4, 0, 5.5)");
        System.out.println(Vector3DProcessor.isCollinear(v2, v3)
                ? "v2 коллинеарен v3"
                : "v2 не коллинеарен v3");

        System.out.println("Линейная комбинация с коэффициентами {0, 1, 2, 3}: ");
        coeffs = new double[4];
        for (int i = 0; i < coeffs.length; i++)
            coeffs[i] = i;
        try {
            System.out.println(vArr.linearCombination(coeffs).toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Количество коэффициентов не совпадает с количеством векторов");
        }
    }
}