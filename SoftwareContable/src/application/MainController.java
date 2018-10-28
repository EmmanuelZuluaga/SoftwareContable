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
	
	@FXML
	private Button iniciar;
	
	@FXML
	private TextField txtNombreEmpresa;
	
	@FXML
	private TextField txtPeriodo;
	
	@FXML
	private RadioButton rbBalanceGeneral;
	
	@FXML
	private RadioButton rbEstadoResultados;
	
	@FXML
	private ToggleGroup tipoInforme;
	
	@FXML
	private Pane panelInicio;
	
	@FXML
	private Pane panelBalanceGeneral;
	
	@FXML
	private Pane panelEstadoResultados;
	
	@FXML
	private TextField txtVentas;
	
	@FXML
	private TextField txtCostoVentas;
	
	@FXML
	private TextField txtUBruta;
	
	@FXML
	private TextField txtGOperacionales;
	
	@FXML
	private TextField txtUOperacional;
	
	@FXML
	private TextField txtOIngresos;
	
	@FXML
	private TextField txtOIngresosFinancieros;
	
	@FXML
	private TextField txtUAntesImp;
	
	@FXML
	private TextField txtImpRenta;
	
	@FXML
	private TextField txtUDespuesImp;
	
	@FXML
	private TextField txtReservas;
	
	@FXML
	private TextField txtUNeta;
	
	@FXML
	private TextField txtPorImpRenta;
	
	@FXML
	private TextField txtPorReservas;
	
	@FXML
	private TextField txtRentaNeta;
	
	@FXML
	private TextField txtRentaBruta;
	
	@FXML
	private TextField txtEndeudamiento;
	
	public void initilize() {
		
	}
}
