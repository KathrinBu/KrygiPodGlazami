package com.example.krygipodglazami;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {
    @FXML
    TextField x1tf;
    @FXML
    TextField y1tf;
    @FXML
    TextField r1tf;
    @FXML
    TextField x2tf;
    @FXML
    TextField y2tf;
    @FXML
    TextField r2tf;
    @FXML
    Button vvodZnacheniy;
    @FXML
    TextField result;

    SimpleDoubleProperty x1 = new SimpleDoubleProperty();
    SimpleDoubleProperty y1 = new SimpleDoubleProperty();
    SimpleDoubleProperty r1 = new SimpleDoubleProperty();
    SimpleDoubleProperty x2 = new SimpleDoubleProperty();
    SimpleDoubleProperty y2 = new SimpleDoubleProperty();
    SimpleDoubleProperty r2 = new SimpleDoubleProperty();
    SimpleDoubleProperty res = new SimpleDoubleProperty();


    public void initialize() {
        x1tf.textProperty().bindBidirectional(x1, new DecimalFormat());
        y1tf.textProperty().bindBidirectional(y1, new DecimalFormat());
        r1tf.textProperty().bindBidirectional(r1, new DecimalFormat());
        x2tf.textProperty().bindBidirectional(x2, new DecimalFormat());
        y2tf.textProperty().bindBidirectional(y2, new DecimalFormat());
        r2tf.textProperty().bindBidirectional(r2, new DecimalFormat());
        result.textProperty().bindBidirectional(res, new DecimalFormat());

        x1tf.setOnAction(a->doTeorema(x1.intValue(),y1.intValue(),x2.intValue(),y2.intValue(),r1.intValue(), r2.intValue()));
   }

    @FXML
    public void doTeorema(int x1, int y1, int x2, int y2, int r1, int r2) {
        int r= (int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
       if((r1+r2)>=r && (r+r2)>=r1 && (r+r1)>=r2 ){
           result.setText("YES");
       } else {
           result.setText("NO");
       }

    }
}