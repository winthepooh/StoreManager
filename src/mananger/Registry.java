/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mananger;

import java.io.FileWriter;
import java.util.ArrayList;
import mananger.item.*;
import mananger.shelf.*;

/**
 *
 * @author coc
 */
public class Registry {
    
    public static ArrayList<Items> itemarray = new ArrayList<>();
    public static ArrayList<Shelf> shelfarray = new ArrayList<>();
    
    public static void saveShelfToFile(){
        try{
            FileWriter w = new FileWriter("shelf.txt");
            for(Shelf i : Registry.shelfarray){
                w.write("Id:" + i.getId() + "/-1");
                for(Items e : i.item_Have){
                    w.write("," + e.getID());
                }
                w.write("\n");
            }
            w.close();
        }catch(Exception e){}
    }
    
        public static void saveShelfToFileExcept(int id){
        try{
            FileWriter w = new FileWriter("shelf.txt");
            for(Shelf i : Registry.shelfarray){
                w.write("Id:" + i.getId() + "/-1");
                for(Items e : i.item_Have){
                    if(e.getID() != id) w.write("," + e.getID());
                }
                w.write("\n");
            }
            w.close();
        }catch(Exception e){}
    }
    
    public static Items getItemFromId(int id){
        for(Items i : itemarray){
            if(i.getID() == id)
                return i;
        }
        return null;
    }
    
    public static void removeItem(int index){
        int i = itemarray.get(index).getID();
        itemarray.remove(index);
        saveShelfToFileExcept(i);
        Registry.shelfarray.clear();
        Main.loadShelfFromFile();
    }
}
