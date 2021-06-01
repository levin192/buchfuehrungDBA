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
public abstract class Konto {
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
        summeSollbuchungen = summeSollbuchungen + buchungsbetrag;
    }

    public void bucheHaben(double buchungsbetrag) {
     summeHabenbuchungen = summeHabenbuchungen + buchungsbetrag;
    }
    public String ausgeben() {
        return String.format("%-33s %04d %-21s %15s\n", "Soll", kontoNr, kontoBezeichnung, "Haben")+ "──────────────────────────────────────┬──────────────────────────────────────\n";
    }

    public int compareTo(Konto einKonto) {
        return 0;
    }
    public abstract double berechneKontosumme();

    public abstract double berechneSaldo();
}

