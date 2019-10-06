/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.net.URL;
import static java.util.Collections.list;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 *
 * @author shraddhabelbase
 */
public class FXMLDocumentController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }  
    @FXML
    ImageView img;
    @FXML
    Button addButton;
    @FXML
    TextField addAssignment;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> addList;
    
    
    ObservableList<LocalEvent> list = FXCollections.observableArrayList();
    
    @FXML
    private void addEvent(Event h){
        list.add(new LocalEvent(datePicker.getValue(), addAssignment.getText()));
        addList.setItems(list);
        
    }
   
    }
    
    
    
    
    

