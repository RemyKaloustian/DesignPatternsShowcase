package designpatternsshowcase.adapter.sockets;

/**
 *
 * @author Rémy Kaloustian
 */
public class UkSocketLondon implements UkSocket {
    @Override
    public String getPower(){
        return "I am giving power from the UK";
    }
    
}
