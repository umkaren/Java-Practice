package LambdaPractice;

public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        //because of the print thing method, we can pass myCat object in printThing
        //myCat.print();
        // we don't necessarily need to do this either
        //printThing(myCat);

        //with the lambda expression, we can pass it in instead
        printThing(
                () ->
                    System.out.println("Meow"));
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
