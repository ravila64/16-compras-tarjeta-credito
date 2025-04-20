package one.aluracursos.proyectofinal.model;

public class Compra {
    private String descripcion;
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
        return "Compra{" +
                "descripcion='" + descripcion + '\'' +
                ", valor=" + valor +
                '}';
    }
}
