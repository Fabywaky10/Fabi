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
public class manutention extends employe {
 protected double ht;
 public final static double c3=65;
 public manutention(String n,String p,String m,String d,double a,double y){
     super(d,m,p,n,a);
     ht=y;
 }
 public double calculersalaire(){
      return(c3*ht+s0);
 }
 public String getTypeemploye(){
    return "manutentionnaire: ";   
   }
    
   
    
}
