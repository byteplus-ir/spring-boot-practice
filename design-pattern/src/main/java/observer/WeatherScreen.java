package observer;

public class WeatherScreen implements Observer{
    private final String screenName;

    private float temperature;
    private final static String MSG;

    static {
        MSG="Screen number %s the temperature is: %f\n";
    }

    public WeatherScreen(String screenName){
        this.screenName=screenName;
    }
    @Override
    public void update(float temperature) {
        this.temperature=temperature;
        System.out.printf(MSG,this.screenName,this.temperature);
    }
}
