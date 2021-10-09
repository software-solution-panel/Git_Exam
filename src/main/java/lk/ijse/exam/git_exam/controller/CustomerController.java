package lk.ijse.exam.git_exam.controller;

import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.exam.git_exam.model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.ijse.exam.git_exam.model.Customer;
/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 10/9/21 | 2021-October-09[Saturday]
 */


public class CustomerController {

    public TextField txtCustomerName;
    public TextField txtCustomerId;
    public TextField txtCustomerAddress;
    public TextField txtCustomerContact;
    public Button btnAddCustomer;

    public void addCustomer(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String id = txtCustomerId.getText();
        String name = txtCustomerName.getText();
        String address = txtCustomerAddress.getText();
        String contact = txtCustomerContact.getText();

        Customer customer = new Customer(id,name,address,contact);

        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Customer VALUES (?,?,?,?)");
        stm.setString(1,customer.getId());
        stm.setString(2,customer.getName());
        stm.setString(3,customer.getAddress());
        stm.setString(4,customer.getContact());

        if (stm.executeUpdate()>0){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved!", ButtonType.OK).show();
        } else {
            new Alert(Alert.AlertType.WARNING,"Try Again!", ButtonType.OK).show();
        }

    }
}
