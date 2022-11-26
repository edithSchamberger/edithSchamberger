package ar.edu.undef.fie.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cripto {
    private Double valor;
    private List<Movimiento> listaMovimientos;

    public Cripto(Double valor) {
        this.valor = valor;
        this.listaMovimientos = new ArrayList<Movimiento>();
    }

    void agregarMovimientos(Movimiento mov){
        listaMovimientos.add(0,mov);
        // no habia hecho nada con el valor de la cripto
        setValor(getValor()+ mov.getValorMovimiento());
    }
/* este es el que me corriege que no puedo como el quiere*/
    public Boolean verEstado(){
        var valor =0.0;
        for (var i=0; i<8; i++) {
            if (null == listaMovimientos.get(i)){
                continue;
            }
            else{
                valor +=listaMovimientos.get(i).getValorMovimiento();
            }
        }
        if (valor <0){
            return false; //baja
        }
        return true;
    }
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Movimiento> getListaMovimientos() {
        return listaMovimientos;

    }
    public void setListaMovimientos(List<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }
}
