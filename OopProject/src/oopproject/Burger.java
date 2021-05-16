
package oopproject;

import java.util.Scanner;


class Burger {

    // Burger class has two fields
    public String name, meat, bread;
    public int nameID, meatID, breadID, price, num;

    public String meatList[] = {"Beef", "Chicken"};
    public String breadList[] = {"White Bread", "Brown Bread"};

    Scanner input = new Scanner(System.in);

    // the Bicycle class has one constructor
    public Burger(String name, String meat, String bread) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void setName() {
        System.out.print("\nHow can I help you?\nWe have all kinds of Burger!\n1. Normal Burger.\n2. Healthy Burger\n3. Deluxe Burger.\n");
        System.out.print("\nChoose your type number to proceed, (e.g. 1 for Normal Burger, 2 for Healthy Burger, 3 for Deluxe Burger.): ");
        nameID = input.nextInt();
        while (nameID > 3 || nameID < 1) {
            System.out.print("Error, choose again the type number of Burger, (e.g. 1 for Normal Burger, 2 for Healthy Burger..etc): ");
        }
    }

    public int getName() {
        return nameID;
    }

    public void setMeat() {
        System.out.print("\nFirst, choose your number of type of meat, (e.g. 1 for Beef, 2 for Chicken): ");
        meatID = input.nextInt();
        while (meatID > 2 || meatID < 1) {
            System.out.print("Error, choose again the type number of meat, (e.g. 1 for Beef, 2 for Chicken): ");
            meatID = input.nextInt();
        }
        System.out.print("You have chosen " + meatList[meatID - 1] + "!\n");
    }

    public int getMeat() {
        return meatID;
    }

    public void setBread() {
        System.out.print("\nSecond, choose your number of type of bread, (e.g. 1 for White Bread, 2 for Brown Bread): ");
        breadID = input.nextInt();
        while (breadID > 2 || breadID < 1) {
            System.out.print("Error, choose again the type number of bread, (e.g. 1 for White Bread, 2 for Brown Bread): ");
            breadID = input.nextInt();
        }
        System.out.print("You have chosen " + breadList[breadID - 1] + "!\n");
    }

    public int getBread() {
        return breadID;
    }

    // the Bicycle class has getPrice methods
    public int getPrice() {
        return 40 * num;
    }

    public void setNum() {
        System.out.print("\nNow, how many sandwiches of this type do you need? ");
        num = input.nextInt();
        System.out.print("\nCongrats! Your order has been served successfully!\nPrice is: " + getPrice() + " L.E.\n");
    }

    // toString() method to print info of the Burger
    public String toString() {
        String info = "";
        info += "------------------------------------------------------------------------------------------\n";
        info += "Name of Burger: " + name + ".\n";
        info += "Type of Meat: " + meat + ".\n";
        info += "Type of Roll Bread: " + bread + ".\n";
        info += "------------------------------------------------------------------------------------------\n";

        return info;
    }
}
