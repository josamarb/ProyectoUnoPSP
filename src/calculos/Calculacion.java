package calculos;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Calcula el Promedio y la desvicaion estándar de una lista de numeros
 * @author Samuel Marin
 * @version 1.0
 */
public class Calculacion {
    
    private ArrayList<Double> numeros;
    private double promedio;
    private double desviacionEstandar;
    private int tamano;

    
    public Calculacion(ArrayList<Double> newNumeros) {
        
        promedio=0;
        desviacionEstandar=0;
        numeros = newNumeros;
        tamano = numeros.size();
        calcularPromedio();
        calcularDesvEstandar();
    }
    /**
     * Calcula el Promedio de la lista de numeros
     */
    private void calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += numeros.get(i);
        }
        promedio = suma/tamano;
    }
    /**
     * Calcula la desviacion estandar
     */
    private void calcularDesvEstandar(){
        double sumatoria =0;
        for (int i = 0; i < tamano; i++) {
            double valor_i = numeros.get(i);
            sumatoria += Math.pow((valor_i - promedio),2);
        }
        
        desviacionEstandar=Math.sqrt(sumatoria/tamano);
    }

    public double getPromedio() {
        return promedio;
    }

    public double getDesviacionEstandar() {
        return desviacionEstandar;
    }
    
    
    
}
