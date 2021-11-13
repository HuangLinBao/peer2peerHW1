package io.github.HuangLinBao;

import java.net.*;
import java.util.*;
import java.io.*;


import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller  {
    @FXML
    private JFXTextArea shown_msgs;
    StringBuilder sb = new StringBuilder();


    public void print(ActionEvent actionEvent) {
        sb.append("khello" + "\n");
        shown_msgs.setText(sb.toString());
    }
}