package designpatternsshowcase.proxy;

/**
 *
 * @author Rémy Kaloustian
 */
public class SensitiveDataProxy implements IData{

    private IData _data;
    @Override
    public String getData() {
        if(_data == null){
            _data = new SensitiveData();
        }
        return _data.getData();
    }
    
}
