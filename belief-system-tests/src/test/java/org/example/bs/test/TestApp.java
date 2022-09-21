package org.example.bs.test;

import org.example.bs.api.BeliefSystem;
import org.example.bs.simple.BeliefSystemSimple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

import static org.junit.Assert.assertEquals;

public class TestApp {

    @Test
    public void test1(){
        ServiceLoader<BeliefSystem> loader = ServiceLoader.load(BeliefSystem.class);
        Iterator<BeliefSystem> iter = loader.iterator();
        // load belief systems into a list
        ArrayList<BeliefSystem> bsList = new ArrayList();
        while(iter.hasNext()){
            bsList.add(iter.next());
            //iter.next().processRequest();
        }
        // link/chain a beliefsystem to the previous one added in the list
        for (int i=0; i<bsList.size()-1; i++){
            bsList.get(i).setNextBSInChain(bsList.get(i+1));
        }

        assertEquals("SPI failed to load 2 belief systems.",bsList.size(),2);

        // process requests in the bsList
        if (bsList.size()>0) {bsList.get(0).processRequest();}

    }
}


