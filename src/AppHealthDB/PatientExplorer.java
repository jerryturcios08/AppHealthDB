package AppHealthDB;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 * @author jerryturcios08
 */
class PatientExplorer {
    void explorer() {
        Stage thirdStage = new Stage();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 1440, 900);

        thirdStage.setTitle("Patient Explorer");
        thirdStage.setScene(scene);
        thirdStage.show();

        HBox topBar = new HBox();
        TextField searchBar = new TextField();
        Button search = new Button("Search");
        Button profileButton = new Button("Profile");
        Button patientInformation = new Button("View Patient Information");
        Button predictions = new Button("Patient Analysis");
        topBar.getChildren().addAll(searchBar, search, profileButton, patientInformation, predictions);
        
        VBox tableBox = new VBox();
        ObservableList<ClientProfile> patientList = FXCollections.emptyObservableList();
        TableView<ClientProfile> patients = new TableView<ClientProfile>();
        patients.setItems(patientList);
        
        VBox patientInfo = new VBox();
        ClientProfile currentPatient = (ClientProfile)patients.getSelectionModel().getSelectedItem();
    }
}
