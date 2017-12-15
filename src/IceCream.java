/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class IceCream extends DessertItem {

    private int cost;
    private String name;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        String fromDessertItem = super.getName();
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        String spaces = "";
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            spaces = spaces + " ";









        }
        return name;
    }
}
