/**
 * Created by Arcadio on 29.05.2016.
 */
public class BaseCelciusUnit implements TemperatureConvertable{

    private double degrees;

    public BaseCelciusUnit() {
    }

    public BaseCelciusUnit(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double parseTo(TemperatureScale temperatureScale) {
        switch (temperatureScale) {
            case K:
                return convertToKelvin();
            case F:
                return convertToKelvin();
        }
        throw new IllegalStateException("Cannot convert to own type");
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    protected double convertToFerenheit(){
        return (getDegrees() * 9 / 5) + 32;
    }

    protected double convertToKelvin(){
        return getDegrees() + 273.5;
    }
}
