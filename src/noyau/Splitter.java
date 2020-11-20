package noyau;

public class Splitter extends Composant{
    private float facteur = 0;
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
        // TODO Auto-generated method stub

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
        int k=0;
        for(int i=0 ; i<this.nombreSortie ; i++)
        {
            this.sorties[i] = new FilSp();
            int j=0;
            while(j<this.facteur){
                ((FilSp)this.sorties[i]).setfil(this.entrees[k]);
                k++;
            }
        }

    }
    
    
}
