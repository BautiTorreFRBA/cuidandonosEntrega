package domain;

import domain.direcciones.Direccion;

import java.time.LocalDateTime;
import java.util.List;

public class Viaje {

    private Direccion direccionActual;
    private Direccion direccionDestino;
    private List<Persona> cuidadores;
    private Integer duracionEstimada;
    private Persona transeunte;
    private LocalDateTime horaInicio;

    public Viaje(Direccion direccionActual, Direccion direccionDestino, List<Persona> cuidadores, Integer duracionEstimada, Persona transeunte, LocalDateTime horaInicio) {
        this.direccionActual = direccionActual;
        this.direccionDestino = direccionDestino;
        this.cuidadores = cuidadores;
        this.duracionEstimada = duracionEstimada;
        this.transeunte = transeunte;
        this.horaInicio = horaInicio;
    }
}
