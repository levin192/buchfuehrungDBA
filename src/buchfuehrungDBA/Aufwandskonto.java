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
    return "";
}

@Override
public double berechneKontosumme() {
    return 0;
}

@Override
public double berechneSaldo() { return summeSollbuchungen - summeHabenbuchungen; }
}