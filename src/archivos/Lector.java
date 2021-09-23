/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Lectura de archivos por la ruta ingresada
 * @author Samuel Marin
 */
public class Lector {

    private File archivo = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    private ArrayList<Double> numeros;

    public Lector() {
        numeros = new ArrayList<>();
    }
/**
 * 
 * @param ruta
 * @return 
 */
    public ArrayList<Double> leerArchivo(String ruta) throws FileNotFoundException {

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                numeros.add(Double.parseDouble(linea));
            }
            return numeros;
            
        } catch (FileNotFoundException fe) {
            throw new FileNotFoundException("Archivo No encontrado");
        }catch(NumberFormatException nfe){
            throw new NumberFormatException("No puede contener texto, solo números");
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
