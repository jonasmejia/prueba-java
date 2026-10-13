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
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear el objeto que permite capturar datos Scanner => teclado
        Scanner teclado = new Scanner(System.in);
        
        //Declarar variables
        double base, altura, area;
        
        //Entrada: Ingresamos o capturamos datos
        System.out.println("Calcular el area del rectangulo: ");
        System.out.println("Ingresa la base: ");
        base = teclado.nextDouble();
        System.out.println("Ingresa la altura: ");
        altura = teclado.nextDouble();
        
        //Proceso: Procesamos
        //hallar el area: a = b * a
        area = base * altura;
        
        //Salida: Mostrar resultados
        System.out.println("El area del rectangulo es: " + area);
        
    }
    
}
