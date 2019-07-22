package service;

public class DemoService {
    public void start() {
        NumberServiceImpl numberService = new NumberServiceImpl();

        System.out.println("Square of circle");
        System.out.println(numberService.squareOfCircle(4));

        String input = "0.1, 0.15, 0.25";
        System.out.println();
        System.out.println("Is the sum of the first two numeric thirds?");
        System.out.println(numberService.isSumOfTheFirstTwo(input));

        System.out.println();
        System.out.println("Min and max");
        int a = 10;
        int b = 15;
        int c = 20;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Min = " + numberService.min(a, b, c));
        System.out.println("Max = " + numberService.max(a, b, c));
    }
}
