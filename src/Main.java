public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        int d = calc.multiply.apply(3, -4);
        int f = calc.ads.apply(d);
        int g = calc.pow.apply(f);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(f);
        calc.println.accept(g);
        calc.bolPrintln.accept(calc.isPositive.test(d));
        calc.bolPrintln.accept(calc.isPositive.test(f));
    }
}