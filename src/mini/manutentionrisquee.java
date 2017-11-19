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
public class manutentionrisquee extends manutention implements dangereux {
    public final static double prime=25000;
    public manutentionrisquee(String n,String p,String d,String m,double a,double y){
        super(d,p,n,m,a,y);
    }   
    
        public String getTypeemploye(){
    return "manutentionnaire a risque : ";   
   }
    
   
    @Override
    public double calculersalaire(){
        return(s0+ht*65+prime);
    }

    @Override
    public double salairemensuel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
