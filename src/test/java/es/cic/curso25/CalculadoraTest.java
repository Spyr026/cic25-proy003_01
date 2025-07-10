package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
