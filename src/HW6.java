import java.util.Arrays;

public class HW6 {
    /*
Написать метод quadraticEq, который принимает три дробных числа a,b,c как параметры
и вычисляет корни квадратного уравнения
Учесть, что корней может не быть, что их может быть 1 или 2
Результат "собрать" в массив дробных чисел
Например, параметры 1 2 1 дадут массив = {-1}, потому что a*x*x + b*x + c = 0
А параметры 1 7 12 дадут массив = {-3, -4}
 */
    double a;
    double b;
    double c;

    static void quadraticEq (double a, double b , double c){
        double dis = b * b - 4 * a * c;
        double [] quadr;
        if (dis > 0){
            double x1 = (- b + Math.sqrt(dis))/2 * a;
            double x2 = (- b - Math.sqrt(dis))/2 * a;
            quadr = new double[]{x1,x2};
            System.out.println("Корни квадратного уравнения: " + Arrays.toString(quadr));
        } else if (dis == 0) {
            double x = (- b)/2 * a;
            quadr = new double[]{x};
            System.out.println("Корень квадратного уравнения: " + Arrays.toString(quadr));
        } else {
            System.out.println("Действительных корней нет");
        }
    }

    public static void main(String[] args) {
        quadraticEq(1,7,12);
        quadraticEq(1,2,1);
    }

}
