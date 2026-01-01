import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class POSController {

    private TextField txtName = new TextField();
    private TextField txtPrice = new TextField();
    private Label lblTotal = new Label("Total: 0.00");

    private double total = 0;

    public VBox getView() {
        txtName.setPromptText("Item Name");
        txtPrice.setPromptText("Item Price");

        Button btnAdd = new Button("Add Item");

        btnAdd.setOnAction(e -> addItem());

        VBox vbox = new VBox(10,
                new Label("Thogakade POS"),
                txtName,
                txtPrice,
                btnAdd,
                lblTotal
        );

        return vbox;
    }

    private void addItem() {
        String name = txtName.getText();
        double price = Double.parseDouble(txtPrice.getText());

        Item item = new Item(name, price);
        total += item.getPrice();

        lblTotal.setText("Total: " + total);

        txtName.clear();
        txtPrice.clear();
    }
}
