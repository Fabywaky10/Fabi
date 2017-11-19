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
public class production extends employe {
    protected double num;
    public final static double a1=5;
    public production(String n,String p,String d,String m,double a,double x){
        super(m,d,p,n,a);
        num=x;
    }
    @Override
    public double calculersalaire(){
        return((a1*num)+s0);
    }
    public String getTypeemploye(){
    return "producteur: ";   
   }
    
   
    
}
