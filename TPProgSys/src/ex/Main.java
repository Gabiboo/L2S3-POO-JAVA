package ex;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*
 * Avec un JDK version 11 ou +,
 * la JVM doit être lancée avec les options suivantes,
 * en adaptant le chemin vers les librairies JavaFX,
 *
 * sur Windows :
 *   --module-path "C:\Program Files\javafx-sdk\lib" --add-modules javafx.controls
 *
 * sur Mac et Linux :
 *   --module-path /usr/share/openjfx/lib --add-modules javafx.controls
 */

public class Main extends Application {

	// dimension de chaque zone de saisie
	final static double WIDTH = 500;
	final static double HEIGHT = 350;
	// taille de police de caractère
	final static double FONT_SIZE = 18;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {

		HBox toolbar = new HBox();
		Button btnReset = new Button("reset");
		Button btnRun = new Button("chargement");
		toolbar.getChildren().addAll(btnReset, btnRun);

		ListView<String> listView = new ListView<>();
		listView.setPrefHeight(HEIGHT);
		listView.setPrefWidth(WIDTH);

		listView.setCellFactory(cell -> {
			return new ListCell<String>() {
				@Override
				protected void updateItem(String item, boolean empty) {
					super.updateItem(item, empty);
					if (item != null) {
						setText(item);
						setFont(new Font(FONT_SIZE));
					}
				}
			};
		});

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(toolbar);
		borderPane.setCenter(listView);

		Scene scene = new Scene(borderPane);
		stage.setScene(scene);
		stage.setTitle("Exemple");
		stage.show();

		SvRequete sv = new SvRequete();
		
		Requete.init(listView.getItems());
		btnReset.setOnAction(event -> Requete.reset(listView.getItems()));
		btnRun.setOnAction(event ->  sv.restart());
	}

 
 
}
