/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsshowcase.strategy.log;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class LogDotsBehavior implements ILogBehavior{

    @Override
    public void log(String content) {
        Utils.print(content, ".............");
    }
}
