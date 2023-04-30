import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PDFSplitter extends JFrame {
    private JTextField inputFilePathField;
    private JTextField outputDirectoryPathField;
    private JSpinner startPageSpinner;
    private JSpinner endPageSpinner;
    private JButton splitButton;

    public PDFSplitter() {
        super("PDF Splitter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(mainPanel);

        JPanel formPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        mainPanel.add(formPanel, BorderLayout.CENTER);

        inputFilePathField = new JTextField();
        outputDirectoryPathField = new JTextField();
        startPageSpinner = new JSpinner(new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));
        endPageSpinner = new JSpinner(new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));

        formPanel.add(new JLabel("Input File Path:"));
        formPanel.add(inputFilePathField);
        formPanel.add(new JLabel("Output Directory Path:"));
        formPanel.add(outputDirectoryPathField);
        formPanel.add(new JLabel("Start Page:"));
        formPanel.add(startPageSpinner);
        formPanel.add(new JLabel("End Page:"));
        formPanel.add(endPageSpinner);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        splitButton = new JButton("Split");
        buttonPanel.add(splitButton);

        splitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputFilePath = inputFilePathField.getText();
                String outputDirectoryPath = outputDirectoryPathField.getText();
                int startPage = (int) startPageSpinner.getValue();
                int endPage = (int) endPageSpinner.getValue();

                // TODO: Add code to split PDF

                JOptionPane.showMessageDialog(null, "PDF split successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new PDFSplitter();
    }
}