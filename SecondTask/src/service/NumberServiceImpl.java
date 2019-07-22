package service;

import java.util.regex.Pattern;

public class NumberServiceImpl implements NumberService {
    @Override
    public double squareOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean isSumOfTheFirstTwo(String inputString) {
        String[] numbers = inputString.split(Pattern.quote(","));
        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);

        return (a + b == c) ;
    }

    @Override
    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    @Override
    public int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
