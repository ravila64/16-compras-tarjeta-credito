package one.aluracursos.proyectofinal.model;

public class Compra implements Comparable<Compra> {
    private String descripcion;

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()))  ;
    }

    private double valor;

    // constructor
    public Compra(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    // getters
    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Item {" +
                "descripcion='" + descripcion + '\'' +
                ", valor=" + valor +
                '}';
    }
}
