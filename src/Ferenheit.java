/**
 * Created by Arcadio on 29.05.2016.
 */
public class Ferenheit extends BaseCelciusUnit {

    public Ferenheit(double degrees) {
        setDegrees(convertToCelcius(degrees));
    }

    public double parseTo(TemperatureScale temperatureScale) {
        switch (temperatureScale) {
            case C:
                return getDegrees();
            case K:
                return convertToKelvin();
        }
        throw new IllegalStateException("Cannot convert to own type");
    }

    private double convertToCelcius(double ferenheit){
        return (((ferenheit - 32) * 5 / 9));
    }
}
