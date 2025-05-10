package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
        public int codice;
        public String nome;
        public String marca;
        public float prezzo;
        public float iva;
    
        public Prodotto (String nome, String marca, float prezzo, float iva){
        Random randomGenerator = new Random ();
        this.codice = randomGenerator.nextInt(9999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

        }

        public String prezzoProdotti (){
            return String.format(("%.2f"), (prezzo + (prezzo * iva / 100))) + " " + "euro";
        }
       

}

