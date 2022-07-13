package com.whj.jiaoben.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;
/**
 * @Author: Whj
 * @Description: 秒杀页面处理类
 * @Date: 2022/7/12 14:58
 */

@FXMLController
public class MainViewController implements Initializable {


    ObservableList<String> chooseValues =  FXCollections.observableArrayList("openSea","淘宝");

    public static final String HHF = "\n";

    @FXML
    private Button miaoShaButton;

    @FXML
    private TextField buyDate;

    @FXML
    private TextField prise;

    @FXML
    private TextField nftUrl;

    @FXML
    private ChoiceBox nftSort;

    @FXML
    private TextArea log;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nftSort.setItems(chooseValues);
    }

    @FXML
    public void miaoSha(){

        log.appendText("输入信息为："+buyDate.getCharacters().toString()+prise.getCharacters()+HHF);
        try {
            System.out.println(buyDate.getCharacters());
            System.out.println(prise.getCharacters());
            System.out.println(nftUrl.getCharacters());
            System.out.println(nftSort.getSelectionModel().getSelectedItem().toString());
        }catch (Exception e){
            log.appendText("异常："+e.getMessage()+HHF);
        }

    }
}
