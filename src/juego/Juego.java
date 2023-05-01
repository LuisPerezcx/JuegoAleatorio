package juego;

import generar.Caracteres;
import generar.Numeros;

import java.util.Scanner;
import java.util.SortedMap;

public class Juego {
    static int perdidas=0;
    static int puntos=0;
    static char opc;
    Numeros numeros = new Numeros();
    Caracteres caracteres = new Caracteres();
    public void jugar(Scanner scanner){
        opc='a';
        System.out.println("Pulsa 0 para salir");
        while (opc != '0'){
            if(perdidas==100)
                break;
            if(puntos<=10){
                cmpCaracteres(scanner);
            } else if (puntos>10 & puntos<=20){
                cmpNumeros(scanner);
            } else if (puntos>20 & puntos<=30) {
                cmpNumerosPares(scanner);
            } else if (puntos>40) {
                cmpNumerosImpares(scanner);
            }
            System.out.println("PUNTOS = " + puntos + " | " + "PERDIDAS = " + perdidas);
        }
    }
    private void cmpCaracteres(Scanner scanner){
        char pc;
        System.out.println("----------------------------------------------------------------\nN I V E L 1\n");
        System.out.println("Ingresa un caracter (minuscula)");
        opc = scanner.next().charAt(0);
        pc = caracteres.generarCaracteres();
        System.out.println("Caracter generado: " + pc);
        if (opc==pc){
            puntos++;
            System.out.println("punto");
        }else perdidas++;
    }
    private void cmpNumeros(Scanner scanner){
        int op,op1;
        System.out.println("----------------------------------------------------------------\nN I V E L 2\n");
        System.out.println("Ingresa un numero");
        opc = scanner.next().charAt(0);
        op = Integer.parseInt(String.valueOf(opc));
        op1 = numeros.generarNumeros();
        System.out.println("Numero generado: " + op1);
        if(op==op1){
            puntos++;
            System.out.println("punto");
        }else perdidas ++;
    }
    private  void cmpNumerosPares(Scanner scanner){
        int op,op1;
        System.out.println("----------------------------------------------------------------\nN I V E L 3\n");
        System.out.println("Ingresa un numero");
        opc = scanner.next().charAt(0);
        op = Integer.parseInt(String.valueOf(opc));
        op1 = numeros.generarNumerosPares();
        System.out.println("Numero generado: " + op1);
        if(op==op1){
            puntos++;
            System.out.println("punto");
        }else perdidas ++;
    }
    private  void cmpNumerosImpares(Scanner scanner){
        int op,op1;
        System.out.println("----------------------------------------------------------------\nN I V E L 4\n");
        System.out.println("Ingresa un numero");
        opc = scanner.next().charAt(0);
        op = Integer.parseInt(String.valueOf(opc));
        op1 = numeros.generarNumerosImpar();
        System.out.println("Numero generado: " + op1);
        if(op==op1){
            puntos++;
            System.out.println("punto");
        }else perdidas ++;
    }
}
