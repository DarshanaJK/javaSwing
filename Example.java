import javax.swing.*;
import java.awt.*;
class AddCustomerForm extends JFrame{

    JLabel titleLable;
    JButton addButton, cancelButton;

    JLabel idLabel;
    JLabel nameLabel;
    JLabel addressLabel;
    JLabel salaryLabel;

    JTextField idTextField;
    JTextField nameTextField;
    JTextField addressTextField;
    JTextField salaryTextField;

    AddCustomerForm(){
        setSize(400,400);
        setTitle("AddCustomerForm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        titleLable = new JLabel("Add Customer Form");
        titleLable.setFont(new Font("", Font.BOLD, 35));
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        add("North", titleLable);

        JPanel centerJPanel = new JPanel(new GridLayout(4,2));


        idLabel = new JLabel("ID : ");
        idLabel.setFont(new Font("", Font.BOLD, 15));
        JPanel idLabelPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        idLabelPanel.add(idLabel);
        centerJPanel.add(idLabelPanel);

        idTextField = new JTextField(5);
        idTextField.setFont(new Font("", Font.BOLD, 15));
        JPanel idTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idTextPanel.add(idTextField);
        centerJPanel.add(idTextPanel);



        nameLabel = new JLabel("Name : ");
        nameLabel.setFont(new Font("", Font.BOLD, 15));
        JPanel nameLabelPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        nameLabelPanel.add(nameLabel);
        centerJPanel.add(nameLabelPanel);

        nameTextField = new JTextField(12);
        nameTextField.setFont(new Font("", Font.BOLD, 15));
        JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameTextPanel.add(nameTextField);
        centerJPanel.add(nameTextPanel);



        addressLabel = new JLabel("Address : ");
        addressLabel.setFont(new Font("", Font.BOLD, 15));
        JPanel addressLabelPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addressLabelPanel.add(addressLabel);
        centerJPanel.add(addressLabelPanel);

        addressTextField = new JTextField(15);
        addressTextField.setFont(new Font("", Font.BOLD, 15));
        JPanel addressTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        addressTextPanel.add(addressTextField);
        centerJPanel.add(addressTextPanel);



        salaryLabel = new JLabel("Salary : ");
        salaryLabel.setFont(new Font("", Font.BOLD, 15));
        JPanel salaryLabelPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        salaryLabelPanel.add(salaryLabel);
        centerJPanel.add(salaryLabelPanel);

        salaryTextField = new JTextField(6);
        salaryTextField.setFont(new Font("", Font.BOLD, 15));
        JPanel salaryTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        salaryTextPanel.add(salaryTextField);
        centerJPanel.add(salaryTextPanel);

        add("Center", centerJPanel);



        addButton = new JButton("Add");
        addButton.setFont(new Font("", Font.BOLD, 16));

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("", Font.BOLD, 16));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(addButton);
        buttonPanel.add(cancelButton);

        add("South", buttonPanel);

        setVisible(true);
    }
}
class Example{
    public static void main(String[] args) {
        new AddCustomerForm();
    }
}