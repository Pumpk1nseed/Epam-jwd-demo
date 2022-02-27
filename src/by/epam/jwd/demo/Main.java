package by.epam.jwd.demo;

import by.epam.jwd.task02.MathCalculator;

public class Main {
    public static void main(String[] args) {
        MathCalculator calc = new MathCalculator();
        String str = "124 + 100/5*(7-4)";

        double result = calc.calculate(str);

        System.out.println(result);
    }
}
