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
    
    public static Items getItemFromId(int id){
        for(Items i : itemarray){
            if(i.getID() == id)
                return i;
        }
        return null;
    }
    
    public static void removeItem(int index){
        itemarray.remove(index);
        for(Shelf e : shelfarray){
            ArrayList<Items> s = e.item_Have;
            for(int i = 0;i < s.size();i++){
                if(getItemFromId(s.get(i).getID()) == null){
                    s.remove(i);
                }
            }
        }
        saveShelfToFile();
    }
}
