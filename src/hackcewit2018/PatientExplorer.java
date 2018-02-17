package hackcewit2018;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PatientExplorer {
    public void explorer(Stage secondaryStage) {
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
