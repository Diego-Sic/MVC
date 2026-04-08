package testingfx.testingfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField firstNumberField;

    @FXML
    private TextField secondNumberField;

    @FXML
    private TextField resultField;

    @FXML
    private void concatenate() {
        Model model = new Model(
            firstNumberField.getText(),
            secondNumberField.getText()
        );
        resultField.setText(model.concatenate());
    }
}
