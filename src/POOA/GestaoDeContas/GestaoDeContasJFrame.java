
package POOA.GestaoDeContas;

import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author dr. Fundo
 */
public class GestaoDeContasJFrame extends javax.swing.JFrame {

    Conta conta;
    ArrayList<Conta> contas = new ArrayList<>();
    private final String TAG="Campo Vazio";
   public GestaoDeContasJFrame() {
        initComponents();
        btnEdit.setEnabled(false);
        btnRemove.setEnabled(false);
        btnShow.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableResult = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        inputNumConta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputTitular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputSaldo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestao de contas");
        setLocation(new java.awt.Point(380, 120));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        tableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero da Conta", "Titular", "Saldo"
            }
        ));
        tableResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableResult);

        inputNumConta.setName("inputNumConta"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel1.setText("Numero da Conta");

        inputTitular.setName("inputNumConta"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel2.setText("Titular");

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel4.setText("Saldo");

        inputSaldo.setName("inputNumConta"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNumConta)
                    .addComponent(inputTitular)
                    .addComponent(inputSaldo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd.setBackground(new java.awt.Color(19, 206, 19));
        btnAdd.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 204, 255));
        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setBackground(java.awt.Color.red);
        btnRemove.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnRemove.setText("Eliminar");
        btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnShow.setBackground(java.awt.Color.blue);
        btnShow.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnShow.setForeground(java.awt.Color.white);
        btnShow.setText("Actualizar");
        btnShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botao para adicionar
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            
            if(inputNumConta.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Insira o numero da conta", TAG, HEIGHT);                
                return;
            }
            if(inputTitular.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Insira o nome do titular", TAG, HEIGHT);
                return;
            }
            if(inputSaldo.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Insira o seu saldo incial", TAG, HEIGHT);
                return;
            }
            conta = new Conta(Integer.parseInt(inputNumConta.getText()), inputTitular.getText(), Double.parseDouble(inputSaldo.getText()));
            
            contas.add(conta);
            
            JOptionPane.showMessageDialog(rootPane,inputTitular.getText(), "Sucesso", WIDTH);
            
            ActualizarDados();
            
        }catch (NumberFormatException e) {
            String errorMessage;
            if (!inputNumConta.getText().matches("\\d+")) {
                errorMessage = "O número da conta deve ser um valor inteiro.";
            } else if (!inputSaldo.getText().matches("\\d+(\\.\\d+)?")) {
                errorMessage = "O saldo inicial deve ser um valor numérico.";
            } else {
                errorMessage = "Ocorreu um erro ao processar os dados da conta.";
            }
            JOptionPane.showMessageDialog(rootPane, errorMessage, "Erro", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnAddActionPerformed

        //Botao para actualizar
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        try {
               tableResult.getSelectedRow();
//        int resposta = ;
    if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente atualizar?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            tableResult.getSelectedRow();
            contas.set(tableResult.getSelectedRow(), new Conta(Integer.parseInt(inputNumConta.getText()), inputTitular.getText(), Double.parseDouble(inputSaldo.getText())));
            
    }
        } catch (Exception e) {
            
        } finally {
            ActualizarDados();
            limparCampos();
            btnEdit.setEnabled(false);
            btnShow.setEnabled(false);
        }
     
    }//GEN-LAST:event_btnShowActionPerformed

    //Clique da linha da tabela 
    private void tableResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResultMouseClicked
        if(tableResult.getSelectedRow()>=0){
            btnEdit.setEnabled(true);
            btnRemove.setEnabled(true);
            tuplaSelecionada();
        } 
    }//GEN-LAST:event_tableResultMouseClicked

    //Botao para editar
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (tuplaSelecionada() >= 0) {
            Conta contaSelecionada = contas.get(tuplaSelecionada());
            inputNumConta.setText(String.valueOf(contaSelecionada.getNumConta()));
            inputTitular.setText(contaSelecionada.getTitular());
            inputSaldo.setText(String.valueOf(contaSelecionada.getSaldo()));
            btnShow.setEnabled(true);
        }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha para editar", "Erro", JOptionPane.ERROR_MESSAGE);
        }
     
        
    }//GEN-LAST:event_btnEditActionPerformed

    //Botao para apagar
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            contas.remove(tuplaSelecionada());
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "Sem nehum registro", "Empty",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    public static void main(String args[]) {
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoDeContasJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnShow;
    private javax.swing.JTextField inputNumConta;
    private javax.swing.JTextField inputSaldo;
    private javax.swing.JTextField inputTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableResult;
    // End of variables declaration//GEN-END:variables


// Methods declaration

    //Mostrar dados na tabela
    public void ActualizarDados(){
        DefaultTableModel dtm = (DefaultTableModel) tableResult.getModel();
        dtm.setRowCount(0);  
        //Actualizar em vez de incrementar
        for (Conta conta1 : contas) {
            dtm.addRow(new Object[]{conta1.getNumConta(), conta1.getTitular(), conta1.getSaldo()});
        }
    }

    //
    public int tuplaSelecionada(){
        return tableResult.getSelectedRow();
    }
// End of methods declaration                   

    private void limparCampos() {
            inputNumConta.setText("");
            inputTitular.setText("");
            inputSaldo.setText("");
    }


}
