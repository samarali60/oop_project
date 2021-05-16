package oopproject;

class HealthyBurger extends Burger {

    // the NormalBurger subclass adds more fields
    public boolean extraCheese, extraTomato;
    public int price;

    // the NormalBurger subclass has one constructor
    public HealthyBurger(String name, String meat, boolean extraCheese, boolean extraTomato) {
        // invoking base-class(Burger) constructor
        super(name, meat, "brown");
    }

    public void getHealthyInfo() {
        System.out.print("\nYou have chosen Healthy Burger!\n");
        System.out.print("Healthy Burger has two types of meat:\n1. Beef.\n2. Chicken.\n");
        System.out.print("\nNow you need to choose your types respectively: (Meat and Additions)\n");
    }

    public void setAdd() {
        System.out.print("\n*This type of sandwiches also has four available additions with separate prices:\n1. Extra Cheese.\n2. Extra Tomato.\n");
        System.out.print("If you need Extra Cheese, write true else write false: ");
        extraCheese = input.nextBoolean();
        System.out.print("If you need Extra Tomato, write true else write false: ");
        extraTomato = input.nextBoolean();
    }

    // overriding toString() method of Burger to print more info
    @Override
    public String toString() {
        String info = super.toString();
        info += "Additions: (Extra cheese: " + extraCheese + "), (Extra tomato: " + extraTomato + ")\n";
        info += "------------------------------------------------------------------------------------------\n";
        return info;
    }
}
