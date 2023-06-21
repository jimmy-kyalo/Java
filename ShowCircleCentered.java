import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
// import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a pane to hold the circle
        Pane pane = new Pane();

        // create a circle and set its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStyle("-fx-stroke: black; -fx-fill: red;");
        // circle.setStroke(Color.BLACK);
        // circle.setFill(Color.BLUE);
        pane.getChildren().add(circle);

        // create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}