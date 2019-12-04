package br.com.jsfdevelopers.phaselistners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class ProcessValidationsPhaseListner extends AbstractPhaseListener {

    @Override
    public void beforePhase(PhaseEvent event) {
        print("Phase Before: " + event.getPhaseId());

    }

    @Override
    public void afterPhase(PhaseEvent event) {
        print("Phase After: " + event.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.PROCESS_VALIDATIONS;
    }

}
