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
public class Passivkonto extends Bestandskonto {

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

    @Override
    public String ausgeben() {
        return null;
    }

    @Override
    public double berechneKontosumme() {
        return 0;
    }
    @Override 
    public double berechneSaldo() { 
    return anfangsbestand + summeSollbuchungen - summeHabenbuchungen; 
}
}
