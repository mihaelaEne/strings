package Probleme;

import java.util.Scanner;

public class Tema2 {

    //EX1
    //todo:SE CITESTE UN SIR DE CARACTERE DE MAXIM 200 DE CARACTERE, CUVINTE SEPARATE PRIN UNUL SAU MAI MULTE SPATII
    // todo:    a) sa se elimine spatiile multiple dintre cuvinte
    public static void exA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate cuvinte vrei sa introduce? \n Raspuns: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti cuvintele: ");
        String[] listaCuvinte = new String[n];
        for (int i = 0; i < n; i++) {
            listaCuvinte[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            listaCuvinte[i] = listaCuvinte[i].replaceAll("\\s+", " ");
        }

        // Afiseaza cuvintele procesate
        for (String cuvant : listaCuvinte) {
            System.out.println(cuvant);
        }

    }
    //todo:     b) sa se transforme prima litera din fiecare cuvant in litera mare si sa se inlocuiasca ultima litera din fiecare cuvant cu urmatoarea de dupa ea din alfabet

    public static char urmLitera(char c) {
        if (c == 'z') {
            return 'a';
        } else if (c == 'Z') {
            return 'A';
        } else {
            return (char) (c + 1);
        }
    }

    public static void exB() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cuvintele: ");
        String aux = scanner.nextLine();

        String[] cuvinte = aux.split(" ");

        for (int i = 0; i < cuvinte.length; i++) {
            String cuvant = cuvinte[i];
            String primaLitera = cuvant.substring(0, 1);
            String restulCuv = cuvant.substring(1);

            cuvinte[i] = primaLitera.toUpperCase() + restulCuv.substring(0, restulCuv.length() - 1)
                    + urmLitera(restulCuv.charAt(restulCuv.length() - 1));
        }

        String rezultatFinal = String.join(" ", cuvinte);
        System.out.println("Noul sir de caract: " + rezultatFinal);
    }


    //todo:     c) dublati toate vocalele mari si stergeti toate vocalele mici
    public static void exC() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        String rezultat = "";
        for (int i = 0; i < cuv.length(); i++) {
            char c = cuv.charAt(i);
            if ("AEIOU".indexOf(c) != -1) {
                rezultat += c + "" + c;
            } else if ("aeiou".indexOf(c) == -1) {
                rezultat += c;
            }
        }

        System.out.println("Noul sir de caract: " + rezultat);
    }


    //todo:     d) realizati suma tuturor cifrelor sin sir

    public static void exD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < cuv.length(); i++) {
            char c = cuv.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println("Suma cifrelor : " + sum);
    }


    //todo:     e) sa se verifice de cate ori apare ultimul cuvant in tot sirul

    public static void exE() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        System.out.println("Sa se introduca ultimul cuvant: ");
        String ultCuvant = scanner.nextLine();

        String[] cuvinte = cuv.split("\\s+");
        int ct = 0;

        for (int i = 0; i < cuvinte.length; i++) {
            if (cuvinte[i].equals(ultCuvant)) {
                ct++;
            }
        }
        System.out.println("Ultimul cuvant " + ultCuvant + "apare de: " + ct);

    }

    //todo:     f) interschimbati elementele sirului in oglinda fata de mijloc

    public static void exF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvintele: ");
        String cuv = scanner.nextLine();

        char[] sirCuvinte=cuv.toCharArray();
        int lungime= sirCuvinte.length;

        for(int i=0; i<lungime/2; i++){
            char aux=sirCuvinte[i];
            sirCuvinte[i]= sirCuvinte[lungime-i];
            sirCuvinte[lungime-i]=aux;
        }

      

    }


    //todo:     g) cate litere mici avem? sunt toate literele consoane?


    //EX 2
    //todo:     SE CITESTE UN SIR DE CARACTERE DE MAXIM 200 DE CARACTERE, CUVINTE SEPARATE PRIN SEPARATORII " .!?;:  "
    //todo:     a) realizati un nou sir cu toate cuvintele palindroame
    //todo:     b) afisati cuvantul ce are cele mai multe vocale
    //todo:     c) modificati sirul citit astfel incat sa stergeti toate cuvintele ce au mai putin de 4 caractere
    //todo:     d) care este al treilea cuvant citit?
    // Daca sirul nu are cel putin 3 cuvinte se va afisa un mesaj.
    //todo:     e) stergeti cuvintele de exact 5 litere ce au prima si ultima litera identica.
    //todo:     f) dublati grupurile de 3 litere identice
    //todo:     g) transformati ultima litera din fiecare cuvant (doar daca este litera mica) in litera mare
    //todo:     h) sa se afiseze toate cuvintele din sir ce au prefix pe primul cuvant al textului


    //EX3
    //todo: SE CITESTE UN SIR DE MAXIM 100 DE CUVINTE DE LA TASTATURA, SEPARATE PRIN UNUL SAU MAI MULTE SPATII
    //todo:     a) sa se stearga toate spatiile multiple
    //todo:     b) sa se faca prima litera din fiecare cuvant mare si sa se inlocuiasca ultima litera cu urmatoarea din alfabet
    //todo:     c) sa se inverseze cuvintele duin sir ce NU sunt palindroame
    //todo:     d) realizati un nou sir in care sa se puna toate cuvintele care au frecventa singulara in sir
    // (singular- care apar doar o singura data in sirul citi)
    //todo:     e) stergeti toate C si dublati toate literele D
    // (C si D - un caracter citit de la tastaura)


}