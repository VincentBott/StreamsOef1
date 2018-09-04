package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bankrekening> rekeningen = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Geef rekeningnummer: ");
            String rekeningnummer = scanner.nextLine();
            System.out.print("Geef bedrag: ");
            int bedrag = Integer.parseInt(scanner.nextLine());
            rekeningen.add(new Bankrekening(rekeningnummer, bedrag));
        }

        System.out.println("Rekeningen met meer dan 1000 EUR: ");


        rekeningen.stream()
                .filter(n -> n.getBedrag() > 1000)
                .sorted((b1, b2) -> Integer.compare(b1.getBedrag(), b2.getBedrag()))
                .forEach(n -> System.out.printf("%s: %d%n",n.getRekeningnummer(), n.getBedrag()));

    }
}
