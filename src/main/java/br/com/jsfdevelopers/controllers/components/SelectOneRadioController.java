package br.com.jsfdevelopers.controllers.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SelectOneRadioController implements Serializable {

    private String cor;
    private Integer codigo;
    private List<Cor> cores;

    public SelectOneRadioController() {
    }

    public void exibirCorSelecionada() {
        if(Objects.nonNull(this.codigo)){
            this.cor = getCores().get(getCores().indexOf(new Cor(codigo, ""))).toString();
        }
        System.out.println("Cor selecionada: " + cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<Cor> getCores() {
        if (Objects.isNull(this.cores)) {
            this.cores = new ArrayList<>();
            this.cores.add(new Cor(1, "Amarelo"));
            this.cores.add(new Cor(2, "Azul"));
            this.cores.add(new Cor(3, "Branco"));
            this.cores.add(new Cor(4, "Verde"));
            this.cores.add(new Cor(5, "Vermelho"));
        }
        return cores;
    }

    public void setCores(List<Cor> cores) {
        this.cores = cores;
    }

}
