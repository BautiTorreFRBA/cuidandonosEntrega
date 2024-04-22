package domain;

import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Sexo sexo;
    private Usuario usuario;
    private Boolean viajando;
    private Reaccion reaccionAnteIncidente;

    public Persona(String nombre, String apellido, Integer edad, Sexo sexo, Usuario usuario, Reaccion reaccionAnteIncidente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.usuario = usuario;
        this.viajando = Boolean.FALSE;
        this.reaccionAnteIncidente = reaccionAnteIncidente;
    }

    public void configurarReaccion(Reaccion reaccion){
        this.reaccionAnteIncidente = reaccion;
    }

    public void reaccionar(){
        reaccionAnteIncidente.reaccionar();
    }

    public void realizarViaje(Viaje unViaje){

        

    }

}
