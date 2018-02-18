/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppHealthDB;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 * @author jerryturcios08
 */
public class StartupPage extends Application {
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
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        primaryStage.show();

        Label scenetitle = new Label("App Health Databases 2018");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label username = new Label("Username:");
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

        TextFlow flow = new TextFlow(
                new Hyperlink("Forgot password?")
        );
        HBox hbFlow = new HBox(10);
        hbFlow.setAlignment(Pos.BOTTOM_LEFT);
        grid.add(flow, 0, 6);

        final Label actiontarget = new Label();
        grid.add(actiontarget, 0, 6);

        PatientExplorer transfer = new PatientExplorer();

        // TODO: Create a way for the primary window to close
        // TODO: Create a way for the window to open

        signUpBtn.setOnAction(e -> SignUpPage());

        signInBtn.setOnAction(e -> transfer.explorer());
    }

    private void SignUpPage() {
        Stage secondaryStage = new Stage();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 800, 500);

        secondaryStage.setTitle("App Health DB");
        secondaryStage.setScene(scene);
        secondaryStage.resizableProperty().setValue(Boolean.FALSE);
        secondaryStage.show();

        Label scenetitle = new Label("Sign Up");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label firstName = new Label("First name:");
        grid.add(firstName, 0, 1);
        TextField firstNameTextField = new TextField();
        grid.add(firstNameTextField, 1, 1);

        Label lastName = new Label("Last name:");
        grid.add(lastName, 0, 2);
        TextField lastNameTextField = new TextField();
        grid.add(lastNameTextField, 1, 2);

        Label username = new Label("Username:");
        grid.add(username, 0, 3);
        TextField usernameTextField = new TextField();
        grid.add(usernameTextField, 1, 3);

        Label password = new Label("Password:");
        grid.add(password, 0, 4);
        PasswordField pwField = new PasswordField();
        grid.add(pwField, 1, 4);

        Label email = new Label("Email:");
        grid.add(email, 0, 5);
        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 5);

        Button btn = new Button("Enter");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);

        btn.setOnAction(e -> secondaryStage.hide());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}