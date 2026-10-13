/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.isam.operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se desea registrar el nombre de 1 estudiante asi como sus 3 calificaciones
        //del curso de Prograbacion java
        //Lueógo calcular su promedio
        //Trabajar con la clase Scanner para la captura de datos
        Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        String nombre;
        double n1, n2, n3, promedio;

        System.out.println("Calculando el promedio del curso de programaci´n java");

        System.out.println("Ingrese nombre del estudiante:");
        nombre = teclado.nextLine();
        System.out.print("Ingrese nota1:");
        n1 = teclado.nextDouble();
        System.out.print("Ingrese nota2:");
        n2 = teclado.nextDouble();
        System.out.print("Ingrese nota3:");
        n3 = teclado.nextDouble();
        
        teclado.close();
        
        //Proceso
        promedio = (n1 + n2 + n3) / 3;
        
        //Datos de salida
        System.out.println("Resultados de la operacion: ");
        System.out.println("El promedio  de " + nombre + "es: " + promedio);
    }

}
