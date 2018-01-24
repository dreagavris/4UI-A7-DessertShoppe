/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreeagavris
 */
/// create a method that intializes the cost topping information
public class Sundae extends DessertItem{
    private int icCost;
    private String toppingName;
    private int toppingCost;
    //
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName);
        this.icCost = icCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }
//the information aboout the sundae is stored 
    @Override
    public String toString() {
        String fromDessertItem = super.getName();
      //the cost is converted from cents to dollars
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        String spaces = "";
        // print the cost 
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            spaces = spaces + " ";
        }
        return toppingName + " Sundae with " +  "\n" + fromDessertItem + spaces + theCost;
    }

    @Override
    //print final cost with toppings
    public int getCost() {
        int cost = icCost + toppingCost;
        cost = Math.round(cost);
        return cost;
    }
}
