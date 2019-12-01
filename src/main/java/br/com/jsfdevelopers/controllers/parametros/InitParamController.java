package br.com.jsfdevelopers.controllers.parametros;

import java.io.Serializable;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@RequestScoped
@Named
public class InitParamController implements Serializable {

    private String appNome;

    public String getAppNome() {
        if (Objects.isNull(appNome) || appNome.isEmpty()) {
            this.appNome = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("br.com.jsfdevelopers.app-name");
        }
        return appNome;
    }

    public void setAppNome(String appNome) {
        this.appNome = appNome;
    }

}
