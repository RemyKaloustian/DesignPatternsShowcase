package designpatternsshowcase.singleton;

/**
 *
 * @author Rémy Kaloustian
 */
//Yes for this case you can only have one bank account
public class Sun {
    private static Sun _instance;
    
    private Sun(){}
    
    public static Sun getInstance(){
        if(_instance == null){
            _instance = new Sun();
        }
        return _instance;
    }
    
    public String getAge(){
        return "A couple billion years";
    }
    
    public String getSize(){
        return "Very big";
    }
}
