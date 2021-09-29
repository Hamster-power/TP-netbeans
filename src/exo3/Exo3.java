/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* Poulenas 
TDA
Exo 3 calculatrice 
29/09/2021
*/
package exo3;

import java.util.Scanner;

/**
 *
 * @author Poulenas
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator : \n1) add\n2) substract\n3) multiply\n4) divide\n5) mudulo") ;
        
        Scanner sc;
        int operateur;
        sc = new Scanner(System.in);
        operateur = sc.nextInt(); // On demande à l'utilisateur de saisi run nombre entier
        while (operateur<1 || operateur>5) {
            System.out.println("Veuillez choisir une valeur disponible pout l'opération");
            operateur = sc.nextInt();
            }
        
    
        
        System.out.println("Saisir une valeur entière :");
        int operateur1;
        operateur1 = sc.nextInt(); // Demande à l'utilisateur de saisir une première valeur puis on la stock dans operateur1
        
        System.out.println("Saisir une seconde valeur entière :");
        int operateur2;
        operateur2 = sc.nextInt(); // Demande à l'opérateur de saisir une seconde valeur puis on la stock dans opérateur 2*
        
        int result;
        result = 0;
        if (operateur == 1) {
            result = operateur1+operateur2;
        }else if (operateur == 2) {
            result = operateur1-operateur2;
        }else if (operateur == 3) {
            result = operateur1*operateur2;
        }else if (operateur == 4) {
            result = operateur1/operateur2;
        }else if (operateur == 5) {
            result = operateur1%operateur2;
        }
        System.out.println("Le resultat est :"+result);
    }
    
}

