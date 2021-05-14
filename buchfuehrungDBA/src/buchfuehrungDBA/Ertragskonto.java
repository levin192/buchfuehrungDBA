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
        return summeHabenbuchungen - summeSollbuchungen ;
    }
}
