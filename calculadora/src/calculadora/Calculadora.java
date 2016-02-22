/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Santos Moreno
 */
public class Calculadora {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args ) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int resp;
        int valor1;
        int valor2;
        int Resultado;
        String elección;
        int respuesta=1;
        int opción;
        do{
            try{
                System.out.println("Reyna Santos Moreno");
                    System.out.println("Selecione la operacion a realizar");
                    System.out.println("1. + SUMA");
                    System.out.println("2. - RESTA");
                    System.out.println("3. * MULTIPLICACION");
                    System.out.println("4. / DIVISION");
                    System.out.println("OPERACION: ");
                    opción = entrada.nextInt();
                    elección = Integer.toString(opción);
                    System.out.printf("OPCION SELECCIONADA %d/n",opción);
                    
                    System.out.println("INGRESE EL PRIMER NUMERO");
                    System.out.println("valor1: ");
                    valor1 = entrada.nextInt();
                    System.out.println("INGRESE EL SEGUNDO NUMERO");
                    System.out.println("valor2: ");
                    valor2 = entrada.nextInt();
                    System.out.println("");
                    
                    switch (opción){
                        case 1:
                        {System.out.println("OPERACION SUMA");
                            System.out.println("RESULTADO: ");
                            Resultado = valor1 + valor2;
                            System.out.println("");
                            System.out.printf("%d + %d = %d\n", valor1, valor2, Resultado);
                            break;}
                        case 2:
                        {System.out.println("OPERACION RESTA");
                            System.out.println("RESULTADO: ");
                            Resultado = valor1 - valor2;
                            System.out.printf("%d - %d = %d\n", valor1, valor2, Resultado);
                            break;}
                        case 3:
                        {System.out.println("OPERACION MULTIPLICACION");
                            System.out.println("RESULTADO: ");
                            Resultado = valor1 * valor2;
                            System.out.printf("%d * %d = %d\n", valor1, valor2, Resultado);
                            break;}
                        case 4:
                        {System.out.println("OPERACION DIVISION");
                            System.out.println("RESULTADO: ");
                            Resultado = valor1 / valor2;
                            System.out.println("");
                            System.out.printf("%d / %d = %d\n", valor1, valor2, Resultado);
                            break;} 
                    }
                System.out.println("¿DESEAS REALIZAR OTRA OPERACION? 1. SI / 2. NO:");
                resp = entrada.nextInt();
            }
       catch(ImputException inputException);     
        //catch(ExceptionInInitializerError exceptionInInitializerError);
            {
            System.err.println("\nException: %S\N",inputException);
            entrada.nextLine();
            System.out.println("Debe introducir enteros.");
        }
        catch(ArithmeticException arithmeticException);{
        entrada. nextLine();
        System.out.println("CERO ES UN DENOMINADOR NO VALIDO");
        }
                }
        
        while(resp == 1 || resp == 1);
        
    }
    

