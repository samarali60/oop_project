
package oopproject;

import java.io.IOException;
import java.util.Scanner;


public class OopProject {

   
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Our Burger Restaurant Manager!");
        Burger burger = new Burger("", "", "");

        boolean isServing = true;

        while (isServing) {
            burger.setName();
            int nameID = burger.getName();

            if (nameID == 1) {
                NormalBurger normalBurger = new NormalBurger("", "", "", false, false);
                normalBurger.getNormalInfo();

                burger.setMeat();
                int meatID = burger.getMeat();

                burger.setBread();
                int breadID = burger.getBread();

                normalBurger.setAdd();
                boolean extraCh = normalBurger.extraCheese, extraTo = normalBurger.extraTomato;

                burger = new Burger("Normal Burger", burger.meatList[meatID - 1], burger.breadList[breadID - 1]);
                normalBurger = new NormalBurger("Normal Burger", burger.meatList[meatID - 1], burger.breadList[breadID - 1], extraCh, extraTo);

                normalBurger.setNum();

                System.out.print("\nIf you need a bill receipt, write true else write false: ");
                boolean needRecipt = input.nextBoolean();
                if (needRecipt) {
                    System.out.print(normalBurger.toString());
                }

            }
            if (nameID == 2) {
                HealthyBurger healthyBurger = new HealthyBurger("", "", false, false);
                healthyBurger.getHealthyInfo();

                burger.setMeat();
                int meatID = burger.getMeat();

                healthyBurger.setAdd();
                boolean extraCh = healthyBurger.extraCheese, extraTo = healthyBurger.extraTomato;

                burger = new Burger("Healthy Burger", burger.meatList[meatID - 1], "brown");
                healthyBurger = new HealthyBurger("Normal Burger", burger.meatList[meatID - 1], extraCh, extraTo);

                healthyBurger.setNum();

                System.out.print("\nIf you need a bill receipt, write true else write false: ");
                boolean needRecipt = input.nextBoolean();
                if (needRecipt) {
                    System.out.print(healthyBurger.toString());
                }

            }
            if (nameID == 3) {
                DeluxeBurger deluxeBurger = new DeluxeBurger("");
                deluxeBurger.getDeluxeInfo();

                burger = new Burger("Deluxe Burger", "beef", "write");
                deluxeBurger = new DeluxeBurger("Normal Burger");

                deluxeBurger.setNum();

                System.out.print("\nIf you need a bill receipt, write true else write false: ");
                boolean needRecipt = input.nextBoolean();
                if (needRecipt) {
                    System.out.print(deluxeBurger.toString());
                }

            }
            System.out.print("\nServing you is our pleasure! If you need to have another service, write true else write false: ");
            isServing = input.nextBoolean();
        }

        System.out.print("\nGood Bye! See you soon :)");
    }
}
