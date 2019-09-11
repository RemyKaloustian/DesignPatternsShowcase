package designpatternsshowcase.adapter;

import designpatternsshowcase.Utils;
import designpatternsshowcase.adapter.paramswitch.Client;
import designpatternsshowcase.adapter.paramswitch.DisplayerAdapter;
import designpatternsshowcase.adapter.paramswitch.ReverseDisplayer;
import designpatternsshowcase.adapter.sockets.UkSocket;
import designpatternsshowcase.adapter.sockets.UkSocketAdapter;
import designpatternsshowcase.adapter.sockets.UkSocketLondon;
import designpatternsshowcase.adapter.sockets.UsSocket;
import designpatternsshowcase.adapter.sockets.UsSocketAdapter;
import designpatternsshowcase.adapter.sockets.UsSocketMiami;

/**
 *
 * @author Rémy Kaloustian
 */
public class AdapterMain {
    public static void main(String[] args){
        Utils.print("Adpater");
        UsSocket us = new UsSocketAdapter(new UkSocketLondon());
        Utils.print(us.getPower());
        
        UkSocket uk = new UkSocketAdapter(new UsSocketMiami());
        Utils.print(uk.getPower());
        
        Client c = new Client(new DisplayerAdapter(new ReverseDisplayer()));
        c.display();
    }    
}
