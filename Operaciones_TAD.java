/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segunda_clase;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Operaciones_TAD {

    public Operaciones_TAD() {
    }
    
    static Double pi = 3.1416;
    static int radio;
    static Scanner sc = new Scanner(System.in);
        
        public void inicio(){
            System.out.println("Ingrese el radio de su esfera");
            radio = sc.nextInt();
            System.out.println("--------------------------------------");
            System.out.println("El área es: \n");
            area();
            System.out.println("--------------------------------------");
            System.out.println("El diametro es: \n");
            System.out.println(radio*2);
            System.out.println("--------------------------------------");
            System.out.println("La circunferencia es: \n");
            circunferencia();
            System.out.println("--------------------------------------");
            System.out.println("El volumen es: \n");
            volumen();
        }
        public void area(){
            Double area = 4*pi*(radio*radio);
            System.out.println(area);
    }

        public void circunferencia (){
            Double circunferencia = pi*(radio*2);
            System.out.println(circunferencia);
        }
        
        public void volumen(){
            Double volumen = (4/3)*pi*((radio*radio)*radio);
            System.out.println(volumen);
        }
        
    public static Double getPi() {
        return pi;
    }

    public static void setPi(Double pi) {
        Operaciones_TAD.pi = pi;
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        Operaciones_TAD.radio = radio;
    }
    
    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Operaciones_TAD.sc = sc;
    }
    
}
