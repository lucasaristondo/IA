

package org.lucasaristondo.centroia;


public class CentroIA {
    public static void main(String[] args) {

        GestorModelos gestor = new GestorModelos();

        try {
            Modelos red1 = new RedNeuronales("ClasificadorImagenes", "Lab1", TipoDatos.DATOS_NUMERICOS, 4);
            Modelos arbol1 = new ArbolDecision("DecisionVentas", "Lab2", TipoDatos.DATOS_TEXTUALES, CriteriosEnum.ENTROPIA);
            Modelos genetico1 = new AlgoritmosGenericos("Optimizador", "Lab1", TipoDatos.DATOS_NUMERICOS, 0.2);

            gestor.agregarModelo(red1);
            gestor.agregarModelo(arbol1);
            gestor.agregarModelo(genetico1);

            gestor.mostrarModelos();
            gestor.entrenarModelos();

        } catch (ModeloDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
