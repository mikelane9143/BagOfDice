package com.mikelane9143.gmstools.bagofdice.DiceMan;

import com.mikelane9143.gmstools.bagofdice.DiceMan.Die;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 12/10/2014.
 */
public class DiceCup {
   List<Die> diceCup = new ArrayList<Die>();

    public DiceCup(){
        diceCup.clear();
    }
    
    public void fillCup(int[] dieSelection){
        for (int d : dieSelection) {
            for (int i = 0; i < d; i++) {
                // needs work
            }
        }
    }
    
    public void fillCup(int d4, int d6, int d8, int d10, int d12, int d20){
        for (int i4 = 0; i4 < d4; i4++){
            addDie(4);
        }
        for (int i6 = 0; i6 < d6; i6++){
            addDie(6);
        }
        for (int i8 = 0; i8 < d8; i8++){
            addDie(8);
        }
        for (int i10 = 0; i10 < d10; i10++){
            addDie(10);
        }
        for (int i12 = 0; i12 < d12; i12++){
            addDie(12);
        }
        for (int i20 = 0; i20 < d20; i20++){
            addDie(20);
        }

    }

    public void addDie(int dieSize){
        Die nextDie = new Die(dieSize);

        diceCup.add(nextDie);
    }

    public void shakeNRoll(){
        //Die singleDie;
        for(Die d : diceCup) {
            d.roll();
        }
    }

    public int[] listResults() {
        int[] results = new int[diceCup.size()];
        int i = 0;
        for(Die d : diceCup) {
            results[i] = d.getResult();
            i++;
        }
        return results;
    }

}
