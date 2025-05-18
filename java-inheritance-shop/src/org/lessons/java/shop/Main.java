package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

                                            // SMARTPHONE

        Smartphone smartphone = new Smartphone("Galaxy A14", "Samsung", new BigDecimal(499.99), "35D135D15DSASD4A9", 128);
        
        System.out.println(smartphone);
         
        


                                            // TELEVISORE


        Televisore LG_2QA13 = new Televisore("TV LG 2QA13", "LG", new BigDecimal(1499.99), new BigDecimal(0.22), 55, true);
        
        System.out.println(LG_2QA13);


                                                // CUFFIE

                                                
        Cuffie Beats_i9 = new Cuffie("Beats i9", "Beats", new BigDecimal(299.99), new BigDecimal(0.22), "Bianco", true);
        
        System.out.println(Beats_i9);

    }
}
