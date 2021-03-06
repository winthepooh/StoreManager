/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mananger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mananger.item.Books;
import mananger.item.Foods;
import mananger.item.Items;
import mananger.shelf.Shelf;

/**
 *
 * @author coc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private static ItemManager item_manager;
    private static ShelfManager shelf_manager;
    
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_additems = new javax.swing.JButton();
        btn_addbooks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Store Managing System");

        lb_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_title.setForeground(new java.awt.Color(204, 0, 51));
        lb_title.setText("Store Managing System");

        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_additems.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_additems.setText("Manage Items");
        btn_additems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_additemsActionPerformed(evt);
            }
        });

        btn_addbooks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addbooks.setText("Manage Shelf");
        btn_addbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addbooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lb_title)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_addbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_additems, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lb_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_additems, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_addbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_additemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_additemsActionPerformed
        item_manager.setVisible(!item_manager.isVisible());
    }//GEN-LAST:event_btn_additemsActionPerformed

    private void btn_addbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addbooksActionPerformed

        shelf_manager.setVisible(!shelf_manager.isVisible());
        shelf_manager.reloadInShelf();
        shelf_manager.reloadItem();
        shelf_manager.reloadShelf();
    }//GEN-LAST:event_btn_addbooksActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed
    
    
    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        loadItemFromFile();
        loadShelfFromFile();
        
        item_manager = new ItemManager();
        item_manager.setVisible(false);
        
        
        
        shelf_manager = new ShelfManager();
        shelf_manager.setVisible(false);
        shelf_manager.reloadShelf();
    }

    public static void loadShelfFromFile(){
        try{
            File file=new File("shelf.txt");
            FileReader fr=new FileReader(file); 
            BufferedReader br =new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;  
            while((line=br.readLine())!=null){
                String[] args = line.split("/");
                Shelf s = new Shelf(Integer.parseInt(args[0].split(":")[1]));
                String[] items = args[1].split(",");
                
                for(String a : items){
                    int idx = Integer.parseInt(a);
                    if(idx == -1)continue;
                    if(Registry.getItemFromId(idx) != null){
                        s.item_Have.add(Registry.getItemFromId(idx));
                    }
                }
                Registry.shelfarray.add(s);
            }
            fr.close();
        }catch(Exception e){}
    }
    
    public static void loadItemFromFile(){
        try{
            File file=new File("items.txt");
            FileReader fr=new FileReader(file); 
            BufferedReader br =new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;  
            while((line=br.readLine())!=null)  
            {  
                String[] args = line.split(",");
                int id = Integer.parseInt(args[0].split(":")[1]);
                String name = args[1].split(":")[1];
                double price = Double.parseDouble(args[2].split(":")[1]);
                if(args.length == 3){
                    Registry.itemarray.add(new Items(id,  name , price));
                }else{
                    if(args[3].contains("Weight")){
                        double weight = Double.parseDouble(args[3].split(":")[1]);
                        Registry.itemarray.add(new Foods(id,  name , price , weight));
                    }else{
                        String author = args[3].split(":")[1];
                        Registry.itemarray.add(new Books(id,  name , price, author));
                    }
                }
            }  
            fr.close();
        }catch(Exception e){}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addbooks;
    private javax.swing.JButton btn_additems;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel lb_title;
    // End of variables declaration//GEN-END:variables
}
