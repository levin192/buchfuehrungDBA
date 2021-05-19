/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchfuehrungDBA;

/**
 *
 * @author Levin
 */
public class Ertragskonto extends Erfolgskonto {

    public int kontroNr; // SOLLTE VON KONTO KENNEN?

    private String ausgabe;
    

    public Ertragskonto(int kontroNr, String kontoBezeichnung, double anfangsbestand, double summeSollbuchungen, double summeHabenbuchungen) {
        this.kontroNr = kontroNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.summeSollbuchungen = summeSollbuchungen;
        this.summeHabenbuchungen = summeHabenbuchungen;
    }

    @Override
    public String ausgeben() {
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", summeSollbuchungen, "Summe Habenbuchungen", summeHabenbuchungen);
        ausgabe += String.format("%-21s %,15.2f │\n", "Saldo", berechneSaldo());
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }

    @Override
    public double berechneKontosumme() {
        return 0;
    }
    @Override
    public double berechneSaldo() {
        return summeHabenbuchungen - summeSollbuchungen ;
    }
}
