package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

        public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless){
        super(nome, marca, prezzo, iva);
            this.colore = colore;
            this.wireless = wireless;
            
        }

        public String getColore(){
            return this.colore;
        }

        public void setColore(){
            this.colore = colore;
        }

        public boolean isWireless(){
            return this.wireless;
        }

        public void setWireless(){
            this.wireless = wireless;
        }

        @Override
        public String toString(){
            return super.toString() + "\nColore : " + getColore() + "\nWireless : " + isWireless();
        }
}
