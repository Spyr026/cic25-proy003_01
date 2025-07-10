package es.cic.curso25;

import java.io.IOException;

public class Calculadora extends Object {
    private double total = 0.0d;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total = total + valor;
    }

    public void restar(double valor){
        total = total-valor;
    }

    public void multiplicar (double valor){
        total = total * valor;
    }

    public void dividir (double valor){
        if (valor !=0){
            total = total / valor;
        }else {
            this.total = 0;
            //Si divide entre 0 lanzamos una excepción
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        
    }
}
