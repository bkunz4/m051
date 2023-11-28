import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class displayfour extends Application {
  @Override 
  public void start(Stage primaryStage) {
    // Creates a pane to hold the images views
    GridPane pane = new GridPane();

    // Puts nodes in the pane
    pane.add(new ImageView(new Image("image/uk.gif")), 0, 0);
    pane.add(new ImageView(new Image("image/ca.gif")), 1, 0);
    pane.add(new ImageView(new Image("image/china.gif")), 0, 1);
    pane.add(new ImageView(new Image("image/us.gif")), 1, 1);

    Scene scene = new Scene(pane);
    primaryStage.setTitle("displayfour"); // Sets the stage title
    primaryStage.setScene(scene); // Puts scene in the stage
    primaryStage.show(); // Displays the stage.
  }
}