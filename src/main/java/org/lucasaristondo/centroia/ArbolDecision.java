
package org.lucasaristondo.centroia;

public class ArbolDecision extends Modelos implements Entrenable {

    private CriteriosEnum criterio;

    public ArbolDecision(String nombre, String laboratorio, TipoDatos tipoDatos, CriteriosEnum criterio) {
        super(nombre, laboratorio, tipoDatos);
        this.criterio = criterio;
    }

    public CriteriosEnum getCriterio() {
        return criterio;
    }

    public void setCriterio(CriteriosEnum criterio) {
        this.criterio = criterio;
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando arbol de decision con criterio: " + criterio);
    }

    @Override
    public String toString() {
        return super.toString() + "  Criterio: " + criterio;
    }
}
