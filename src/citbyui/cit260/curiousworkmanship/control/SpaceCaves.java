/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.curiousworkmanship.control;

/**
 *
 * @author Travis Harley
 */
public class SpaceCaves {
    //+getCaveTrapOne(spaceCave):double
    //(playersattack * beasts defense) / (beasts attack * players defense)
    public double caveTrapOne(double playersAttack, double beastsDefense, double beastsAttack, double playersDefense){
        double answer=(playersAttack * beastsDefense) / (beastsAttack * playersDefense);
        
        if(answer % 2 == 0){
            return 0;
        }
         else {
            return 1;
        }        
    }
}