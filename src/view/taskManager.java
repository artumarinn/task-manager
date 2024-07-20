/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TaskController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.DbConnection;


/**
 *
 * @author marin
 */
public class taskManager extends javax.swing.JFrame {
   

    /**
     * Creates new form taskManager
     */
    public taskManager() {
        initComponents();
        fillResponsableComboBox();
        setupTableModel();
        setupTableModelListener();
        setupTableModelListener();
        setupEstadoColumnEditor();
    }
    
    private void fillResponsableComboBox() {
        try {
            ResultSet rs = DbConnection.getUserNames();
            while (rs.next()) {
                boxResponsable.addItem(rs.getString("nombre_completo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los responsables: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        boxPrioridad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        boxResponsable = new javax.swing.JComboBox<>();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nueva Tarea");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripcion:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel4.setText("Responsable:");

        jLabel5.setText("Fecha Limite:");

        jLabel6.setText("Prioridad:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Estado", "Responsable", "Fecha", "Prioridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado:");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin empezar", "En proceso", "Terminado" }));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });

        boxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja\t", "Media", "Alta", " " }));
        boxPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPrioridadActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tareas");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(txtFecha)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(txtNombre)
                        .addComponent(jLabel7)
                        .addComponent(boxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxPrioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxResponsable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(boxResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(boxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnAgregar)
                            .addComponent(btnListar))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupTableModel() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"ID", "Nombre", "Descripción", "Estado", "Responsable", "Fecha Límite", "Prioridad"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Permitir la edición de todas las celdas excepto la de ID
                return column != 0;
            }
        };
        tabla.setModel(model);
    }
    private JComboBox<String> createEstadoComboBox() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Sin empezar");
        comboBox.addItem("En proceso");
        comboBox.addItem("Terminado");
        return comboBox;
    }

    private void setupEstadoColumnEditor() {
        TableColumn estadoColumn = tabla.getColumnModel().getColumn(3); // Asumiendo que la columna "Estado" es la cuarta columna (índice 3)
        estadoColumn.setCellEditor(new DefaultCellEditor(createEstadoComboBox()));
    }

    private void setupTableModelListener() {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                int row = e.getFirstRow();
                int column = e.getColumn();
            
            // Verifica que el índice sea válido
                if (row >= 0 && row < model.getRowCount() && column >= 0 && column < model.getColumnCount()) {
                    String columnName = model.getColumnName(column);
                    Object newValue = model.getValueAt(row, column);

                    int id = (int) model.getValueAt(row, 0);
                    updateDatabase(id, columnName, newValue);
                } else {
                    System.out.println("Índice fuera de rango: fila " + row + ", columna " + column);
                }
            }
        });
    }
    
    private void updateDatabase(int id, String columnName, Object newValue) {
        String columnDbName = "";
        switch (columnName) {
            case "Nombre":
                columnDbName = "nombre";
                break;
            case "Descripción":
                columnDbName = "descripcion";
                break;
            case "Estado":
                columnDbName = "estado";
                break;
            case "Responsable":
                columnDbName = "responsable";
                break;
            case "Fecha Límite":
                columnDbName = "fecha_limite";
                break;
            case "Prioridad":
                columnDbName = "prioridad";
                break;
        }

        if (columnDbName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error en la columna editada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "UPDATE task SET " + columnDbName + " = ? WHERE id = ?";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setObject(1, newValue);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Tarea actualizada en la base de datos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la tarea en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        String nombre = txtNombre.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        String estado = (String) boxEstado.getSelectedItem();
        String responsable = (String) boxResponsable.getSelectedItem();
        String fecha_limite = txtFecha.getText().trim();
        String prioridad = (String) boxPrioridad.getSelectedItem();

        if (!fecha_limite.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "El formato de fecha debe ser YYYY-MM-DD", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nombre.isEmpty()) {
            try (Connection conn = DbConnection.getConnection()) {
                String sql = "INSERT INTO task (nombre, descripcion, estado, responsable, fecha_limite, prioridad) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    pstmt.setString(1, nombre);
                    pstmt.setString(2, descripcion);
                    pstmt.setString(3, estado);
                    pstmt.setString(4, responsable);
                    pstmt.setString(5, fecha_limite);
                    pstmt.setString(6, prioridad);
                    pstmt.executeUpdate();

                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int id = generatedKeys.getInt(1);
                            model.addRow(new Object[]{id, nombre, descripcion, estado, responsable, fecha_limite, prioridad});
                        } else {
                            throw new SQLException("No se pudo obtener el ID.");
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Tarea agregada a la base de datos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al agregar la tarea a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo de nombre está vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void boxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstadoActionPerformed

    private void boxPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPrioridadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tabla.getSelectedRow();
    
        if (selectedRow >= 0) {
          // Obtener el ID de la tarea seleccionada
            int id = (Integer) tabla.getValueAt(selectedRow, 0);
        
        // Eliminar la tarea de la base de datos
             deleteFromDatabase(id);
        
        // Eliminar la tarea de la tabla
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.removeRow(selectedRow);
         } else {
             JOptionPane.showMessageDialog(this, "Selecciona una tarea para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        listarTareas();
    }//GEN-LAST:event_btnListarActionPerformed
    
    private void listarTareas() {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    // Limpia la tabla antes de listar
    model.setRowCount(0);

    String sql = "SELECT id, nombre, descripcion, estado, responsable, fecha_limite, prioridad FROM task";

    try (Connection conn = DbConnection.getConnection(); 
         PreparedStatement pstmt = conn.prepareStatement(sql); 
         ResultSet rs = pstmt.executeQuery()) {

        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            String estado = rs.getString("estado");
            String responsable = rs.getString("responsable");
            String fecha_limite = rs.getString("fecha_limite");
            String prioridad = rs.getString("prioridad");

            // Agrega cada fila al modelo
            model.addRow(new Object[]{id, nombre, descripcion, estado, responsable, fecha_limite, prioridad});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener las tareas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void deleteFromDatabase(int id) {
        String sql = "DELETE FROM task WHERE id = ?";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Tarea eliminada de la base de datos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar la tarea de la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            taskManager v = new taskManager();
            TaskController tc = new TaskController(v);
            v.setVisible(true);
            v.setLocationRelativeTo(null);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxPrioridad;
    private javax.swing.JComboBox<String> boxResponsable;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tabla;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTable getJTable1() {
        return tabla;
    }
}
