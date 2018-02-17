/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackcewit2018;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 * @author jerryturcios08
 */
public class HackCEWIT2018 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 800, 500);

        primaryStage.setTitle("App Health DB");
        primaryStage.setScene(scene);
        primaryStage.show();

        Label scenetitle = new Label("App Health Databases 2018");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label username = new Label("User Name:");
        grid.add(username, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button signUpBtn = new Button("Sign up");
        HBox hbSignUpBtn = new HBox(10);
        hbSignUpBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbSignUpBtn.getChildren().add(signUpBtn);
        grid.add(hbSignUpBtn, 0, 4);

        Button signInBtn = new Button("Sign in");
        HBox hbSignInBtn = new HBox(10);
        hbSignInBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignInBtn.getChildren().add(signInBtn);
        grid.add(hbSignInBtn, 1, 4);

        final Label actiontarget = new Label();
        grid.add(actiontarget, 1, 6);

        signInBtn.setOnAction(e -> System.out.println(""));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}