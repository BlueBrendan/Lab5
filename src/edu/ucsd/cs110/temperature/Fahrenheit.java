package edu.ucsd.cs110.temperature;


public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = this.getValue();
        return new Celsius(((value - 32) * 5)/9);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        String value = String.valueOf(this.getValue());
        return "" + value + " F";
    }
}
