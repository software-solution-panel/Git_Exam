package lk.ijse.exam.git_exam.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.exam.git_exam.model.Item;

import java.sql.PreparedStatement;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 10/9/21 | 2021-October-09[Saturday]
 */
public class ItemView {
    public TextField txtItemCode;
    public TextField txtItemName;
    public TextField txtItemqty;
    public TextField txtItemUnitPrice;
    public Button btnAddItem;

    public void AddItem(ActionEvent actionEvent) {

        Item item = new Item(txtItemCode.getText(),txtItemName.getText(),txtItemqty.getText(),txtItemUnitPrice.getText());

        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO item VALUES (?,?,?,?)");
        stm.setString(1,item.getCode());
        stm.setString(2,item.getName());
        stm.setString(3,item.getQty());
        stm.setString(4,item.getUnitPrice());

        if (stm.executeUpdate()>0){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved!", ButtonType.OK).show();
        } else {
            new Alert(Alert.AlertType.WARNING,"Try Again!", ButtonType.OK).show();
        }

    }
}
