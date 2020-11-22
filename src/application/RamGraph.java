package application;

import java.io.IOException;

import controllers.RamController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RamGraph extends Stage {
    private RamController ramController;

    public RamGraph(double x, double y, AnchorPane workSpace, Stage st,int adr,int donees) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RamGraph.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            this.setScene(scene);
            this.ramController =loader.getController(); 
            ramController.initRamController();
			this.setX(x + st.getX());
			this.initStyle(StageStyle.UNDECORATED);
			this.setY(y + st.getY());
			this.setFullScreen(false);
			this.toBack();
            this.initOwner(st);
            this.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(Color.TRANSPARENT);
			this.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
   public RamController  getController(){
       return this.ramController;
   }

}
