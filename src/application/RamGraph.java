package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RamGraph extends Stage {

    public RamGraph(double x, double y, AnchorPane workSpace, Stage st) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ram.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            this.setScene(scene);
			this.setX(x + st.getX());
			this.initStyle(StageStyle.UNDECORATED);
			this.setY(y + st.getY());
			this.setFullScreen(false);
			this.toBack();
			this.initOwner(st);
			this.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
   

}
