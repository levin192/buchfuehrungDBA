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
public class Konto {
    protected int kontoNr;
    protected String kontoBezeichnung;
    protected double summeSollbuchungen;
    protected double summeHabenbuchungen;

    public int getKontoNr() {
        return kontoNr;
    }
    public String getKontoBezeichnung() {

        return kontoBezeichnung;

    }

    public double getSummeHabenbuchungen() {
        return summeHabenbuchungen;
    }

    public double getSummeSolbuchungen() {
        return summeSollbuchungen;
    }

    public void bucheSoll(double buchungsbetrag) {

    }

    public void bucheHaben(double buchungsbetrag) {

    }

    public String ausgeben() {
        return "";
    }

    public int compareTo(konto einKonto) {
        return 0;
    }
    public abstract double berechneKontosumme() {
    return 0;
    }

    public abstract double berechneSaldo() {
    return 0;
    }
}
