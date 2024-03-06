/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class EJARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Aprendiz> ListaAprendiz = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
       
        for (int i = 0; i < 3; i++) {
            Aprendiz miAprendiz = new Aprendiz();
            miAprendiz.setId(1);
            System.out.println("ingrese el nombre del aprendiz ");
            miAprendiz.setNombre(teclado.next()+ i);
            System.out.println("ingrese la nota 1 " );
            miAprendiz.setNota1(teclado.nextInt());
            System.out.println("ingrese la nota 2 " );
            miAprendiz.setNota2(teclado.nextInt());
            System.out.println("ingrese la nota3 " );
            miAprendiz.setNota3(teclado.nextInt());
            ListaAprendiz.add(miAprendiz);

        }
        System.out.println("imprimiendo los aprendices");
        for (Aprendiz var : ListaAprendiz) {
            float prom = (var.getNota1() + var.getNota2() + var.getNota3())/3;
           System.out.println(var.getNombre()+ " promedio : " + prom);
           
            

    }
}}
