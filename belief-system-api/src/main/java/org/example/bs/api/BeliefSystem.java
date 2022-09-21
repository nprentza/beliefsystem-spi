package org.example.bs.api;

public interface BeliefSystem {

    void processRequest();
    void setNextBSInChain(BeliefSystem bs);
}
