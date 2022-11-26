package ar.edu.undef.fie.dominio;

import ar.edu.undef.fie.dominio.perfil.PerfilInversor;

public class Inversor {
    private Double dineroDisponible;
    private Double cantCripto;
    private PerfilInversor perfil;


    public Inversor(Double dineroDisponible, Double cantCripto) {
        this.dineroDisponible = dineroDisponible;
        this.cantCripto = cantCripto;
    }

    public void comprar(Cripto cripto, double cantidad){
        setDineroDisponible(getDineroDisponible()-cripto.getValor()*cantidad);
        setCantCripto(getCantCripto()+cantidad);

    }

    public void vender(Cripto cripto, double cantidad){
        setCantCripto(getCantCripto()-cantidad);
        setDineroDisponible(getDineroDisponible()-cantidad*cripto.getValor());
    }

    public void invertir(Cripto cripto){
        if (cripto.verEstado()){
            //true
            perfil.invertirAlta(this, cripto);
        }
        else{
            perfil.invertirBaja(this,cripto);
        }
    }


    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public Double getCantCripto() {
        return cantCripto;
    }

    public void setCantCripto(Double cantCripto) {
        this.cantCripto = cantCripto;
    }

    public PerfilInversor getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilInversor perfil) {
        this.perfil = perfil;
    }
}
