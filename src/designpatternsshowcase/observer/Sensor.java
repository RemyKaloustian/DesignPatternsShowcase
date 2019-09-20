package designpatternsshowcase.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rémy Kaloustian
 */
public abstract class Sensor implements IObservable{

    private List<IObserver> _observers;
    
    public Sensor(){
        _observers = new ArrayList<IObserver>();
    }
    
    @Override
    public void add(IObserver observer) {
        _observers.add(observer);    
    }

    @Override
    public void remove(IObserver observer) {
        _observers.remove(observer);
    }
    
    public abstract String getState();

    @Override
    public void notifyObservers() {
        for(IObserver observer : _observers){
            observer.update();
        }
    }    
}
