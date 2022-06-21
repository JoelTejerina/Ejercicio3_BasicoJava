package curso.java.ejerciciotres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nombres = {"","","",""};
        for (int i = 0; i < nombres.length;i++){
            System.out.println("Ingrese los nombres");
            nombres[i] = scanner.next();
        }
        for (String n : nombres) {
            System.out.print(n + " ");
        }
    }
}