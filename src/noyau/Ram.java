package noyau;

import java.util.HashMap;
import java.util.Map;

import application.RamGraph;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class Ram extends Composant {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private FilSp adresse = null;
    private FilSp sortie = null;
    private int taillAdr=0;
    private int taillDonees=0;
    RamGraph ramGraph = null;
    Map<Integer,Integer> ram ;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Ram(int taillAdr,int taillDonees){
        this.taillAdr=taillAdr; 
        this.taillDonees=taillDonees;
        this.sortie = new FilSp();
        for(int i=0 ; i<taillDonees ;i++){
                Fil f=new Fil();
              if (i>=2 ) f.setEtatLogiqueFil(EtatLogique.ONE);
              else f.setEtatLogiqueFil(EtatLogique.ZERO);
            this.sortie.setfil(f);
        }
        this.ram= new HashMap<Integer,Integer>();
        this.chargementDesAdresses();
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
   
    public void initialiser(RamGraph ramGraph){
        this.ramGraph=ramGraph;
        TextField tfa;
        for(int i=0;i<8;i++){
            tfa=ramGraph.getController().getAdresses().get(i);
            tfa.setAlignment(Pos.CENTER);
            String adr = Integer.toBinaryString(i);
            if(adr.length() < this.taillAdr) for(int j=adr.length() ; j<this.taillAdr ; j++) adr= "0"+ adr;
            tfa.setText(adr);
        }
        for(TextField tfd :ramGraph.getController().getDonees()){
            tfd.setAlignment(Pos.CENTER);
        }
        ramGraph.getController().getType().setAlignment(Pos.CENTER);
        ramGraph.getController().getType().setText(Integer.toString(this.taillAdr)+" X "+Integer.toString(this.taillDonees));

    }
    public void lecture(){
              int valeur = ram.get(convertByttoINt(this.adresse));
              String rimval = Integer.toBinaryString(valeur);
              if(rimval.length() < taillDonees) {
                  for(int i=rimval.length() ; i<taillDonees ;i++){
                      rimval = "0"+ rimval;
                  }
              }
              ramGraph.getController().getRim().setText(rimval);
              this.convertIntToByt(valeur);
    }
    public void ecriture(){
        System.out.println(convertByttoINt(this.sortie));
        ram.put(convertByttoINt(this.adresse),convertByttoINt(this.sortie));
    }
    private int convertByttoINt(FilSp byt){
        String binaryString="";
        for(Fil fil : byt.getFils()){
           binaryString = binaryString.concat(Integer.toString(fil.getEtatLogiqueFil().getNum()));
        }
      
        return  Integer.parseInt(binaryString,2);
    }
    private void convertIntToByt(int valeur){
        String binaryValue = Integer.toBinaryString(valeur);
        for(int i=0;i<binaryValue.length();i++){
            if(binaryValue.charAt(binaryValue.length() -1 - i)=='0') this.sortie.getFils().get(i).setEtat(EtatLogique.ZERO);
           else this.sortie.getFils().get(i).setEtat(EtatLogique.ONE);
        }
        if(binaryValue.length() < this.taillDonees) 
        {
            for(int i=binaryValue.length() ; i< this.taillDonees ;i++){
                  this.sortie.getFils().get(i).setEtat(EtatLogique.ZERO);
            }
        }

    }
    public void setAdr(FilSp fsp){
        this.adresse=fsp;
    }
    public void setSor(FilSp fsp){
        this.sortie=fsp;
    }
    private void chargementDesAdresses(){
        int nombreDesCases = (int)Math.pow(2, this.taillAdr);
        for (int i=0 ; i<nombreDesCases;i++){
            this.ram.put(i,0);
        }
    }
    
}
