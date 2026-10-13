/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.isam.operacionesbasicas;

/**
 *
 * @author jonas
 */
public class OperacionesBasicas {

    public static void main(String[] args) {
        //Definimos las variables
        double numero1 = 3;
        double numero2 = 2;
        double suma, resta, multiplicacion, division, modulo;
        
        //Mostramos los mensajes iniciales
        System.out.println("Operaciones basicas: ");
        System.out.println("***********************");
        
        //Realizamos las operaciones de calculo (Aritmeticas)
        suma = numero1 + numero2;           //3 + 2 = 5
        resta = numero1 - numero2;          //3 - 2 = 1
        multiplicacion = numero1 * numero2; //3 * 2 = 6
        division = numero1 / numero2;       //3 / 2 = 1.5
        modulo = numero1 % numero2;         //3 % 2 = 1
        
        //Mostrar resultados
        System.out.println("****************");
        System.out.println("Resultados");
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: "+ division);
        System.out.println("El modulo es: " + modulo);
        
        
        
    }
}
