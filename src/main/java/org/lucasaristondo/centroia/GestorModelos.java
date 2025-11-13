
package org.lucasaristondo.centroia;

import java.util.ArrayList;
import java.util.List;

public class GestorModelos {

    private List<Modelos> modelos;

    public GestorModelos() {
        this.modelos = new ArrayList<>();
    }

    
    public void agregarModelo(Modelos modelo) throws ModeloDuplicadoException {
        for (Modelos m : modelos) {
            if (m.getNombre().equalsIgnoreCase(modelo.getNombre()) &&
                m.getLaboratorio().equalsIgnoreCase(modelo.getLaboratorio())) {
                throw new ModeloDuplicadoException(
                    "Ya existe un modelo con el nombre '" + modelo.getNombre() +
                    "' en el laboratorio '" + modelo.getLaboratorio() + "'."
                );
            }
        }
        modelos.add(modelo);
        System.out.println("Modelo agregado correctamente: " + modelo.getNombre());
    }

    
    public void mostrarModelos() {
        if (modelos.isEmpty()) {
            System.out.println("️ No hay modelos registrados en el sistema.");
        } else {
            System.out.println(" Modelos registrados:");
            for (Modelos m : modelos) {
                System.out.println( m);
            }
        }
    }

   
    public void entrenarModelos() {
        System.out.println(" Entrenando modelos...");
        for (Modelos m : modelos) {
            m.entrenar(); 
        }
    }

    
    public void filtrarPorTipoDatos(TipoDatos tipo) {
        System.out.println(" Modelos que usan tipo de datos: " + tipo);
        for (Modelos m : modelos) {
            if (m.getTipoDatos() == tipo) {
                System.out.println( m);
            }
        }
    }
}
