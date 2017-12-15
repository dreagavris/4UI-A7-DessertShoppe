/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends DessertItem{
    private int icCost;
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName);
        this.icCost = icCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    @Override
    public String toString() {
        String fromDessertItem = super.getName();
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        String spaces = "";
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            spaces = spaces + " ";
        }
        return toppingName + " Sundae with " +  "\n" + fromDessertItem + spaces + theCost;
    }

    @Override
    public int getCost() {
        int cost = icCost + toppingCost;
        cost = Math.round(cost);
        return cost;
    }
}
