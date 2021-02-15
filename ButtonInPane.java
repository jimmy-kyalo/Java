import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane(new Button("OK"));
        // pane.getChildren().add();
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}