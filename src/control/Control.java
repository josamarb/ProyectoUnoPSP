/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import archivos.Lector;
import calculos.Calculacion;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Samuel Marin
 */
public class Control {
    private String ruta;
    private ArrayList<Double> lista;
    private Calculacion calculo;
    
    public Control(String newRuta) throws FileNotFoundException {
        ruta = newRuta;
        lista = obtenerLista();
        calculo = new Calculacion(lista);
    }
    
    private ArrayList<Double> obtenerLista() throws FileNotFoundException{
        Lector lector = new Lector();
        return lector.leerArchivo(ruta);
    }
    
    public double getPromedio(){
        return calculo.getPromedio();
    }
    
    public double getDesvEstandar(){
        return calculo.getDesviacionEstandar();
    }
}
