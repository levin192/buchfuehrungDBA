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
public class Buchungssatz extends Konto {
    protected Konto sollKonto;
    protected Konto habenKonto;
    protected double buchungsbetrag;

    public void Buchungssatz(Konto sollKonto, Konto: habenKonto, double Buchungsbetrag) {
    this.sollKonto = sollKonto;
    this.habenKonto = habenKonto;
    this.buchungsbetrag = buchungsbetrag;
    }

    public void Buchungssatz(Konto sollKonto, Konto: habenKonto, double Buchungsbetrag) {
    }

    public String buchungsDurchfuehren() {
        return "";

    }

    public String buchungSollUndHaben() {
        return "";
    }

    public String ausgeben() {
        return "";
    }
}