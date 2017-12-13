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
    
    
    
    
    public Candy(String name, int weight, int pricePerLbs){
        super ( name);
        this.weight = weight;
        this.price = price;
        this.pricePerLbs = pricePerLbs;
        
        
        

    }

 
    
    public String toString(){
        return Price;
       
    }

    @Override
    public int getCost() {
        int price = weight * pricePerLbs;
        return price;
        
        
       
    }
}
