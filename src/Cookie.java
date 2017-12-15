/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {

    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
       this.number = number;
       this.pricePer12 = pricePer12;
    }

    @Override
    public int getCost() {
        return (this.pricePer12 * (this.number/ 12));
    }

    @Override
    public String toString() {

        String price = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int numSpacesInBetween = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - price.length();
        String fromDessert = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz";
        fromDessert += "\n" + this.getName();
        while (numSpacesInBetween > 1) {
            fromDessert += " ";
        }
        fromDessert += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return fromDessert;
    }
}
