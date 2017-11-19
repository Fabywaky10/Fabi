/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;

/**
 *
 * @author FABIOLA YIMBOU
 */
public class MiniProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personel p=new personel();
        p.ajouteremploye(new vente("12novembre2005","13ZE236","Cyrille","Nanfack",30,25000));
        p.ajouteremploye(new production("12novembre2012","13ZE232","Arsene","Kamdem",12,23000));
        p.ajouteremploye(new manutention("14septembre2014","12QS123","Eleonore","Nguekeng",25,34));
        p.ajouteremploye(new representant("12novembre2014","Noella","Tsakenfack","14ZE124",26,2600));
        p.ajouteremploye(new manutentionrisquee("Alphonse","13ZE456","12mars2012","Kamgaing",23,21));
        p.ajouteremploye(new productionrisquee("23janvier2012","12ZE678","Marthe","Guiagaing",25,43 ));
        
        p.affichersalaire();
        System.out.println("le salaire moyen est "+p.salairemoyen()+"francs");
        // TODO code application logic here
    }
    
}
