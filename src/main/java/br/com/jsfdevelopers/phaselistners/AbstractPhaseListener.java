package br.com.jsfdevelopers.phaselistners;

import javax.faces.event.PhaseListener;

public abstract class AbstractPhaseListener implements PhaseListener{

    protected void print(final String msg){
        System.out.println(msg);
    }
    
}
