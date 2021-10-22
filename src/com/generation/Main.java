package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.ConductorUberBlack;
import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {

        /*Ave ave = new Ave ("petirojo");
        Ave ave2 = new Ave();
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();

        System.out.println("-----------------------------------------");

        Perro lomito = new Perro("pulgas");
        lomito.jugar();
        lomito.comer();
         */

        UberDriver driver = new UberDriver();
        ConductorUberBlack driverBlack = new ConductorUberBlack();

        System.out.println("Uber");
        System.out.println(driver.calculatePrice(6));

        System.out.println("-----------------------------------------");

        System.out.println("Uber Black");
        System.out.println(driverBlack.calculatePrice(8));
        driverBlack.setMinimum(10);


    }
}
