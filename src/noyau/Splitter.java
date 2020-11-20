package noyau;

public class Splitter extends Composant{
    private float facteur = 0;
    private boolean splitted = false;
    public Splitter(int nbEntree , int nbSortie,String nom){
    super(nbEntree, nom);
    this.nombreSortie=nbSortie;
    facteur = nbEntree / nbSortie;
    this.initSorties();

    }

    @Override
    public void setCord() {
        // TODO Auto-generated method stub

    }

    @Override
    public void genererSorties() {
            if(! splitted)
            {
            int k=0;
            for(int i=0 ; i<this.nombreSortie ; i++)
            {
                int j=0;
                while(j<this.facteur){
                    ((FilSp)this.sorties[i]).setfil(this.entrees[k]);
                    System.out.println(this.entrees[k]);
                    k++;
                    j++;
                }
            }
    
            }
        

    }

    @Override
    public boolean valider() {
        // TODO Auto-generated method stub
        return super.validerEntrees() == EtatLogique.ONE ? true: false;
    }
    

    @Override
    public String generatePath() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void initSorties(){
     for (int i=0 ; i<this.nombreSortie ; i++)  this.sorties[i] = new FilSp();
    }
    public void setSplitted(boolean splitted){
        this.splitted=splitted;

    }
    public boolean getSplitted(){
        return this.splitted;
    }
    
    
}
