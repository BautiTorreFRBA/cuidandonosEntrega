# cuidandonosEntrega
Punto 2(Modelado de dominio)

## Alumnos:
* Bautista Torre Vanoni
* Luca Cesari

## Justificaciones de diseño:
### Patrón Adapter: 
Utilizamos el patrón adapter con AproximadoDeTiempo para implementar la API REST "Distance Matrix Api" la cual calcula la distancia entre dos direcciones pasadas por parámetro. Hicimos uso del patrón principalmente por si el desarrollador quiere agregar alguna otra forma para calcular distancias entre dos puntos.
### Patrón Strategy: 
Utilizamos el patrón Strategy con la interfaz Reacción ya que una persona tiene distintas formas de reaccionar ante un incidente, y esta puede cambiar en tiempo de ejecución y ser una a la vez.
### Viaje de varias paradas: 
consideramos que un viaje de varias paradas se puede modelar mediante el uso del atributo direccionDestino como una lista de paradas, en las cuales se especifica la dirección de la parada y los minutos de espera que hay en cada una. Aclaramos que en caso de haber una única parada en la lista se comportaría como un viaje normal de una única dirección de destino.
