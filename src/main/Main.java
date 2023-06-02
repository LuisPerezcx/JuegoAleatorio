package main;

import GUI.JuegoGUI;
import juego.Juego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Juego juego = new Juego();
        //juego.jugar(scanner);
        new JuegoGUI();
    }
}
