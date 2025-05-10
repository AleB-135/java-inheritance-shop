package org.lessons.java.shop;

public class Smartphone extends Prodotto {
    protected int codiceIMEI;
    protected int memoria;
    
    public Smartphone(String nome, String marca, float prezzo, float iva, int codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }
    
}
