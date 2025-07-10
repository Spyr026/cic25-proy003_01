package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);


        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar(){
        //########PREPARO########
        //Tenemos el valorResta, que es el numero que esperaremos que salga
        double valorResta = 100;
        //Tenemos valorActual, que nos va a dejar guardado en cada bucle el numero 
        double valorActual;
        //Creamos una instancia de calculadora
        Calculadora cut = new Calculadora();
        //Le damos un valor al resultado de calculadora igual al valor que "esperamos"
        cut.sumar(100);
        //########EJECUTO########
        for (int i = 0; i>10; i++){
            //restamos i a resultado
            cut.restar(i);
            //restamos i al valor esperado
            valorResta = valorResta - i;
            //recogemos el valor real del total
            //########VERIFICO########
            valorActual = cut.getTotal();
            //Comparamos si es correcto
            assertEquals(valorResta, valorActual, 0.0000001);
        }
    }

    @Test
    public void testMultiplicar(){
        //########PREPARO########
        //Tenemos el valorMulti, que es el numero que esperaremos que salga
        double valorMulti = 100;
        //Tenemos valorActual, que nos va a dejar guardado en cada bucle el numero 
        double valorActual;
        //Creamos una instancia de calculadora
        Calculadora cut = new Calculadora();
        //Le damos un valor al resultado de calculadora igual al valor que "esperamos"
        cut.sumar(100);
        //########EJECUTO########
        for (double i = 0.7; i>10; i++){
            //restamos i a resultado
            cut.multiplicar(i);
            //restamos i al valor esperado
            valorMulti = valorMulti - i;
            //recogemos el valor real del total
            //########VERIFICO########
            valorActual = cut.getTotal();
            //Comparamos si es correcto
            assertEquals(valorMulti, valorActual, 0.0000001);
        }
    }

public void testDividir(){
        //########PREPARO########
        Calculadora cut = new Calculadora();
        cut.sumar(100);
        //########EJECUTO########
        cut.dividir(2);

        //########VERIFICO########
        double valorActual = cut.getTotal();
        assertEquals(50, valorActual, 0.000001);    
        
    }

    @Test
    public void testDividirPorCero(){
        //########PREPARO########
        Calculadora cut = new Calculadora();
        cut.sumar(0);
        //########EJECUTO########
        assertThrows(ArithmeticException.class, 
            () -> cut.dividir(0));


        //cut.dividir(0);

        //########VERIFICO########
        //double valorActual = cut.getTotal();
        //assertEquals(0, valorActual, 0.000001);    
        
    }
}
