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
public class Aufwandskonto extends Erfolgskonto {
int konotNr;
String kontoBezeichnung;
double summSollbuchungen;
double summeHabenbuchungen;

public void Aufwandskonto(int kontoNr, String kontoBezeichnung) {
    this.kontoNr = kontoNr;
    this.kontoBezeichnung = kontoBezeichnung;

}

public void Aufwandskonto(int kontoNr, String kontoBezeichnung, double summeSollbuchungen, double summeHabenbuchungen) {
    this.kontoNr = kontoNr;
    this.kontoBezeichnung = kontoBezeichnung;
    this.summeSollbuchungen = summeSollbuchungen;
    this.summeHabenbuchungen = summeHabenbuchungen;
}

@Override
public String ausgeben() {
    ausgabe += String.format("%-21s %,15.2f │%-21s %,15.2f\n", "Summe Sollbuchungen", summeSollbuchungen, "Summe Habenbuchungen", summeHabenbuchungen);
    ausgabe += String.format("                                      │%-21s %,15.2f\n", "Saldo", berechneSaldo());
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
public double berechneSaldo() { return summeSollbuchungen - summeHabenbuchungen; }
}