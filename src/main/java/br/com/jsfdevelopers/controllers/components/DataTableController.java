package br.com.jsfdevelopers.controllers.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class DataTableController implements Serializable {

    private Carro carro;
    private List<Carro> carros;

    public DataTableController() {
    }

    public void itemSelecionado(final String placa) {
        System.out.println("Placa: "+placa);
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        if (Objects.isNull(this.carros)) {
            this.carros = new ArrayList<>();
            this.carros.add(new Carro("AAA-1234", "Gol", "VolksWagen"));
            this.carros.add(new Carro("BBB-1234", "Fox", "VolksWagen"));
            this.carros.add(new Carro("CCC-1234", "Saveiro", "VolksWagen"));
            this.carros.add(new Carro("DDD-1234", "T-Cross", "VolksWagen"));
            this.carros.add(new Carro("EEE-1234", "Polo", "VolksWagen"));
        }
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

}
