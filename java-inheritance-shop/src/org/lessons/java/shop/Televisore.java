package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
        private int pollici;
        private boolean smartTV;

        public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva,int pollici, boolean smartTV){
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smartTV = smartTV;
        }
        
        public int getPollici(){
            return this.pollici;
        }

        public void setPollici(){
            this.pollici = pollici;
        }


        public boolean isSmart(){
            return this.smartTV;
        }

        public void setIsSmart(){
            this.smartTV = smartTV; 
        }

        @Override
        public String toString(){
            return super.toString() + "\nPollici : " + getPollici() + "\nSmartTV : " + isSmart();
        }
}
                 

