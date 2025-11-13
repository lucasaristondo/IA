
package org.lucasaristondo.centroia;


public class AlgoritmosGenericos extends Modelos implements Entrenable {
    private double Tasa ;
    public AlgoritmosGenericos(String nombre, String laboratorio, TipoDatos tipoDatos, double Tasa) {
        super(nombre, laboratorio, tipoDatos);
        this.Tasa = Tasa;
        
    }

    public double getTasa() {
        return Tasa;
    }
    
   
    
    
    @Override
   public String toString(){
       return super.toString()+ "LA TASA ES DE " + Tasa ;
       
   }
}
