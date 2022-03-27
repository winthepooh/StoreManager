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
public class Books extends Items{
    
    private String author;
    
    public Books(int id, String name, double price , String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println(" Author: " + this.author + "\n");
    }

    @Override
    public String getString() {
        return super.getString() +",Author:" + this.author ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
