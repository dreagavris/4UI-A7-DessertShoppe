/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Candy extends DessertItem {

    private int weight;
    private double price;
    private int pricePerLbs;

    public Candy(String name, int weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.price = price;
        this.pricePerLbs = pricePerLbs;
    }
    @Override
    public String toString() {
       
        int numSpacesInBetween = DessertShoppe.RECEIPT_WIDTH - (this.getName().length() + Integer.toString(this.getCost()).length());
        String fromDessert = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " lb.";
        fromDessert += "\n" + this.getName();
        for( int i = 0, i < (numSpacesInBetween) > 1) {
            fromDessert += " ";
            numSpacesInBetween--;
        }
        fromDessert += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return fromDessert;
    }
    @Override
    public int getCost() {
        int price = weight * pricePerLbs;
        return (int) (Math.round(this.weight * this.pricePerLbs));
    }
;

    }

