/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
