import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ResizableCircleRectangle extends Application {
    private Circle circle = new Circle(60);
    private Rectangle rectangle = new Rectangle(120, 120);

    // place clock and label in border pane
    private StackPane pane = new StackPane();

    @Override
    public void start(Stage primaryStage) {
        circle.setStyle("-fx-fill: cyan;");
        rectangle.setStyle("-fx-fill: white; -fx-stroke: red;");
        pane.getChildren().addAll(rectangle, circle);

        // create a scene and place it in the stage
        Scene scene = new Scene(pane, 140, 140);
        primaryStage.setTitle("ResizableCircleRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.widthProperty().addListener(e -> resize());
        pane.heightProperty().addListener(e -> resize());
    }

    private void resize() {
        double length = Math.min(pane.getWidth(), pane.getHeight());
        circle.setRadius(length / 2 - 15);
        rectangle.setWidth(length - 30);
        rectangle.setHeight(length - 30);
    }

    public static void main(String[] args) {
        launch(args);
    }

}