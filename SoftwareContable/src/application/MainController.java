package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class MainController {
	
	@FXML
	private TextField txtActivosCorreinte;
	
	@FXML
	private TextField txtActivosNoCorreinte;
	
	@FXML
	private TextField txtPasivosCorreinte;
	
	@FXML
	private TextField txtPasivosNoCorreinte;
	
	@FXML
	private TextField txtPasivosPatrimonio;
	
	@FXML
	private TextField txtActivos;
	
	@FXML
	private GridPane gridActivosCorrientes;
	
	@FXML
	private GridPane gridActivosNoCorrientes;
	
	@FXML
	private GridPane gridPasivosCorrientes;
	
	@FXML
	private GridPane gridPasivosNoCorrientes;
	
	@FXML
	private GridPane gridPatrimonio;
	
	@FXML
	private ScrollPane scrollActivosCorreintes;
	
	@FXML
	private ScrollPane scrollActivosNoCorreintes;
	
	@FXML
	private ScrollPane scrollPasivosCorreintes;
	
	@FXML
	private ScrollPane scrollPasivosNoCorreintes;
	
	@FXML
	private ScrollPane scrollPatrimonio;
	
	@FXML
	private ComboBox<String> cbTipoCuenta;
	
	@FXML
	private TextField txtTipoCuenta;
	
	@FXML
	private Button agregar;
	
	
}
