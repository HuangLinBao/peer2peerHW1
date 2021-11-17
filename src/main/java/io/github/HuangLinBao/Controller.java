package io.github.HuangLinBao;

import java.net.*;
import java.util.*;
import java.io.*;


import com.jfoenix.controls.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class Controller  {
    @FXML
    private JFXTextArea shown_msgs,send_msg;
    StringBuilder sb = new StringBuilder();


    public void print(ActionEvent actionEvent) {





        new Thread(() ->{

        }).start();


        sb.append("Ayyy: ").append(send_msg.getText()).append("\n");
        shown_msgs.setText(sb.toString());
        send_msg.clear();
    }
}