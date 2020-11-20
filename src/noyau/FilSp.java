package noyau;

import java.util.ArrayList;

public class FilSp extends Fil{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private ArrayList<Fil> fils ;
    public FilSp(){
        this.fils = new ArrayList<Fil>();
    }

    public FilSp(ArrayList<Fil> fils){
        this.fils=fils;
    }

    public void setfil(Fil fil)
    {
        fils.add(fil);
    }
    public ArrayList<Fil> getFils(){
        return this.fils;
    }
    @Override
    public void evaluer(){
      for (Fil fil : this.fils) fil.evaluer();
    }



    
}
