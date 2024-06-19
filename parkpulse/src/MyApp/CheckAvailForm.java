package MyApp;

import MyLibs.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CheckAvailForm extends javax.swing.JFrame {

    public static Date tempDate;
    public static CarRecords tempCarRec;
    public static CustRecords tempCustRec;

    /**
     * Creates new form ViewReportsForm
     */
    public CheckAvailForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane7 = new javax.swing.JScrollPane();
        AvailFormTable = new javax.swing.JTable();
        RentButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 300));

        AvailFormTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero do  Veiculo", "Marca Veiculo", "Modelo Veiculo", "Vaga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(AvailFormTable);

        RentButton.setText("Vaga");
        RentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione um carro para adicionar em uma vaga.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(RentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentButtonActionPerformed
        // TODO add your handling code here:
        CarRecordsForm.choice = Integer.parseInt(jTextField1.getText());

        int chosen = CarRecordsForm.choice;
        Customer cust1 = new Customer(1, "John", "Smith", "Debit Card", chosen);
        tempCustRec.addCustomer(cust1);
        for (Car chosenCar : tempCarRec.getAllCars()) {
            if (chosenCar.getCarNum() == chosen) {
                chosenCar.setRentedStatus(true);
                chosenCar.setEndRent(tempDate);
                chosenCar.setRenterName(cust1.getLastName());
            }
        }
        JOptionPane.showMessageDialog(this,
                "Successfully rented car to customer.",
                "Success",
                JOptionPane.INFORMATION_MESSAGE,
                CarRecordsForm.info_icon);
        this.setVisible(false);

    }//GEN-LAST:event_RentButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public JTable getAvailFormTable() {
        return AvailFormTable;
    }

    public void setAvailFormTable(JTable AvailFormTable) {
        this.AvailFormTable = AvailFormTable;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AvailFormTable;
    private javax.swing.JButton RentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
