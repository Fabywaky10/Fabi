
package mini;


public abstract class employe {
    protected String nom;
    protected String prenom;
    protected String matricule;
    protected double salaire;
    protected double age;
    protected String date;
    double calculersalaire;
    public final static double s0=110000;
    public employe(String n,String p,String d,String m,double a){
        nom=n;
        prenom=p;
        date=d;
        matricule=m;
        age=a;
    }
   public abstract double calculersalaire();
   public String getTypeemploye(){
    return "l'employe: ";   
   }
    
    public String getNom(){
        return(getTypeemploye()+ " "+nom+" "+prenom);
        
    }
}
