package designpatternsshowcase.adapter.sockets;

/**
 *
 * @author Rémy Kaloustian
 */
public class UsSocketAdapter implements UsSocket{
    private UkSocket _ukSocket;
    
    public UsSocketAdapter (UkSocket ukSocket){
        _ukSocket = ukSocket;
    }
    @Override
    public String getPower() {
        return _ukSocket.getPower();
    }
    
}
