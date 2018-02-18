package AppHealthDB;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 * @author jerryturcios08
 */
class PatientExplorer {
    void explorer() {
        // Create instances of objects
        Stage thirdStage = new Stage();
        GridPane grid = new GridPane();
        BorderPane border = new BorderPane();
        ListView list = new ListView();
        BorderPane.setMargin(list, new Insets(12,12,12,12));
        border.setPadding(new Insets(20, 20, 20, 20));
        FlowPane flow = new FlowPane(10, 10);
        flow.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        // Commence the boxes
        HBox hBox = new HBox(8);
        VBox vBox = new VBox();

        border.setTop(hBox);
        border.setLeft(vBox);
        border.setCenter(grid);
        border.setRight(flow);

        // Set scene property
        Scene scene = new Scene(border, 1440, 900);

        // Creates window
        thirdStage.setTitle("Patient Explorer");
        thirdStage.setScene(scene);
        thirdStage.show();

        // Search function
        TextField searchBar = new TextField();
        Button search = new Button("Search");
        hBox.getChildren().addAll(searchBar, search);

        // Profile-related tab bar
        Button profileButton = new Button("Profile");
        Button patientInformation = new Button("View Patient Information");
        Button predictions = new Button("Patient Analysis");
        hBox.getChildren().addAll(profileButton, patientInformation, predictions);

        // Search view
        VBox tableBox = new VBox();
        ObservableList<ClientProfile> patientList = FXCollections.emptyObservableList();
        TableView<ClientProfile> patients = new TableView<>();
        patients.setItems(patientList);
        hBox.getChildren().add(tableBox);

        // Profile view
        VBox patientInfo = new VBox();
        ClientProfile currentPatient = patients.getSelectionModel().getSelectedItem();
        hBox.getChildren().add(patientInfo);
        hBox.getChildren().add(currentPatient);
    }
}