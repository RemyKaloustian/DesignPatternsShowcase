package designpatternsshowcase.adapter.sockets;

/**
 *
 * @author Rémy Kaloustian
 */
public class UsSocketMiami implements UsSocket{

    @Override
    public String getPower() {
        return "I am giving power from the US";
    }
    
}
