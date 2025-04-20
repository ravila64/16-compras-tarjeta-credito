package one.aluracursos.proyectofinal.main;

import one.aluracursos.proyectofinal.model.Compra;
import one.aluracursos.proyectofinal.model.TarjetaCredito;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double limite = 0.0;
        try {
            System.out.println("Limite de la tarjeta ");
            limite = leer.nextDouble();
        } catch (Exception e) {
            System.out.println("Digite solo numeros , en limite tarjeta credito" + e.toString());
            return;
        }
        TarjetaCredito tc = new TarjetaCredito(limite);
        int salir = 1;
        while (salir != 0) {
            System.out.print("Descripion producto comprar : ");
            String describe = leer.next();
            double valor = 0;
            try {
                System.out.print("Valor producto : ");
                valor = Double.valueOf(leer.next());
            } catch (Exception e) {
                System.out.println("Digite solo numeros en valor compra " + e.toString());
                return;
            }
            Compra compra = new Compra(describe, valor);
            boolean compraRealizada = tc.lanzarCompra(compra);
            if (compraRealizada) {
                System.out.println("item de compras valido");
                System.out.println("Escriba [0]Salir [1]Continuar");
                try {
                    salir = leer.nextInt();
                } catch (Exception e) {
                    System.out.println("Digite un numero entero, 0=Salir, cualquier otro numero=Continuar ");
                    return;
                }
            } else {
                System.out.println("Saldo Insificiente, revisar su cupo de TC");
                salir = 0;
            }
        } //wend
        System.out.println("Compras realizadas");
        Collections.sort(tc.getListaCompras());
        double totalCompras = 0;
        for (Compra compra : tc.getListaCompras()) {
            System.out.println(compra.toString());
            totalCompras += compra.getValor();
        }
        System.out.println("Valor total compra " + totalCompras);
        System.out.println("Saldo tarjeta " + tc.getSaldo());
    }
}
