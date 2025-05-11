

package com.mycompany.programacionestructurada;

import java.util.Scanner;

public class ProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Número 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Número 3: ");
        double num3 = scanner.nextDouble();
        
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("Promedio: " + promedio);
        
        scanner.close();
    }
}
    

