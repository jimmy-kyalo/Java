import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FontDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a pane to hold the circle
        Pane pane = new StackPane();

        // create a circle and set its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStyle("-fx-stroke: black; -fx-fill: rgba(0,255,255,0.2);");
        pane.getChildren().add(circle);

        // create a label and set its properties
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);

        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
