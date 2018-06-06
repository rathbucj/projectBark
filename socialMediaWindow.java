/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainApplicationFolder;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
    This social aspect of the application will allow:
        *users to post anything to a timeline
        *users to see events they can register for
        *users to read other users posts
        *users to receieve notifications from shelter or admin
        *users to comment or like other users posts  
*/
public class socialMediaWindow {
    //controls for the media window
    Stage primaryMediaWindowStage = new Stage();
    
    //buttons for the window
    Button postButton = new Button("Post");
    Button cancelButtone = new Button("Cancel");
    
    //textfields for the window 
    TextField postTextArea = new TextField();
    
    
    //Labels
    Label eventLabel = new Label("Events");
    
    ListView list = new ListView();
    
    public void window()
    {
     GridPane pane = new GridPane();
     Scene primaryMediaWindowScene = new Scene(pane,1000,800);
     
     
     
     
     
     
     
     
     
     
     
     
    // this will have functionaity to retreieve the name of the user once 
    //databse is done    
    primaryMediaWindowStage.setTitle("Welcome back " );
    primaryMediaWindowStage.setScene(primaryMediaWindowScene);
    primaryMediaWindowStage.show();
     
    }
    
}
