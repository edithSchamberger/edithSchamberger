package ar.edu.undef.fie.dominio.perfil;

import ar.edu.undef.fie.dominio.Cripto;
import ar.edu.undef.fie.dominio.Inversor;

public interface PerfilInversor {
    void invertirBaja (Inversor inversor, Cripto cripto);
    void invertirAlta (Inversor inversor, Cripto cripto);

}
