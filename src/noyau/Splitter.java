package noyau;

public class Splitter extends Composant{
    public Splitter(int nbEntree , int nbSortie,String nom){
    super(nbEntree, nom);
    this.nombreSortie=nbSortie;
    


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
        return (super.validerEntrees() == EtatLogique.ONE) ? true: false;
    }

    @Override
    public String generatePath() {
        // TODO Auto-generated method stub
        return this.getClass().getSimpleName() + "/" + (String.valueOf(getNombreEntree()))+Integer.toString(direction)+".png";
    }
    
}
