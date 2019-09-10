/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsshowcase.strategy.speak;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class SpeakRoarBehavior implements ISpeakBehavior{

    @Override
    public String speak(String content) {
        return "I am roaring my name, " + content + "\n";
    }    
}
