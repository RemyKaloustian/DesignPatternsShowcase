package designpatternsshowcase.proxy;

/**
 *
 * @author Rémy Kaloustian
 */
public class SensitiveData implements IData{

    private String _data = "";
    @Override
    public String getData() {
        if(_data.length() < 1){
            _data = "The data";
            
        }
        return _data;
    }
    
}
