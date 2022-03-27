/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mananger.item;

/**
 *
 * @author coc
 */
public class Items {
    
    
    private int item_id;
    private String item_name;
    private double item_price;
    
    
    public Items(int id, String name, double price){
        this.item_id = id;
        this.item_name = name;
        this.item_price = price;
    }
    
    public void printDetail(){
        System.out.print("ID: " + this.item_id + " Name: " + this.item_name + " Price: " + this.item_price);
    }
    
    public String getString(){
        return "ID:" + this.item_id + ",Name:" + this.item_name + ",Price:" + this.item_price;
    }
    
    public int getID(){
        return this.item_id;
    }
}
