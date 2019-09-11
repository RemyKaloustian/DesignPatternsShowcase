package designpatternsshowcase.adapter.sockets;

/**
 *
 * @author Rémy Kaloustian
 */
public class UkSocketAdapter implements UkSocket{
    private UsSocket _usSocket;
    
    public UkSocketAdapter(UsSocket usSocket){
        _usSocket = usSocket;
    }
    @Override
    public String getPower() {
        return _usSocket.getPower();
    }
}
