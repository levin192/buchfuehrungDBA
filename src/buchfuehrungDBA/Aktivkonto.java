/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchfuehrungDBA;

/**
 *
 * @author Boran
 */
public class Aktivkonto extends Bestandskonto {
    public Aktivkonto(int kontoNr, String kontoBezeichnung) {

    }

    public Aktivkonto(int kontoNr, String kontoBezeichnung, double anfangsbetsand) {

    }

    public Aktivkonto(int kontoNr, String kontoBezeichnung, double anfangsbestand, double summeSollbuchungen, double summeHabenbuchungen) {

    }
    @Override
    public String ausgeben() {
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Anfangsbestand", anfangsbestand, "Summe Habenbuchungen", summeHabenbuchungen);
        ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", summeSollbuchungen, "Saldo", berechneSaldo());
        ausgabe += "──────────────────────────────────────┼──────────────────────────────────────\n";
        ausgabe += String.format("%,37.2f │%,37.2f\n", berechneKontosumme(), berechneKontosumme());
        ausgabe += "══════════════════════════════════════╧══════════════════════════════════════\n";
        return ausgabe;
    }
    @Override
    public double berechneKontosumme() {
        double Kontosumme = (double) (anfangsbestand + summeSollbuchung);
        return Kontosumme;
    }

    @Override
    public double berechneSaldo() { 
        return anfangsbestand + summeSollbuchungen - summeHabenbuchungen; 
    }
}