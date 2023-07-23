package ua.hillel.lesson15;

public class shoppingMap {
    String name1;
    int amount;


    void addItem(String name, int quantity) {
        System.out.println(name + " " + quantity);
    }

    int getTotalAmount(String name, int quantity) {
        amount += quantity;
        return quantity;
    }
}
