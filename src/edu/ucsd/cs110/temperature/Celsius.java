package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = this.getValue();
        return new Fahrenheit((value * 9)/5 + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        String value = String.valueOf(this.getValue());
        return "" + value + " C";
    }
}