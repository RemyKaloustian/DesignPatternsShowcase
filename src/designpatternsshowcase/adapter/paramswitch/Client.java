package designpatternsshowcase.adapter.paramswitch;

/**
 *
 * @author Rémy Kaloustian
 */
public class Client {
    IDisplayer _displayer;
    
    public Client(IDisplayer disp){
        _displayer = disp;
    }
    
    public void display(){
        _displayer.display("First param", "Second param");
    }
    
}
