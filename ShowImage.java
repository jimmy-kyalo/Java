import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.image.*;

public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a pane to hold the image views
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("image/kenya.gif");
        // Image image = new
        // Image("http://therockasylum.com/images/DJ_Pages/Nuke_Page/Nuke-Animation.gif");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);

        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}