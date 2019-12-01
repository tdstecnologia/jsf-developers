package br.com.jsfdevelopers.controllers.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SelectBooleanCheckboxController implements Serializable {

    private Boolean aceitarTermos;

    public SelectBooleanCheckboxController() {
    }

    public Boolean getAceitarTermos() {
        return aceitarTermos;
    }

    public void setAceitarTermos(Boolean aceitarTermos) {
        this.aceitarTermos = aceitarTermos;
    }

}
