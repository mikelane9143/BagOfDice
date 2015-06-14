package com.mikelane9143.gmstools.bagofdice;

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
