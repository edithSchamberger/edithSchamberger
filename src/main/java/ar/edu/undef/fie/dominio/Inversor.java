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

    public void invertir(Inversor inversor, Cripto cripto){

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
