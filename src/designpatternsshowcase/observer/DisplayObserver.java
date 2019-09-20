package designpatternsshowcase.observer;

/**
 *
 * @author Rémy Kaloustian
 */
public abstract class DisplayObserver implements IObserver{
    private Sensor _observable;

    public DisplayObserver(Sensor sensor){
        _observable = sensor;
    }
    
    @Override
    public void update() {
        if(_observable.getState() == "catastrophic"){
            display("We all ded lol");
        }
        else{
            display("Todo bien amigo");
        }
    }
    
    public abstract void display(String data);
}
