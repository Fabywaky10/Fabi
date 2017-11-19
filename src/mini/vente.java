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
public class vente extends commerciaux {
    public final static double c1=100;
    public final static double t1=0.2;
    public vente(String n,String p,String m,String d,double chaf,double a){
        super(a,chaf,d,m,p,n);
        
    }
    @Override
    public double calculersalaire(){
     return(s0+t1*chiffreaffaire+c1);   
    }
   public String getTypeemploye(){
    return "vendeur: ";   
   }
    
    
}
