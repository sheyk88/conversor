/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author nalshy
 */
public class Conversor {

    
    public static int menu = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        while(menu != 0){
            System.out.println("0. Salir");
            System.out.println("1. Convertir a pesetas");
            System.out.println("2. Convertir a Euros\n\n");
            Scanner scan = new Scanner(System.in);
            menu = scan.nextInt();
            
            switch(menu){
                case 0:
                    System.out.println("Cerrando programa... Gracias");
                    System.exit(0);
                    break;
                    
                case 1:
                    System.out.print("Introduzca el numero de euros a convertir en pesetas: ");
                    scan = new Scanner(System.in);                    
                    int euros = scan.nextInt();
                    
                    System.out.print("\n\n La cantidad de pesetas equivalente a " + euros + "euros es: " + (euros*166.386) + "pesetas.\n");
                    
                    break;
                    
                case 2: 
                    System.out.print("Introduzca el numero de pesetas a convertir en euros: ");
                    scan = new Scanner(System.in);                    
                    int pesetas = scan.nextInt();
                    
                    System.out.print("\n\n El cantidad de pesetas equivalente a " + pesetas + "pesetas es: " + (pesetas/166.386) + "euros.\n");
                    break;
                    
                default:
                    System.out.println("\nOpción elegida incorrecta. Debe introducir un número entre el 0 - 2\n\n");
                    break;                 
            }
        }   
    }
}