package designpatternsshowcase.adapter.sockets;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class UsClient {
    private UsSocket _usSocket;
    
    public UsClient(UsSocket usSocket){
        _usSocket = usSocket;
    }
    
    public String getPower(){
       return _usSocket.getPower();
    }
}
