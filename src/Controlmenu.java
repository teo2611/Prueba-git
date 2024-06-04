
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Controlmenu implements Initializable {
    @FXML
    private Label Menu;

    @FXML
    private Label MenuBack;

    @FXML
    private ImageView exit;

    @FXML
    private AnchorPane slind;
    
    @FXML
    private Button btnañadir;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slind.setTranslateX(-176);
        Menu.setOnMouseClicked(this::Menu);
        MenuBack.setOnMouseClicked(this::MenuBack);
        exit.setOnMouseClicked(this::exit);
    }

    @FXML
    void añadir(ActionEvent event) {
        System.out.println("hioa");
    }

    private void Menu(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(slind);

        slide.setToX(8);
        slide.play();

        slide.setOnFinished((ActionEvent e) -> {
            Menu.setVisible(false);
            MenuBack.setVisible(true);
        });
    }

    private void MenuBack(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(slind);

        slide.setToX(-176);
        slide.play();

        slide.setOnFinished((ActionEvent e) -> {
            Menu.setVisible(true);
            MenuBack.setVisible(false);
        });
    }

    private void exit(MouseEvent event) {
        System.exit(0);
    }

}


// import java.net.URL;
// import java.util.ResourceBundle;

// import javafx.animation.TranslateTransition;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.fxml.Initializable;
// import javafx.scene.control.Label;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.AnchorPane;
// import javafx.util.Duration;

// public class Controlmenu implements Initializable {
//     @FXML
//     private Label Menu;

//     @FXML
//     private Label MenuBack;

//     @FXML
//     private ImageView exit;

//     @FXML
//     private AnchorPane slind;

//     @Override
//     public void initialize(URL location, ResourceBundle resources) {
//         exit.setOnAction(event -> {
//             System.exit(0);
//         });

//         slind.setTranslateX(-176);

//         Menu.setOnAction(event -> {
//             TranslateTransition slide = new TranslateTransition();
//             slide.setDuration(Duration.seconds(0.4));
//             slide.setNode(slind);

//             slide.setToX(8);
//             slide.play();

//             slind.setTranslateX(-176);

//             slide.setOnFinished((ActionEvent e) -> {
//                 Menu.setVisible(false);
//                 MenuBack.setVisible(true);
//             });
//         });

//         MenuBack.setOnAction(event -> {
//             TranslateTransition slide = new TranslateTransition();
//             slide.setDuration(Duration.seconds(0.4));
//             slide.setNode(slind);

//             slide.setToX(-176);
//             slide.play();

//             slind.setTranslateX(0);

//             slide.setOnFinished((ActionEvent e) -> {
//                 Menu.setVisible(true);
//                 MenuBack.setVisible(false);
//             });
//         });
//     }
// }
