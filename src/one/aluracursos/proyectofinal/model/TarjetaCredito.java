package one.aluracursos.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }

    //getters
    public double getLimite() {
        return limite;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public double getSaldo() {
        return saldo;
    }
    // metodos
    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaCompras.add(compra);
            return true;
        }
        return false;
    }

}
