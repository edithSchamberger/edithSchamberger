package ar.edu.undef.fie.dominio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CriptoTest {

    @Test
    @DisplayName("Cear una cripto")
    void CripTesT() {
        //crear una cripto con un valor
        var cripto = new Cripto(1000.0);
        assertEquals(1000.0, cripto.getValor());

        // generar un movimiento en suba
        var mov1 = new Movimiento(50.0);
        cripto.agregarMovimientos(mov1);
        assertEquals(1050.0, cripto.getValor());

        //generar un movimiento en baja
        var mov2 = new Movimiento(-550.0);
        cripto.agregarMovimientos(mov2);
        assertEquals(500.0, cripto.getValor());

        //obtener el si esta en baja o alta la crpto que se encuentra con 2 movimientos true=suba false en baja deberia estar en baja
        assertFalse(cripto.verEstado());




    }
}

 /*   var mov1 = new Movimiento(500.2);
    var mov2 = new Movimiento(300.2);
    var mov = new Movimiento(5.2);
    var mov1 = new Movimiento(-100.2);
// var criptoMoneda = new Cripto();*/