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
public class Passivkonto {

    public int kontroNr;
    public String kontoBezeichnung;
    public double anfangsbestand;
    public double summeSollbuchungen;
    public double summeHabenbuchungen;

    public Passivkonto(int kontroNr, String kontoBezeichnung, double anfangsbestand, double summeSollbuchungen, double summeHabenbuchungen) {
        this.kontroNr = kontroNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.anfangsbestand = anfangsbestand;
        this.summeSollbuchungen = summeSollbuchungen;
        this.summeHabenbuchungen = summeHabenbuchungen;
    }

    public String ausgeben() {
        return null;
    }

    public double berechneKontosummer() {
        return 0;
    }
public double berechneSaldo(int anfangsbestand, int summeSollbuchungen, int summeHabenbuchungen) { return anfangsbestand + summeSollbuchungen - summeHabenbuchungen; }
}
