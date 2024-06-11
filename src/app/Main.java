package app;

public class Main {

    private static final double CONV_T = 32;

    public static void main(String[] args) {
        System.out.println("Temperature units converter");

        double degreeFrt = 1;
        double degreeCls = 1;
        double degreeCelsius = convFrtToCls(degreeFrt);
        double degreeFahrenheit = convClsToFrt(degreeCls);
        System.out.println("From Fahrenheit to Celsius. Result is: " + degreeCelsius + " Celsius degree");
        System.out.println("From Celsius to Fahrenheit. Result is: " + degreeFahrenheit + " Fahrenheit degree");
    }
    private static double convFrtToCls(double degreeFrt){
        return (degreeFrt - CONV_T) * 5/9;
    }
    private static double convClsToFrt(double degreeCls){
        return (degreeCls * 9/5) + CONV_T;
    }
}
// ( °C × 9/5) + 32