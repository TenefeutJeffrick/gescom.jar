/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gescom;

/**
 *
 * @author JeffrickTenefeut
 */
public class Gescom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Progressbare progress = new Progressbare();
        progress.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(20);
            progress.Label.setText("Chargement des données "+i+"%");
            progress.progressbar.setValue(i);
            if(i==100){
                Identification identification= new Identification();
                identification.setVisible(true);
                progress.setVisible(false);
                System.out.println(new java.util.Date( ));
            }
        }
        }catch(Exception e){
            
        }
    }
    
}
