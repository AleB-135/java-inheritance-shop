package org.lessons.java.shop;

public class Televisore extends Prodotto {
        protected String dimensioni;
        protected boolean smart;

        public Televisore(String nome, String marca, float prezzo, float iva, String dimensioni, boolean smart) {
            super(nome, marca, prezzo, iva);
            
            this.dimensioni = dimensioni;
            this.smart = smart;
        }
                 
}
