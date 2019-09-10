/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsshowcase.strategy;

import designpatternsshowcase.strategy.log.ILogBehavior;
import designpatternsshowcase.strategy.move.IMoveBehavior;
import designpatternsshowcase.strategy.speak.ISpeakBehavior;
import designpatternsshowcase.strategy.eat.IEatBehavior;

/**
 *
 * @author Rémy Kaloustian
 */
public class CyborgAnimal {
    private String _name;
    private IMoveBehavior _moveBehavior;
    private IEatBehavior _eatBehavior;
    private ISpeakBehavior _speakBehavior;
    private ILogBehavior _logBehavior; 
    
    public CyborgAnimal(String name, IMoveBehavior moveBehavior, 
            IEatBehavior eatBehavior, ISpeakBehavior speakBehavior, ILogBehavior logBehavior){
        _name = name;
        _moveBehavior = moveBehavior;
        _eatBehavior = eatBehavior;
        _speakBehavior = speakBehavior;
        _logBehavior = logBehavior;
        
        _logBehavior.log(
            this._speakBehavior.speak(_name)+
            this._moveBehavior.move()+
            this._eatBehavior.eat()
        );
                
    }
}
