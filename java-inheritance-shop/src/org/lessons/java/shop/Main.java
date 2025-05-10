package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

                                            // SMARTPHONE

        Smartphone GalaxyA14 = new Smartphone("Galaxy A14", "Samsung", 164.99f, 22f, 15383, 128);

        /*System.out.printf("Il cellulare scelto è: " + GalaxyA14.nome + "," + " " + "marca: " + GalaxyA14.marca +"." + " " + "Memoria totale: " + GalaxyA14.memoria  + "GB." + " " + "Codice IMEI: " + GalaxyA14.codiceIMEI + "." + " " + "Il prezzo del cellulare è di: " + GalaxyA14.prezzoProdotti());
        */


                                            // TELEVISORE


        Televisore LG = new Televisore("LG24TQ510S-WZ", "LG", 134.49f, 22, "24 Pollici", true);

        /*
        System.out.printf("Il televisore scelto è: " + LG.nome + "," + " " + "marca: " + LG.marca +"." + " " + "Dimensioni: " + LG.dimensioni + "." + " " + "Smart TV: " + LG.smart + "." + " " + "Il prezzo del televisore è di: " + LG.prezzoProdotti());
        */


                                                // CUFFIE

                                                
        Cuffie Beats = new Cuffie("Beats Solo 4", "Beats", 225.00f, 22, "Blu ardesia", true);

        System.out.printf("Le cuffie scelte sono: " + Beats.nome + "," + " " + "marca: " + Beats.marca +"." + " " + "Colore: " + Beats.colore + "." + " " + "Wireless: " + Beats.wireless + "." + " " + "Il prezzo delle cuffie è di: " + Beats.prezzoProdotti());
    }
}
