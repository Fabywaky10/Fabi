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
public class productionrisquee extends production implements dangereux{
    public final static double prime=25000;
    public productionrisquee(String n,String p,String d,String m,double a,double x){
        super(n,p,d,m,a,x);
    }
    public double calculersalaire(){
        return(5*num+s0+prime);
    }
public String getTypeemploye(){
    return "producteur a risque: ";   
   }
    
   
    @Override
    public double salairemensuel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
