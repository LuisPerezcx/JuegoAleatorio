package juego;

import generar.Caracteres;
import generar.Numeros;

import java.util.Scanner;

public class Juego {
    public static int perdidas=0;
    public int puntos,op1,op;
    static char opc,pc;
    Numeros numeros = new Numeros();
    Caracteres caracteres = new Caracteres();

    public void jugar(char c){
        opc='a';
        System.out.println("Pulsa 0 para salir");
        if(perdidas==100)
            System.out.println("a");
        if(puntos<=10){
            cmpCaracteres(c);
        } else if (puntos>10 & puntos<=20){
            cmpNumeros(c);
        } else if (puntos>20 & puntos<=30) {
            cmpNumerosPares(c);
        } else if (puntos>40) {
            cmpNumerosImpares(c);
        }
        System.out.println("PUNTOS = " + puntos + " | " + "PERDIDAS = " + perdidas);

    }
    private void cmpCaracteres(char c){

        System.out.println("----------------------------------------------------------------\nN I V E L 1\n");
        opc = c;
        System.out.print("Ingresa un caracter (minuscula): ");
        System.out.println(String.valueOf(c));
        pc = caracteres.generarCaracteres();
        System.out.println("Caracter generado: " + pc);
        if (opc==pc){
            puntos++;
            System.out.println("punto");
        }else perdidas++;
    }
    private void cmpNumeros(char c){
        System.out.println("----------------------------------------------------------------\nN I V E L 2\n");
        System.out.println("Ingresa un numero");
        opc = c;
        op = Integer.parseInt(String.valueOf(opc));
        op1 = numeros.generarNumeros();
        System.out.println("Numero generado: " + op1);
        if(op==op1){
            puntos++;
            System.out.println("punto");
        }else perdidas ++;
    }
    private  void cmpNumerosPares(char c){
        System.out.println("----------------------------------------------------------------\nN I V E L 3\n");
        System.out.println("Ingresa un numero");
        opc = c;
        op = Integer.parseInt(String.valueOf(opc));
        op1 = numeros.generarNumerosPares();
        System.out.println("Numero generado: " + op1);
        if(op==op1){
            puntos++;
            System.out.println("punto");
        }else perdidas ++;
    }
    private  void cmpNumerosImpares(char c){
        System.out.println("----------------------------------------------------------------\nN I V E L 4\n");
        System.out.println("Ingresa un numero");
        opc = c;
        op = Integer.parseInt(String.valueOf(opc));
        op1 = numeros.generarNumerosImpar();
        System.out.println("Numero generado: " + op1);
        if(op==op1){
            puntos++;
            System.out.println("punto");
        }else perdidas ++;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public int getPuntos() {
        return puntos;
    }
    public int getOp1(){
        return op1;
    }
    public char getPc(){
        return pc;
    }
}
