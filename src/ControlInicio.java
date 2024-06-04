import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlInicio {

    @FXML
    private AnchorPane Panelinea;

    @FXML
    private Button btnlogin;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView imgpasw;

    @FXML
    private ImageView imguser;

    @FXML
    private Label lbl1;

    @FXML
    private PasswordField pasword;

    @FXML
    private TextField txtuser;


    @FXML
    void entrar(ActionEvent event) throws IOException {
        FXMLLoader loarder = new FXMLLoader(getClass().getResource("/Intermenu.fxml"));
            Parent root = (Parent) loarder.load();
            Stage stage = (Stage) btnlogin.getScene().getWindow(); 
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }
    
    @FXML
    void name(ActionEvent event) {
        System.out.println("hola");
    }

    @FXML
    void passwo(ActionEvent event) {
        System.out.println("ss");

    }
 
        

    
}


 



        

