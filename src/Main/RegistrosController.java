/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */
public class RegistrosController implements Initializable {
   @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nombrePaciente;

    @FXML
    private TextField apellidoPaciente;

    @FXML
    private TextField edadPaciente;

    @FXML
    private ChoiceBox<?> genero;

    @FXML
    private ChoiceBox<?> sintoma;

    @FXML
    private Button guardarPaciente;

    @FXML
    private TextField nombreDoctor;

    @FXML
    private TextField apellidoDoctor;

    @FXML
    private TextField especialidad;

    @FXML
    private Button guardarDoctor;

    @FXML
    private TextField numeroPuesto;

    @FXML
    private TextField medicoPuesto;

    @FXML
    private ComboBox<?> eliminarPuesto;

    @FXML
    private Button guardarPuesto;

    @FXML
    void guardarDoctor(ActionEvent event) {
        
    }

    @FXML
    void guardarPaciente(ActionEvent event) {
        //Codigo para guardar paciente
        SitemaPrincipalController principal = SitemaPrincipalController.getInstance();
        
    }

    @FXML
    void guardarPuesto(ActionEvent event) {

    }
   
    
    @FXML
    private Button btnRegistroPaciente,btnRegistroDoctor,btnCrearPuesto,btnEliminarPuesto;
    @FXML
    private AnchorPane hRegistroPaciente,hEliminarPuesto,hCrearPuesto,hRegistroDoctores;
    @FXML
    private void handleButtonAction(Event event){
        
        if(event.getTarget()==btnRegistroPaciente){
            hRegistroPaciente.setVisible(true); hRegistroDoctores.setVisible(false);
            hCrearPuesto.setVisible(false);hEliminarPuesto.setVisible(false);
     
        }
         if(event.getTarget()==btnRegistroDoctor){
            hRegistroPaciente.setVisible(false); hRegistroDoctores.setVisible(true);
            hCrearPuesto.setVisible(false);hEliminarPuesto.setVisible(false);
     
        }
          if(event.getTarget()==btnCrearPuesto){
            hRegistroPaciente.setVisible(false); hRegistroDoctores.setVisible(false);
            hCrearPuesto.setVisible(true);hEliminarPuesto.setVisible(false);
     
        }
           if(event.getTarget()==btnEliminarPuesto){
            hRegistroPaciente.setVisible(false); hRegistroDoctores.setVisible(false);
            hCrearPuesto.setVisible(false);hEliminarPuesto.setVisible(true);
     
        }
    }
 
    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
