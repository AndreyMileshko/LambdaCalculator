import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (a, b) -> a + b;
    public BinaryOperator<Integer> minus = (a, b) -> a - b;
    public BinaryOperator<Integer> multiply = (a, b) -> a * b;
    public BinaryOperator<Integer> divide = (a, b) -> a / b;
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> ads = x -> x < 0 ? x * -1 : x;
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;
    public Consumer<Boolean> bolPrintln = System.out::println;
}
