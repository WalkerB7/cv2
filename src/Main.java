import models.Car;
import models.ExampleClass2;
import models.MyMathClass;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        final int x = 10;
        final double pi = 3.14;

        ExampleClass2 exampleClass2 = new ExampleClass2();

        System.out.println(MyMathClass.pi);

        int resultSum = MyMathClass.sum(10,20);

        ExampleClass2.InnerClass innerClass = new ExampleClass2.InnerClass();

        //Vehicle skoda = new Vehicle("Škoda");
        Car skodaFabia = new Car("Škoda", "Fabia");
    }
}