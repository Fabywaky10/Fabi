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
public class representant extends commerciaux {
    public final static double c2=200;
    public final static double t1=0.2;
    public representant(String n,String p,String d,String m,double a,double chaf){
        super(chaf,a,d,p,n,m);
   
    }
   public double calculersalaire(){
      return(chiffreaffaire*t1+c2+s0); 
   } 
   public String getTypeemploye(){
    return "representant: ";   
   }
    
   
}
