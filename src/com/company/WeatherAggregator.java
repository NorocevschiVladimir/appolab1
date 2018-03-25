package com.company;

import java.util.List;

// мы можем все операции проводить тут.

public class WeatherAggregator implements WeatherSource {
    private List<WeatherSource> weatherSources;

    public WeatherAggregator(List<WeatherSource> weatherSources) {
        this.weatherSources = weatherSources;
    }

    @Override
    public double getTemperatureRobot() {

        return weatherSources
                .stream()
                .mapToDouble(WeatherSource::getTemperatureRobot)
                .filter(value -> {
                    if(value > 50)
                        System.out.println("This is Temperature maximum " + value);
                    return true;
                })
                .average()
                .getAsDouble();
    }
}
