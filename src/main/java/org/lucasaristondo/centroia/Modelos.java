
package org.lucasaristondo.centroia;


public abstract class Modelos {
   private String nombre;
    private String laboratorio;
    private TipoDatos tipoDatos;

    public Modelos(String nombre, String laboratorio, TipoDatos tipoDatos) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.tipoDatos = tipoDatos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public TipoDatos getTipoDatos() {
        return tipoDatos;
    }

    public void entrenar (){
        System.out.println("Esta Entrenando");
       
    }
    @Override
    public String toString() {
        return "Modelo: " + nombre +
                ", Laboratorio: " + laboratorio +
                ", Tipo de datos: " + tipoDatos;
    }
    
    
}

