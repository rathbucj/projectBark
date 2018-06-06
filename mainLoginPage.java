/*
        Main login page, allows the volunteers to enter username and password 
        this login page has functionality allowing user to enter their email 
        to retrieve their password 

        This login page could also be used by employees or admin, depending on who is 
        logging in, a window will pop up. 
        * This code is being reused from previous project written by us
*/
package mainApplicationFolder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author moeyaziji
 */
public class mainLoginPage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label userName = new Label("User Name");
        Label passWord = new Label("Password");
        TextField txtuserName = new TextField();
        PasswordField txtpassWord = new PasswordField();

        Button loginButton = new Button("Login");
        
        //code from https://stackoverflow.com/questions/20984209/javafx-how-to-make-a-clickable-text        
        Hyperlink reset = new Hyperlink("Click Here ");
        TextFlow flow = new TextFlow(
                new Text("Forgot password or username? "), reset
        );
        //end of cited code 
        
        GridPane loginPane = new GridPane();
        loginPane.setHgap(30);
        loginPane.setVgap(10);
        loginPane.setAlignment(Pos.CENTER);
                            // col row
        loginPane.add(userName, 1, 0);
        loginPane.add(passWord, 1, 1);
        loginPane.add(txtuserName, 2, 0);
        loginPane.add(txtpassWord, 2, 1);
        loginPane.add(loginButton, 2, 2);
        loginPane.add(flow, 1, 3, 2, 3);
        TextField update= new TextField();
        loginPane.add(update, 1, 5, 2, 3);
    
        Scene loginScene = new Scene(loginPane, 400, 400);
        Stage loginStage = new Stage();
        loginStage.setTitle("Volunteer Login portal");
        loginStage.setScene(loginScene);
        
        loginStage.show();

        //when login is chosen
        loginButton.setOnAction(log -> {
            
        //depending on the username and password a different window will show
            socialMediaWindow window = new socialMediaWindow();
            window.window();
            //basic database search for username and password match needs to be done here 
             
        });

       
        reset.setOnAction(d -> {
            Label Lemail = new Label("Email");
            TextField txtLemail = new TextField();
            Button sendEmail = new Button("Send Email");
            Button exit = new Button("Exit");

            FlowPane pane = new FlowPane();
            pane.setAlignment(Pos.CENTER);
            pane.setHgap(10);
            pane.setVgap(10);
            pane.getChildren().addAll(Lemail, txtLemail, sendEmail, exit);

            Scene forgotScene = new Scene(pane, 400, 400);
            Stage forgotStage = new Stage();
            forgotStage.setScene(forgotScene);
            forgotStage.show();

            sendEmail.setOnAction(k -> {
                //needs database integration
                String message = "Your username is " + txtuserName.getText() + " and your"
                        + " password is " + txtpassWord.getText();
                try {
                              //mail functionality to be worked on after all main functionality is satisfied
//                            GoogleMail.Send("moeyaz1995", "Mohammad1990", txtLemail.getText(), "Password Reset", 
//                                message); 

                } catch (Exception m) {
                    System.out.println(m.toString());
                }
                Label notification = new Label("Email with Password and Username has been sent");
                pane.getChildren().add(notification);
            });
            exit.setOnAction(ex -> {
                forgotStage.close();
            });
        });
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
