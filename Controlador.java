/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfixcalc;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Sebastián
 */
public class Controlador {

    public static void main(String[] args) {
        String path = "F:\\Hola.txt";
        String texto = "";
        CalculadoraPosFix calc = new CalculadoraPosFix();
        
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String temp = "";
            String bfRead;
            while((bfRead = br.readLine()) != null){
                System.out.println(calc.Evaluate(bfRead));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
