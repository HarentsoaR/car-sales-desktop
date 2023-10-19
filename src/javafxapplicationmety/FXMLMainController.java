/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplicationmety;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author randr
 */
public class FXMLMainController implements Initializable {

   @FXML
    private Label Welcomelabel;

    @FXML
    private Button close;

    @FXML
    private Label labelLogo;

    @FXML
    private Button loginBtn;

    @FXML
    private FontAwesomeIcon logo;

    @FXML
    private TextField txt1;

    @FXML
    private PasswordField txt2;

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }
    
    // DATABASE TOOLS
    private Connection connect;
    private PreparedStatement prepare;
    private  ResultSet result;
    
    private double x = 0;
    private double y  = 0;
    
    public void loginAdmin()
    {
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        String sql = "SELECT * FROM users where username = ? and password = ?";
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, txt1.getText());
            prepare.setString(2, txt2.getText());
            result = prepare.executeQuery();
            Alert alert;
            if(txt1.getText().isEmpty() || txt2.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blank fields !");
                alert.showAndWait();
            }
            else
            {
                if(result.next())
                {
                    getData.username = txt1.getText();
                  loginBtn.getScene().getWindow().hide();
//                 alert = new Alert(AlertType.INFORMATION);
//                alert.setTitle("Information Message");
//                alert.setHeaderText(null);
//                alert.setContentText("Successfully logged in !");
//                alert.show();
                
                Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                root.setOnMousePressed((MouseEvent event) ->{
                    x = event.getSceneX();
                    y = event.getSceneY();
                });
                
                root.setOnMouseDragged((MouseEvent event) ->{
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);
                });
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.setScene(scene);
                stage.show();
                
                }
                else
                {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect username or password !");
                alert.showAndWait();
                }
            }
        }
        catch(Exception e)
        {
            
        }
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
  
    }    
    
    
    
}
