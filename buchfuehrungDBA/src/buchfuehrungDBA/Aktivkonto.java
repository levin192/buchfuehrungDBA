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
        return "";
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