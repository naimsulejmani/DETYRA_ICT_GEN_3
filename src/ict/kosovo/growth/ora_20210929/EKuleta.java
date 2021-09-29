package ict.kosovo.growth.ora_20210929;

import java.util.Scanner;

public class EKuleta {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sa1cent, sa2cent, sa5cent, sa10cent, sa20cent, sa50cent, sa1euro, sa2euro;

        System.out.print("Sa 1 cent: ");
        sa1cent = reader.nextInt();

        System.out.print("Sa 2 cent: ");
        sa2cent = reader.nextInt();

        /*
        %d - numra
        %s - string
        %b - boolean
        %f - float -> %.3 -> perdori vetem 3 vlera pas presjes dhjetore
        nese perdorim ndonje numer pas %5d -> i bjen rezervo 5 vlera per numra te plote
         */
        System.out.println("-----------------------------------------");
        System.out.printf("Sa 1 centshe: %5d %10.2f EUR %n", sa1cent, sa1cent * 0.01);
        System.out.printf("Sa 2 centshe: %5d %10.2f EUR %n", sa2cent, sa2cent * 0.02);
        System.out.println("-----------------------------------------");
        System.out.printf("Totali: %22.2f EUR %n", (sa1cent * 0.01 + sa2cent * 0.02));
        System.out.println("-----------------------------------------");

    }
}
