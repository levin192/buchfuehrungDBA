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
public class Aufwandskonto {
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

public String ausgeben() {
    return "";
}

public double berechneKontosumme() {
    return 0;
}

public double berechneSaldo(int summeSollbuchungen, int summeHabenbuchungen) { return summeSollbuchungen - summeHabenbuchungen; }
}