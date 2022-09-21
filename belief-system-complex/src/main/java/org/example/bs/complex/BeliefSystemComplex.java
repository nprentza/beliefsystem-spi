package org.example.bs.complex;

import org.example.bs.api.BeliefSystem;

public class BeliefSystemComplex implements BeliefSystem {

    private BeliefSystem nextBSInChain;

    public void processRequest() {
        System.out.println("BeliefSystemComplex - processRequest");
        if (this.nextBSInChain!=null){
            System.out.println("    >> redirecting request to next BS in the chain.");
            this.nextBSInChain.processRequest();
        }
    }

    public void setNextBSInChain(BeliefSystem bs) {
        this.nextBSInChain = bs;
    }

}
