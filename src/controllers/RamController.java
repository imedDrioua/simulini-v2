package controllers;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RamController {
    private ArrayList<TextField> adresses ;
    private ArrayList<TextField> donees ;
    @FXML
    private Circle horloge;
    
    @FXML
    private TextField adr1;

    @FXML
    private TextField donee1;

    @FXML
    private TextField adr2;

    @FXML
    private TextField donee2;

    @FXML
    private TextField adr3;

    @FXML
    private TextField donee3;

    @FXML
    private TextField adr4;

    @FXML
    private TextField donee4;

    @FXML
    private TextField adr5;

    @FXML
    private TextField donee5;

    @FXML
    private TextField adr6;

    @FXML
    private TextField donee6;

    @FXML
    private TextField adr7;

    @FXML
    private TextField donee7;

    @FXML
    private TextField adr8;

    @FXML
    private TextField donee8;

    @FXML
    private TextField rim;

    @FXML
    private Circle sortieDonees;

    @FXML
    private Circle lecture;

    @FXML
    private Circle ecriture;

    @FXML
    private Circle cs;

    @FXML
    private TextField type;
    
    @FXML
    private Circle entreesDonees;

    @FXML
    private Circle entreeAdr;

    @FXML
    private AnchorPane lastchance;

    public AnchorPane getR(){
        return this.lastchance;
    }
    public Circle getEntreeAdr(){
        return this.entreeAdr;
    }
    public Circle getEntreeLec(){
        return this.lecture;
    }
    public Circle getEntreeEcr(){
        return this.ecriture;
    }
    
    public Circle getEntreeHor(){
        return this.horloge;
    }
    public Circle getEntreeCs(){
        return this.cs;
    }
    public Circle getSortieDonees(){
        return this.sortieDonees;
    }
    public Circle getEntreeDonees(){
        return this.entreesDonees;
    }
    
    

    



    


    public void initRamController(){
        this.adresses = new ArrayList<TextField>();
        this.donees = new ArrayList<TextField>();
        this.adresses.add(adr1);
        this.adresses.add(adr2);
        this.adresses.add(adr3);
        this.adresses.add(adr4);
        this.adresses.add(adr5);
        this.adresses.add(adr6);
        this.adresses.add(adr7);
        this.adresses.add(adr8);
        this.donees.add(donee1);
        this.donees.add(donee2);
        this.donees.add(donee3);
        this.donees.add(donee4);
        this.donees.add(donee5);
        this.donees.add(donee6);
        this.donees.add(donee7);
        this.donees.add(donee8);
        this.rim.setAlignment(Pos.CENTER);
    }
    public ArrayList<TextField> getAdresses(){
        return this.adresses;
    }
    public ArrayList<TextField> getDonees(){
        return this.donees;
    }
    public TextField getRim(){
        return this.rim;
    }
    public TextField getType(){
        return this.type;
    }
}
