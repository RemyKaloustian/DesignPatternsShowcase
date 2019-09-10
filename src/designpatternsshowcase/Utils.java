
package designpatternsshowcase;

/**
 *
 * @author Rémy Kaloustian
 */
public class Utils {
    public static void print(String content){
        System.out.println(content);
    }
    
    public static void print(String content, String separator){
        System.out.println(separator);
        System.out.println(content);
        System.out.println(separator);
    }
}
