package designpatternsshowcase.adapter.sockets;

/**
 *
 * @author Rémy Kaloustian
 */
public class UkClient {
    private UkSocket _ukSocket;
    
    public UkClient(UkSocket ukSocket){
        _ukSocket = ukSocket;
    }
    
    public String getPower(){
        return _ukSocket.getPower();
    }
}
