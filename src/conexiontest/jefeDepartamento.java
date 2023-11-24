/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conexiontest;

//import conexion.Conexion;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
/**
 *
 * @author javie
 */
public class jefeDepartamento extends javax.swing.JFrame {
  private final Conexion conexion = new Conexion(); 
  
   
    /**
     * Creates new form jefeDepartamento
     */
    public jefeDepartamento() {
        
        initComponents();
                cargarDatos();
                agregarEventos();

       // Agregar DocumentListener para la validación de longitud
        DocumentListener maxLengthListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarLongitud();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarLongitud();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarLongitud();
            }
        };

        nombreEntrada.getDocument().addDocumentListener(maxLengthListener);
        paternEntrada.getDocument().addDocumentListener(maxLengthListener);
        maternEntrada.getDocument().addDocumentListener(maxLengthListener);
      
      
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
        nombreEntrada = new javax.swing.JTextField();
        paternEntrada = new javax.swing.JTextField();
        maternEntrada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonGuardar = new javax.swing.JButton();
        botonMod = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
       // botonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IdEntrada = new javax.swing.JTextField();
        botonRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEntradaActionPerformed(evt);
            }
        });

        maternEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maternEntradaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre(s)");

        jLabel2.setText("Apelido Paterno");

        jLabel3.setText("Apellido Materno");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_JEFE_DEPARTAMENTO ", "NOMBRE", "APELLIDO_PATERNO", "APELLIDO_MATERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonMod.setText("Modificar");
        botonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        

        jLabel4.setText("ID Del Jefe");

        IdEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdEntradaActionPerformed(evt);
            }
        });

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
       
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Jefes De Departamnto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(IdEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                            .addComponent(nombreEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(paternEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(maternEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botonMod)
                                        .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonGuardar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonRegresar, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(IdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(paternEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maternEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botonGuardar)
                        .addGap(29, 29, 29)
                        .addComponent(botonMod)
                        .addGap(32, 32, 32)
                        .addComponent(botonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            ));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
      
        pack();
         
    }// </editor-fold>//GEN-END:initComponents

    private void maternEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maternEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maternEntradaActionPerformed

    private void nombreEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEntradaActionPerformed

    private void botonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModActionPerformed
        // TODO add your handling code here:
         
         actualizarDatos();
         cargarDatosSeleccionados();
    }//GEN-LAST:event_botonModActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
         //  MANDAR A MENU
        this.setVisible(false); 
                Menu menu = new Menu();
                menu.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
         guardarDatos();    
        cargarDatosSeleccionados();

    }//GEN-LAST:event_botonGuardarActionPerformed

    

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
        borrarDatos();
        
        
        
    }//GEN-LAST:event_botonBorrarActionPerformed

        private void IdEntradaFocusLost(java.awt.event.FocusEvent evt) {
    // Cuando el campo de texto pierde el foco, realizar la búsqueda automáticamente
    buscarPorID();
}

// Agrega este método al constructor para registrar el evento
    private void agregarEventos() {
    // Agregar evento FocusLost para realizar la búsqueda al perder el foco
    IdEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            IdEntradaFocusLost(evt);
        }
    });

    // Agregar evento KeyListener para realizar la búsqueda al presionar Enter
    IdEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                // Si la tecla presionada es Enter, realizar la búsqueda automáticamente
                buscarPorID();
            }
        }
    });
}


    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       
         // TODO add your handling code here:
        int filaSeleccionada = tabla.getSelectedRow();
        
        String ID_JEFE_DEPARTAMENTO = String.valueOf(tabla.getValueAt(filaSeleccionada, 0));
        
        String NOMBRE =(String) tabla.getValueAt(filaSeleccionada,1);
        
         String APELLIDO_PATERNO =(String) tabla.getValueAt(filaSeleccionada,2);
         
          String APELLIDO_MATERNO =(String) tabla.getValueAt(filaSeleccionada,3);
        
        IdEntrada.setText(ID_JEFE_DEPARTAMENTO);
        nombreEntrada.setText(NOMBRE);
        paternEntrada.setText(APELLIDO_PATERNO);
        maternEntrada.setText(APELLIDO_MATERNO);
        
    }//GEN-LAST:event_tablaMouseClicked

    private void IdEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdEntradaActionPerformed
 // Verifica la longitud de idEstado
String idEstado = IdEntrada.getText(); // Cambié el nombre de la variable para reflejar el ID del estado
int maxLengthIdEstado = 9; // Establece la longitud máxima permitida para el ID

if (idEstado.length() > maxLengthIdEstado) {
    String mensajeError = "El ID no puede tener más de " + maxLengthIdEstado + " caracteres.";
    JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
    return; // Sale del método si la validación falla
}

// Verifica la longitud de otros campos
int maxLengthNombre = 25; // Establece la longitud máxima permitida para el nombre
int maxLengthApellido = 25; // Establece la longitud máxima permitida para el apellido

String nombre = nombreEntrada.getText();
String apellidoPaterno = paternEntrada.getText();
String apellidoMaterno = maternEntrada.getText();

if (nombre.length() > maxLengthNombre || apellidoPaterno.length() > maxLengthApellido || apellidoMaterno.length() > maxLengthApellido) {
    String mensajeError = "El nombre y los apellidos no pueden tener más de " + maxLengthNombre + " caracteres.";
    JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
    return; // Sale del método si la validación falla
}


    }//GEN-LAST:event_IdEntradaActionPerformed
private void guardarDatos() {
    try {
        Connection con = conexion.getConnection();

        // Obtener datos de los campos
        int id = Integer.parseInt(IdEntrada.getText());
        String nombre = nombreEntrada.getText();
        String apellidoPaterno = paternEntrada.getText();
        String apellidoMaterno = maternEntrada.getText();

        // Verificar si ya existe un registro con la misma ID
        if (existeId(id)) {
            JOptionPane.showMessageDialog(this, "Ya existe un registro con este ID.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Insertar el nuevo registro
            String insertQuery = "INSERT INTO jefe_departamento (ID_JEFE_DEPARTAMENTO, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO) VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
                pstmt.setInt(1, id);
                pstmt.setString(2, nombre);
                pstmt.setString(3, apellidoPaterno);
                pstmt.setString(4, apellidoMaterno);

                pstmt.executeUpdate();
            }

            cargarDatos();
            limpiarCampos();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL para guardar datos. Consulta la consola para más detalles.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void cargarDatos() {
        try {
            Connection con = conexion.getConnection();
            String consulta = "SELECT * FROM jefe_departamento";
            PreparedStatement pstmt = con.prepareStatement(consulta);
            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);

            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                modelo.addColumn(rs.getMetaData().getColumnName(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    fila[i - 1] = rs.getObject(i);
                }
                modelo.addRow(fila);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL para cargar datos. Consulta la consola para más detalles.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
   private void buscarPorID() {
    try {
        Connection con = conexion.getConnection();
        String consulta = "SELECT * FROM jefe_departamento WHERE ID_JEFE_DEPARTAMENTO = ?";
        PreparedStatement pstmt = con.prepareStatement(consulta);

        String idText = IdEntrada.getText();

        if (!idText.isEmpty()) {
            try {
                int id = Integer.parseInt(idText);
                pstmt.setInt(1, id);

                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    // Obtener los datos de la consulta
                    String nombre = rs.getString("NOMBRE");
                    String apellidoPaterno = rs.getString("APELLIDO_PATERNO");
                    String apellidoMaterno = rs.getString("APELLIDO_MATERNO");

                    // Mostrar los datos en los JTextFields
                    nombreEntrada.setText(nombre);
                    paternEntrada.setText(apellidoPaterno);
                    maternEntrada.setText(apellidoMaterno);
                } else {
                    // Si no hay resultados, limpiar los campos
                    limpiarCampos();
                    JOptionPane.showMessageDialog(this, "No se encontraron resultados para el ID ingresado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }

                rs.close();
                pstmt.close();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo de ID no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL para buscar por ID. Consulta la consola para más detalles.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
private boolean existeId(int id) throws SQLException {
    Connection con = conexion.getConnection();
    String consulta = "SELECT COUNT(*) FROM jefe_departamento WHERE ID_JEFE_DEPARTAMENTO = ?";
    try (PreparedStatement pstmt = con.prepareStatement(consulta)) {
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        return count > 0;
    }
}    



private void cargarDatosSeleccionados() {
    // Obtener la fila seleccionada en la tabla
    int filaSeleccionada = tabla.getSelectedRow();

    if (filaSeleccionada != -1) {
        // Obtener los datos de la fila seleccionada (sin incluir el ID)
        String nombre = (String) tabla.getValueAt(filaSeleccionada, 1);
        String apellidoPaterno = (String) tabla.getValueAt(filaSeleccionada, 2);
        String apellidoMaterno = (String) tabla.getValueAt(filaSeleccionada, 3);

        // Cargar los datos en los campos correspondientes
        nombreEntrada.setText(nombre);
        paternEntrada.setText(apellidoPaterno);
        maternEntrada.setText(apellidoMaterno);
    }
}

private void actualizarDatos() {
    try {
        Connection con = conexion.getConnection();
        int id = Integer.parseInt(IdEntrada.getText());
        String nombre = nombreEntrada.getText();
        String apellidoPaterno = paternEntrada.getText();
        String apellidoMaterno = maternEntrada.getText();

        if (existeId(id)) {
            // Actualizar solo los datos restantes del registro
            String updateQuery = "UPDATE jefe_departamento SET NOMBRE=?, APELLIDO_PATERNO=?, APELLIDO_MATERNO=? WHERE ID_JEFE_DEPARTAMENTO=?";

            try (PreparedStatement pstmt = con.prepareStatement(updateQuery)) {
                pstmt.setString(1, nombre);
                pstmt.setString(2, apellidoPaterno);
                pstmt.setString(3, apellidoMaterno);
                pstmt.setInt(4, id);

                pstmt.executeUpdate();
            }

            // Cargar datos actualizados en la tabla
            cargarDatos();
            limpiarCampos();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El ID no existe. No se puede actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        e.printStackTrace();
        System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL. Consulta la consola para más detalles:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void limpiarCampos() {
    // Limpiar los campos de texto después de la actualización
    nombreEntrada.setText("");
    paternEntrada.setText("");
    maternEntrada.setText("");
}
private void borrarDatos() {
    try {
        Connection con = conexion.getConnection();

        // Obtener ID del campo
        int id = Integer.parseInt(IdEntrada.getText());

        // Verificar si existe un registro con la misma ID
        if (existeId(id)) {
            // Borrar el registro, independientemente de si tiene registros hijos
            String deleteQuery = "DELETE FROM jefe_departamento WHERE ID_JEFE_DEPARTAMENTO = ?";
            
            try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
            }

            // Cargar datos actualizados en la tabla
            cargarDatos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "El ID no existe. No se puede borrar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta SQL para borrar datos. Consulta la consola para más detalles.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean tieneRegistrosHijos(int id) throws SQLException {
    Connection con = conexion.getConnection();
    String query = "SELECT COUNT(*) FROM jefe_departamento WHERE ID_JEFE_DEPARTAMENTO = ?";
    
    try (PreparedStatement pstmt = con.prepareStatement(query)) {
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        System.out.println("Número de registros hijos para ID " + id + ": " + count);

        // Devuelve true si hay al menos un registro hijo, false si no hay registros hijos
        return count > 0;
    }
}


  private void validarLongitud() {
        int maxLongitud = 25; // Puedes ajustar este valor según tus requisitos

        if (nombreEntrada.getText().length() > maxLongitud ||
            paternEntrada.getText().length() > maxLongitud ||
            maternEntrada.getText().length() > maxLongitud) {
            JOptionPane.showMessageDialog(this, "La longitud máxima permitida es " + maxLongitud + " caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            // Puedes limpiar el campo o tomar otras acciones si lo deseas
        }
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jefeDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new jefeDepartamento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdEntrada;
    private javax.swing.JButton botonBorrar;
    //private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMod;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maternEntrada;
    private javax.swing.JTextField nombreEntrada;
    private javax.swing.JTextField paternEntrada;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

 
}        
       
  
        
              
        
