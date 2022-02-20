/*
Driver Program que implementa la secuencia de una calculadora Posfix que lee un txt
@author Sebastian Silva
@date 18/02/2022
 */
package posfixcalc;

import java.io.*;

/**
 *
 * @author Sebastián
 */
public class Controlador {

    public static void main(String[] args) {
    	//Definicion de la ruta del archivo con las operaciones y creacion de la calculadora
        String path = "F:\\Hola.txt";
        CalculadoraPosFix calc = new CalculadoraPosFix();
        
        try{
        	//Lectura por linea del archivo y evaluacion del resultado de la misma.
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String bfRead;
            while((bfRead = br.readLine()) != null){
                System.out.println(calc.Evaluate(bfRead));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
