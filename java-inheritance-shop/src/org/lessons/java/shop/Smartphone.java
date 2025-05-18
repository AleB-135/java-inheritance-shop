package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String codiceIMEI;
    private int memoriaInGB;
    
    public Smartphone(String nome, String marca, BigDecimal prezzo,  String codiceIMEI, int memoriaInGB){
        super(nome, marca, prezzo);
        this.codiceIMEI = codiceIMEI;
        this.memoriaInGB = memoriaInGB;
    }
    
    public String getCodiceIMEI(){
        return this.codiceIMEI;
    }

    public void setCodiceIMEI(){
        this.codiceIMEI = codiceIMEI;
    }

    public int getmemoriaInGB(){
        return this.memoriaInGB;
    }

    public void setMemoriaInGB(int memoriaInGB) {
        this.memoriaInGB = memoriaInGB;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodice IMEI : " + getCodiceIMEI() + "\nMemoria in GB: " + getmemoriaInGB();
}
}
