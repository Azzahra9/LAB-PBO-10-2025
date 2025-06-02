package photoapp;

import javafx.application.Application; //wajib di extend untuk membuat gui
import javafx.stage.Stage;

public class App extends Application { // class utama
    public static User currentUser;

    @Override
    public void start(Stage primaryStage) {
        RegisterScane.show(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }// launch(args) memanggil JavaFX runtime dan otomatis mengeksekusi method
     // start() di atas.
}
