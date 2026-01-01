import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        POSController controller = new POSController();

        VBox root = controller.getView();
        Scene scene = new Scene(root, 300, 300);

        stage.setTitle("Thogakade POS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
