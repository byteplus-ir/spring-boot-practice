package observer;

public interface Observable {
    Observable registerObserver(Observer observer);
    Observable unregisterObserver(Observer observer);
    void notifyObservers();
}
