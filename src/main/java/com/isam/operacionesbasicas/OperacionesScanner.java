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
public class OperacionesScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vamos a crear el objeto scanner con nombre=> ingresarDatos o teclado
        Scanner teclado = new Scanner(System.in);

        //Definir variables
        //Datos que ingresara el usuario
        double num1, num2;
        //Variables que almanaceran datos procesados
        double suma, resta, division, multiplicacion, modulo;

        //Capturar datos de entrada
        //System.out.print("Ingresa tu nombre: ");
        //String nombre = teclado.nextLine();
        System.out.println("Operaciones basicas: ");
        System.out.println("***************************");
        
        //Ingreso de datos
        System.out.print("Ingresa el primer numero: ");
        num1 = teclado.nextDouble();
        //...
        
        //Procesos (Suma, resta, ... , Modulo)
        //...
        
        //Salida (Mostrar resultados)
        //...
        
       

    }

}
