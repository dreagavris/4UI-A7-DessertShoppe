/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreeagavris
 */
public class IceCream extends DessertItem {
// create a method that stores the cost and name
    private int cost;
    private String name;

    public IceCream(String name, int cost) {
       //name of the icecream and set the cost
        super(name);
        this.cost = cost;
    }
//
    @Override
    public int getCost() {
        return cost;
    }
// printout with correct spacing
    @Override
    public String toString() {
        String fromDessertItem = super.getName();
        // spacing and caluated cost
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        String spaces = "";
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            spaces = spaces + " ";









        }
        return name;
    }
}
