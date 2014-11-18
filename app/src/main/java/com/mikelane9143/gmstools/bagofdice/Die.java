package com.mikelane9143.gmstools.bagofdice;

import java.util.Collection;
import java.util.Random;

/**
 * Created by Michael on 12/10/2014.
 */

abstract class Die implements Collection {
    protected int sides;
    protected int result;

    public Die(int size){
        sides = size;
        result = 0;
    }

    public void roll(){
        Random rand = new Random();

        // nextInt normally excludes top value, so adding 1 to include
        result = rand.nextInt((sides - 1) + 1) + 1;
    }

    public int getResult() {
        return this.result;
    }
}
