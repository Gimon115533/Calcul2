package CalOP;

public class CalculatorOP {
    private double x;//первое число
    private double y;//второе число
    private String z;//вид оперции
    double rez;//результат

    public CalculatorOP(double x, double y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getRez() {
        rez = rezMet();
        return rez;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double rezMet() {
        switch (z) {
            case "+":
                rez = x + y;
                break;
            case "-":
                rez = x - y;
                break;
            case "/":
                if (y!=0) {
                    rez = x / y;
                } else {
                    System.out.println("На 0 делить нельзя");
                }
                break;
            case "*":
                rez = x * y;
                break;
            default:
                System.out.println("Вы ввели не верное значение: " + z);
        }
        return rez;
    }
}