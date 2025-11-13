
package org.lucasaristondo.centroia;


public class RedNeuronales extends Modelos {
    
    private int maxCapas;
    
    public RedNeuronales(String nombre, String laboratorio, TipoDatos tipoDatos, int maxCapas) {
        super(nombre, laboratorio, tipoDatos);
        this.maxCapas = maxCapas;
    }

    public int getMaxCapas() {
        return maxCapas;
    }
    @Override
    public void entrenar(){
       System.out.println("Entrenando con un numero de  "+ maxCapas + "CAPAS ");
    }
    
    @Override
    public String toString (){
    return super.toString() + " Max capas: " + maxCapas;
}
}