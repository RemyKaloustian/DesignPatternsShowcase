package designpatternsshowcase.adapter.paramswitch;

/**
 *
 * @author Rémy Kaloustian
 */
public class DisplayerAdapter implements IDisplayer{
    private ReverseDisplayer _reverseDisp;
    
    public DisplayerAdapter(ReverseDisplayer revDisp){
        _reverseDisp = revDisp;
    }

    @Override
    public void display(String param1, String param2) {
        _reverseDisp.display(param2, param1);
    }
}
