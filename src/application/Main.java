package application;

import controllers.PremierePageController;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import noyau.*;

public class Main extends Application { /// charger la fenetre principale et lancer l'application
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PageEntree.fxml"));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/styleFile/pageEntree.css").toExternalForm());
			PremierePageController premierePageController = (PremierePageController) loader.getController();
			premierePageController.setStage(primaryStage);
			FadeTransition fade = new FadeTransition();
			fade.setDuration(Duration.millis(1000));
			fade.setDelay(Duration.millis(4000));
			fade.setFromValue(10);
			fade.setToValue(0.1);
			fade.setCycleCount(0);
			fade.setAutoReverse(true);
			fade.setNode(root);
		//	fade.play();
			if (getParameters().getUnnamed().size() != 0) {
				premierePageController.setFileToUpload(getParameters().getUnnamed().get(0));
			}
			primaryStage.getIcons().add(new Image("/homePage_icones/miniLogo.png"));
			primaryStage.setScene(scene);
		    primaryStage.initStyle(StageStyle.UNDECORATED);
     		primaryStage.setResizable(false);
		//	primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	/*Pin pin1 = new Pin(true , "pin1");
	Pin pin2 = new Pin(true , "pin1");
	Pin pin3 = new Pin(true , "pin1");
	Pin pin4 = new Pin(true , "pin1");
	pin1.setEtat(EtatLogique.ONE);
	pin2.setEtat(EtatLogique.ONE);
	pin3.setEtat(EtatLogique.ONE);
	pin4.setEtat(EtatLogique.ONE);
	Splitter splitter = new Splitter(4,2,"splitter");
	Circuit.relier(pin1, splitter, 0, 0);
	Circuit.relier(pin2, splitter, 0, 1);
	Circuit.relier(pin3, splitter, 0, 2);
	Circuit.relier(pin4, splitter, 0, 3);
	pin1.evaluer();
	pin2.evaluer();
	pin3.evaluer();
	pin4.evaluer();
	
	for (int i=0;i<splitter.getNombreSortie();i++)
	{
	System.out.println("*********************************************-");
	System.out.println(((FilSp)splitter.getSorties()[i]).getFils());
	System.out.println("------------------------------------------------");
	System.out.println("------------------------------------------------");
	}*/



	}
}
