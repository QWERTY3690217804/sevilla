package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLUE);
		
		Image icon = new Image ("mre.png");
		stage.getIcons().add(icon);
		stage.setTitle("Grace sucks");
		stage.setWidth(420);
		stage.setHeight(600);
		stage.setResizable(false);
		stage.setFullScreen(false);
		
		Text text = new Text();
		text.setText("sevilla x enriquez.exe");
		text.setX(60);
		text.setY(200);
		text.setFont(Font.font("Comic Sans",30));
		text.setFill(Color.WHITE);
		
		root.getChildren().add(text);
		stage.setScene(scene);
		stage.show();
	}
	
	
}
