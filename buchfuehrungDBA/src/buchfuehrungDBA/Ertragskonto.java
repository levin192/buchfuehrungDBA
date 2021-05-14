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
public class Ertragskonto {

    public int kontroNr;
    public String kontoBezeichnung;
    public double summeSollbuchungen;
    public double summeHabenbuchungen;

    public Ertragskonto(int kontroNr, String kontoBezeichnung, double anfangsbestand, double summeSollbuchungen, double summeHabenbuchungen) {
        this.kontroNr = kontroNr;
        this.kontoBezeichnung = kontoBezeichnung;
        this.summeSollbuchungen = summeSollbuchungen;
        this.summeHabenbuchungen = summeHabenbuchungen;
    }

    public String ausgeben() {
        return null;
    }

    public double berechneKontosummer() {
        return 0;
    }
    public double berechneSaldo(double summeHabenbuchungen, double summeSollbuchungen) {
        return summeHabenbuchungen - summeSollbuchungen ;
    }
}
