package observer;

public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        WeatherScreen weatherScreen1 = new WeatherScreen("screen #1");
        WeatherScreen weatherScreen2 = new WeatherScreen("screen #2");
        WeatherScreen weatherScreen3 = new WeatherScreen("screen #3");
        WeatherScreen weatherScreen4 = new WeatherScreen("screen #4");
        WeatherScreen weatherScreen5 = new WeatherScreen("screen #5");

        weatherStation.registerObserver(weatherScreen1)
                .registerObserver(weatherScreen2)
                .registerObserver(weatherScreen3)
                .registerObserver(weatherScreen4)
                .registerObserver(weatherScreen5);

        weatherStation.setTemperature(31.6f);
    }
}
