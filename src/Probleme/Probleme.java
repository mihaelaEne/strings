package Probleme;

import java.util.Scanner;

public class Probleme {
    //todo: numarul de aparitii al unei litere in text. litera va fi citita de la tastatura
    public static int countNumberOfLetters(String text, char caracter) {
        int ct = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == caracter) {
                ct++;
            }
        }
        return ct;
    }

    public static void sol1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul de la tastatura: ");
        String text = scanner.nextLine();
        System.out.println("Introduceti caracterul cautat: ");
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("Litera " + caracter + " apare de " + countNumberOfLetters(text, caracter) + " ori");


    }

    //todo: numarul de vocale al unei litere in text. litera va fi citita de la tastatura

    public static int numarulDeVocale(String text) {
        int ct = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 65 || text.charAt(i) == 69 || text.charAt(i) == 73 || text.charAt(i) == 79 || text.charAt(i) == 85 || text.charAt(i) == 97 || text.charAt(i) == 101 || text.charAt(i) == 105 || text.charAt(i) == 111 || text.charAt(i) == 117) {
                ct++;
            }
        }
        return ct;
    }

    //todo:numarul de aparitii al unei silabe in text. silaba va fi citita de la tastatura

    public static int nrAparitirSilaba(String text, String silaba){

        String[] cuvinte=text.split(silaba);


       return cuvinte.length-1;
    }



}
