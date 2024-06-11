package app;

public class Main {

    private static final double CONV_T = 32;

    public static void main(String[] args) {
        System.out.println("Temperature units converter");

        double degreeFrt = 1;
        double degreeCelsius = convFrtToCls(degreeFrt);
        System.out.println("From Fahrenheit to Celsius. Result is: " + degreeCelsius + " Celsius degree");
    }
    private static double convFrtToCls(double degreeFrt){
        return (degreeFrt - CONV_T) * 5/9;
    }
}
