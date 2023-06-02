package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    private final List<Observer> observerList;
    private float temperature;

    public WeatherStation(){
        this.observerList= new ArrayList<>();
        this.temperature=20;
    }

    @Override
    public Observable registerObserver(Observer observer) {
        this.observerList.add(observer);

        return this;
    }

    @Override
    public Observable unregisterObserver(Observer observer) {
        this.observerList.remove(observer);

        return this;
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(this.temperature));
    }

    public void setTemperature(float temperature){
        this.temperature=temperature;
        this.notifyObservers();
    }
}
