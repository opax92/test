import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner in = new Scanner(System.in);
        boolean endLoop = false;
        TemperatureConvertable temperatureConvertable;

        while (!endLoop) {
            double inputVal;

            System.out.println("Podaj z jakiej skali konwertujesz, a następnie na jaką.\n" +
                    "Celcius (C)\n" +
                    "Fahrenheit (F)\n" +
                    "Kelvin (K)");

            TemperatureScale scale1 = TemperatureScale.valueOf(in.next());
            TemperatureScale scale2 = TemperatureScale.valueOf(in.next());

            System.out.println("Podaj wartość");
            inputVal = Double.parseDouble(in.next());

            switch(scale1) {
                case C:
                    temperatureConvertable = new BaseCelciusUnit(inputVal);
                    break;
                case F:
                    temperatureConvertable = new Ferenheit(inputVal);
                    break;
                case K:
                    temperatureConvertable = new Kelvin(inputVal);
                    break;
                default:
                    System.out.println("Error occurs apparently");
                    return;
            }

            System.out.print(temperatureConvertable.parseTo(scale2));
        }
    }
}