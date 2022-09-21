package org.example.bs.simple;

import org.example.bs.api.BeliefSystem;

public class BeliefSystemSimple implements BeliefSystem {

    private BeliefSystem nextBSInChain;

    public void processRequest() {
        System.out.println("BeliefSystemSimple - processRequest");
        if (this.nextBSInChain!=null){
            System.out.println("    >> redirecting request to next BS in the chain.");
            this.nextBSInChain.processRequest();
        }
    }

    public void setNextBSInChain(BeliefSystem bs) {
        this.nextBSInChain = bs;
    }
}
