/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg34;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio34 {

    /**
     * Dada una frase, separarlo en palabras.
     * @param args
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String frase;
        int Contador=0;
        System.out.println("Digite una frase: ");
        frase = Teclado.nextLine();
        
        char[] lista = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);
            lista[i] = letra;
            if (lista[i] == ' ') {
                Contador++;
            }
        }

        String[] partes = frase.split(" ");
        System.out.println("La frase separada en palabras es: ");
        for (int i = 0; i <= Contador; i++) {
            System.out.println(partes[i]);
        }
    }  
}
