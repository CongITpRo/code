package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import model.TextModel;
import utils.FileWorking;
import view.Menu;
import view.TextView;

public class TextController extends Menu {
    
    public TextController() {
        super("Nomalize Text", new String[]{"Load input file", "Nomarlize text", "Print output file"});
    }
    
    TextView txtView = new TextView();
    TextModel txtModel = new TextModel();

    @Override
    public void select(int n) {
        switch (n) {
            case 1:
                txtView.input(txtModel);
                break;
            case 2:
                txtView.nomalize(txtModel);
                break;
            case 3: {
                txtView.output(txtModel);
                break;

            
        }
    }
    }}
    