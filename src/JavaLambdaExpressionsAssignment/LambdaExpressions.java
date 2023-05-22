package JavaLambdaExpressionsAssignment;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExpressions{
    public static void main(String[] args) {
        //part 1
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum = " + add.apply(4, 2));

        BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
        System.out.println("Difference = " + subtract.apply(3,2));

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Product = " + multiply.apply(6, 7));

        BiFunction<Integer, Integer, Integer> divide = (a, b) -> a / b;
        System.out.println("Quotient = " + divide.apply(4, 2));

        //part 2
        int x = 9;

        EvenNumber digit = a -> a % 2 == 0;

        boolean ans = digit.calculate(x);
        System.out.println(ans);

        Displayable screen = thing -> thing + "!";
        System.out.println(screen.words("Bye"));

        SquareRoot root = n -> Math.sqrt(n);
        double roots = root.squareRoot(16);
        System.out.println(roots);

        //part 3
        //predicate
        Predicate<Integer> less = i -> (i < 10);
        System.out.println(less.test(20));

        //consumer
        Consumer<String> sentence = (String s) -> System.out.println(s);
        sentence.accept("This exists.");

        //function
        Function<Integer, Integer> twice = t -> t * 2;
        System.out.println(twice.apply(20));

        //supplier
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
        }


    }

