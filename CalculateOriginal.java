
/**
 * Created by Fil
 */
public class CalculateOriginal {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        double sum = first + second;
        double sub = first - second;
        double mul = first * second;
        double div = first / second;


        System.out.println("Сумма = " + sum);
        System.out.println("Вычитание = " + sub);
        System.out.println("Умножение = " + mul);
        System.out.println("Деление = " + div);
    }
}
