/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segunda_clase;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static int radio;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Operaciones_TAD opera = new Operaciones_TAD();
        
        System.out.println("Ingrese el radio de su esfera");
        radio = sc.nextInt();
        
        opera.muestra_de_valores();
    }
    
}
