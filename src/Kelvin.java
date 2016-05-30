/**
 * Created by Arcadio on 29.05.2016.
 */
public class Kelvin extends BaseCelciusUnit {

    public Kelvin(double degrees) {
        setDegrees(convertToCelcius(degrees));
    }

    @Override
    public double parseTo(TemperatureScale temperatureScale) {
        switch (temperatureScale) {
            case C:
                return getDegrees();
            case F:
                return convertToFerenheit();
        }
        throw new IllegalStateException("Cannot convert to own type");
    }

    private double convertToCelcius(double kelvin){
        return kelvin - 273.15;
    }
}
