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
public class Foods extends Items{
    
    
    private double weight;
    
    public Foods(int id, String name, double price , double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public void printDetail() {
        super.printDetail(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" Weight: " + this.weight + "\n");
    }

    @Override
    public String getString() {
        return super.getString() + ",Weight:" + this.weight; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
