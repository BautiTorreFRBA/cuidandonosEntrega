package domain.aproximadorAPI;

import domain.direcciones.Direccion;
import domain.direcciones.Parada;

import java.time.LocalDateTime;
import java.util.List;

public class AproximadorDeTiempo {

    private AdaptadorCalculadorDeDistancia adapter;

    public Integer tiempoAproximadoEntre(Direccion direccionOrigen, Direccion direccionDestino){


        return calcularTiempoAproximado(adapter.distanciaEntre(direccionOrigen, direccionDestino)); //En este caso se devuelve el tiempo aproximado entre dos puntos
    }

    private Integer calcularTiempoAproximado(Integer integer) {
        //TODO
        return 0;
    }

    public Integer tiempoAproximadoTotal(Direccion direccionOrigen, List<Parada> paradas){

        int tiempoTotal = 0;

        for (int i = 0; i < paradas.size() - 1; i++) {
            Direccion origen = paradas.get(i).getDireccion();
            Direccion destino = paradas.get(i + 1).getDireccion();

            tiempoTotal += tiempoAproximadoEntre(origen, destino);
            tiempoTotal += paradas.get(i+1).getMinutosEspera(); //En caso de que llegue a la posicion final, esta siempre tendrá tiempo de espera = 0
        }
        return tiempoTotal;

    }

}

