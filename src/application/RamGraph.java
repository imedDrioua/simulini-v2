package application;

import java.io.IOException;

import controllers.RamController;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.AnchorPane;


public class RamGraph   {
    private RamController ramController;
    private AnchorPane ramGraph;
    public RamGraph(double x, double y, AnchorPane workSpace,int adr,int donees) {

     try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RamGraph.fxml"));
            AnchorPane root = loader.load();
            this.ramController =loader.getController(); 
            ramController.initRamController();
            root.setLayoutX(x);
            root.setLayoutY(y);
            workSpace.getChildren().add(root);
            this.ramGraph=root;
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
     }

    }
   public RamController  getController(){
       return this.ramController;
   }
   public AnchorPane  getRamGraph(){
    return this.ramGraph;
}



}
