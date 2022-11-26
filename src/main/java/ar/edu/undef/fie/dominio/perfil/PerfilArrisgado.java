package ar.edu.undef.fie.dominio.perfil;

import ar.edu.undef.fie.dominio.Cripto;
import ar.edu.undef.fie.dominio.Inversor;

public class PerfilArrisgado implements PerfilInversor{
    @Override
    public void invertirBaja(Inversor inversor, Cripto cripto) {
        inversor.comprar(cripto, inversor.getDineroDisponible()*0.5);

    }

    @Override
    public void invertirAlta(Inversor inversor, Cripto cripto) {
        inversor.vender(cripto, inversor.getCantCripto()*0.5);

    }
}
