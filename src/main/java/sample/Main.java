package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX: WebView");

        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        String url = "http://www.baidu.com";
        webEngine.load(url);

        StackPane sp = new StackPane();
        sp.getChildren().add(webView);

        Scene root = new Scene(sp);

        stage.setScene(root);
        stage.show();
    }
}