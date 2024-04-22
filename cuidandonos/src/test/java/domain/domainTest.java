package domain;


import domain.reacciones.MensajeDeAlerta;
import org.junit.Before;
import org.junit.Test;

public class domainTest {

    Usuario usuario1 = new Usuario("Carlitos", "sandia123");
    MensajeDeAlerta mensajeDeAlerta = new MensajeDeAlerta();
    Persona persona1 = new Persona("Carlos", "Pepe", 60, Sexo.MASCULINO, usuario1, mensajeDeAlerta);
    @Test
    public void realizarViaje(){

        persona1.realizarViaje(new Viaje("pacificoRodriguez", ""));

    }

}
