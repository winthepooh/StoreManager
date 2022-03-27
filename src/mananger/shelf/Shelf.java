/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mananger.shelf;

import java.util.ArrayList;
import mananger.item.*;

/**
 *
 * @author coc
 */
public class Shelf {
    
    public ArrayList<Items> item_Have = new ArrayList<>();
    public ArrayList<Integer> item_Have_index = new ArrayList<>();
    private int shelf_id;
    
    public Shelf(int id){
        this.shelf_id = id;
    }
    
    public int getId(){
        return shelf_id;
    }
    
    public void printItemInShelf(){
        for(Items a : item_Have){
            if(a instanceof Foods){
                ((Foods)a).printDetail();
            }else if(a instanceof Books){
                ((Books)a).printDetail();
            }else{
                a.printDetail();
            }
        }
    }
    
    
}
