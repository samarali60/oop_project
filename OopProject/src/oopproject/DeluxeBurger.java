package oopproject;

class DeluxeBurger extends Burger {

    // the NormalBurger subclass adds more fields
    public boolean chips, water;
    public int price;

    // the NormalBurger subclass has one constructor
    public DeluxeBurger(String name) {
        // invoking base-class(Burger) constructor
        super(name, "beef", "white");
        chips = true;
        water = true;

    }

    public void getDeluxeInfo() {
        System.out.print("\nYou have chosen Deluxe Burger!\n");
        System.out.print("Deluxe Burger has two of Additions:\n1. chips.\n2. water.\n and the total price is 60 EL");
    }

    @Override
    public int getPrice() {
        num = input.nextInt();
        price = 60 * num;
        return price;
    }

    // overriding toString() method of Burger to print more info
    @Override
    public String toString() {
        String info = super.toString();
        // info += "Additions: (Extra cheese: " + extraCheese + "), (Extra tomato: " + extraTomato + ")\n";
        info += "------------------------------------------------------------------------------------------\n";
        return info;
    }
}
