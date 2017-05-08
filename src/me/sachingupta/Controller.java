package me.sachingupta;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller implements Constraints {


    byte[] num1= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    final Registers RAX=new Registers("AX",AX,"00");
    final Registers RAH=new Registers("AX",AH,"00");
    final Registers RAL=new Registers("AX",AL,"00");

    final Registers RBX=new Registers("AX",BX,"00");
    final Registers RBH=new Registers("AX",BH,"00");
    final Registers RBL=new Registers("AX",BL,"00");

    final Registers RCX=new Registers("AX",CX,"00");
    final Registers RCH=new Registers("AX",CH,"00");
    final Registers RCL=new Registers("AX",CL,"00");

    final Registers RDX=new Registers("AX",DX,"00");
    final Registers RDH=new Registers("AX",DH,"00");
    final Registers RDL=new Registers("AX",DL,"00");

    final Registers RFLAG=new Registers("AX",FLAG,"00");


    /**
     * FXML related Code goes Here means code the GUI activities.
     */
    @FXML
    private TextArea editor;
    @FXML
    private Button assemble;

    @FXML
    public void handleAssembleButton(){

    }



}
