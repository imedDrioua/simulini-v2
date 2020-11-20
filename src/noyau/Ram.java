package noyau;

import java.util.Map;

public class Ram extends Composant {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private FilSp adresse = null;
    private int taillAdr;

    Map<Integer,Integer> ram ;
    public Ram(int taillAdr){
        this.taillAdr=taillAdr; 

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
        return false;
    }

    @Override
    public String generatePath() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
