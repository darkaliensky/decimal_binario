/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;
import java.util.Scanner;
/**
 *
 * @author Alonso
 */
public class Binarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero,n;
        String seguir;
        
        do{
            String binario = "", binariofinal="";
            System.out.println("Ingrese un número entre 0 y 255 para convertirlo en base binario de 8-bits");
            numero = leer.nextInt();
            while(numero < 0 || numero > 255){
                System.out.println("Ingrese un número válido (Entre 0 y 255)");
                numero = leer.nextInt();
            }
            n = numero;
            for(int i=0;i<8;i++){
                if(numero%2 == 0){
                    binario = binario + "0";
                }
                if(numero%2 != 0){
                    binario = binario + "1";
                }
                numero = numero/2; 
            }
            for (int x=binario.length()-1;x>=0;x--)
                binariofinal = binariofinal + binario.charAt(x);
            System.out.println("El número " +n+ " transformado en binario es: " +binariofinal);
            
            System.out.println("¿Desea continuar usando el programa? (Si o No)");
            seguir = leer.next();
            
            }while(seguir.equals("si") || seguir.equals("SI") || seguir.equals("Si"));
            
    }
    
}
