package com.mikelane9143.gmstools.bagofdice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Michael on 12/10/2014.
 */
public class DiceCup {
   List<Die> dice[];

    public DiceCup(){
        ;
    }

    public void addDie(int dieSize){
        Die nextDie = new Die(dieSize);

        dice.add(nextDie);
    }

    public void shakeNRoll(){
        Die singleDie;


    }
}
