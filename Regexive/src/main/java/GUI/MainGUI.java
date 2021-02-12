/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pablo
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MiFrame
     */
    public Color bagkround_color = new Color(50, 50, 50);
    public Color secondary_color = new Color(50, 50, 50);
    public Color font_color = new Color(230, 230, 230);

    public static String main_path = System.getProperty("user.dir") + "\\src\\main\\java";

    public MainGUI() {
        initComponents();
        setLocationRelativeTo(null);
        
        image_label.setIcon(new ImageIcon(main_path+"\\icon\\open-file-icon.png"));
        
        // THEME
//        this.getContentPane().setBackground(new Color(50, 50, 50));
//        input_text.setBackground(secondary_color);
//        input_text.setForeground(font_color);
//        output_text.setBackground(secondary_color);
//        output_text.setForeground(font_color);
//        tree_temp.setBackground(secondary_color);
//        tree_temp.setForeground(font_color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output_text = new javax.swing.JTextArea();
        generate_button = new javax.swing.JToggleButton();
        analize_button = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        input_text = new javax.swing.JTextArea();
        image_combobox = new javax.swing.JComboBox<>();
        previous_button = new javax.swing.JToggleButton();
        next_button = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree_temp = new javax.swing.JTree();
        image_label = new javax.swing.JLabel();
        file_name_label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        new_dialog = new javax.swing.JMenuItem();
        open_dialog = new javax.swing.JMenuItem();
        save_dialog = new javax.swing.JMenuItem();
        saveas_dialog = new javax.swing.JMenuItem();
        generate_dialog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        jLabel1.setText("Archivo de entrada:");

        output_text.setEditable(false);
        output_text.setBackground(new java.awt.Color(25, 25, 25));
        output_text.setColumns(20);
        output_text.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        output_text.setForeground(new java.awt.Color(102, 255, 102));
        output_text.setRows(5);
        jScrollPane2.setViewportView(output_text);

        generate_button.setText("Generar Autómata");
        generate_button.setEnabled(false);
        generate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_buttonActionPerformed(evt);
            }
        });

        analize_button.setText("Analizar Entrada");
        analize_button.setEnabled(false);

        jLabel2.setText("Salida");

        input_text.setColumns(20);
        input_text.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        input_text.setRows(5);
        input_text.setText("No hay archivo de entrada\nAbre uno o crea uno nuevo");
        input_text.setEnabled(false);
        jScrollPane3.setViewportView(input_text);

        image_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Árboles", "Siguientes", "Transiciones", "Autómatas" }));
        image_combobox.setEnabled(false);

        previous_button.setText("Anterior");
        previous_button.setEnabled(false);

        next_button.setText("Siguiente");
        next_button.setEnabled(false);
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        tree_temp.setEnabled(false);
        jScrollPane1.setViewportView(tree_temp);

        image_label.setBackground(new java.awt.Color(102, 102, 102));
        image_label.setForeground(new java.awt.Color(51, 51, 255));
        image_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        image_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image_labelMouseClicked(evt);
            }
        });

        file_name_label.setText("ninguno");

        jMenu1.setText("Archivo");

        new_dialog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new_dialog.setText("Nuevo");
        new_dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_dialogActionPerformed(evt);
            }
        });
        jMenu1.add(new_dialog);

        open_dialog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_dialog.setText("Abrir");
        open_dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_dialogActionPerformed(evt);
            }
        });
        jMenu1.add(open_dialog);

        save_dialog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_dialog.setText("Guardar");
        save_dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_dialogActionPerformed(evt);
            }
        });
        jMenu1.add(save_dialog);

        saveas_dialog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveas_dialog.setText("Guardar como...");
        saveas_dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveas_dialogActionPerformed(evt);
            }
        });
        jMenu1.add(saveas_dialog);

        generate_dialog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        generate_dialog.setText("Generar XML de salida");
        generate_dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_dialogActionPerformed(evt);
            }
        });
        jMenu1.add(generate_dialog);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(generate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addComponent(analize_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(previous_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(image_label, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(file_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(image_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(file_name_label))
                    .addComponent(image_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(image_label, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(next_button)
                            .addComponent(previous_button)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generate_button)
                            .addComponent(analize_button))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //================================>> ACTIONS <<=========================================
    
    public String file_name = null;
    public Boolean saved = false;

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next_buttonActionPerformed

    private void open_dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_dialogActionPerformed

        if (saved==false){
            //guardar
        }
        
        FileInputStream inputStream = null;

        try {
            File file = openFile(this);
            inputStream = new FileInputStream(file);
            input_text.setText(readFromInputStream(inputStream));
                        
            Output("Se cargó el archivo " + file.toString());
        } catch (FileNotFoundException ex) {
            Output("No se pudo cargar el archivo");
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_open_dialogActionPerformed

    private void generate_dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_dialogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generate_dialogActionPerformed

    private void save_dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_dialogActionPerformed
        
        if (file_name.isEmpty()){
            try {
                String filename = saveFileAs(this);
                setFileName(filename);
                
                Output("Se guardó el archivo exitosamente");
            } catch (Exception e) {
                Output("No se pudo guardar el archivo");
            }
        }
        else{        
            try {
                saveFile();
                Output("Se guardó el archivo exitosamente");
            } catch (Exception e) {
                Output("No se pudo guardar el archivo");
            }
            
        }
    }//GEN-LAST:event_save_dialogActionPerformed

    private void saveas_dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveas_dialogActionPerformed
        try {
            String filename = saveFileAs(this);
            System.out.println(filename);
            setFileName(filename);
            
            Output("Se guardó el archivo exitosamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Output("No se pudo guardar el archivo");
        }
    }//GEN-LAST:event_saveas_dialogActionPerformed

    private void new_dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_dialogActionPerformed
        
        if (saved==false){
            //guardar
        }
        
        input_text.setEnabled(true);
        input_text.setText("");
        
        generate_button.setEnabled(true);
        analize_button.setEnabled(true);
        
        file_name = "";
        file_name_label.setText("unnamed.olc");
    }//GEN-LAST:event_new_dialogActionPerformed

    private void generate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_buttonActionPerformed
        Output("que pedo");
    }//GEN-LAST:event_generate_buttonActionPerformed

    private void image_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image_labelMouseClicked
        ImageGUI img_frame = new ImageGUI();
        img_frame.setImage(image_combobox.getSelectedItem().toString(), image_label.getIcon());
        img_frame.setVisible(true);
    }//GEN-LAST:event_image_labelMouseClicked

    //================================>> MISC <<=========================================
    public void Output(String text){
        output_text.append(text+"\n");
    }    
    
    public void setFileName(String text){
        file_name = text;
        file_name_label.setText(file_name);
    }
    
    public JFileChooser fileChooser;

    private File openFile(final JFrame frame) {
        fileChooser = new JFileChooser(main_path);
        //fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.olc"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.showOpenDialog(frame);
        
        return fileChooser.getSelectedFile();
    }

    private void saveFile() {

    }

    private String saveFileAs(final JFrame frame) {        
        fileChooser = new JFileChooser(main_path);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showSaveDialog(frame);
        
        return fileChooser.getSelectedFile().getName();
    }
    
    // LEER ARCHIVO

    private String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
    
    // ESCRIBIR ARCHIVO
    private void writeFile(String directory, String filename, String content){
        File file = new File(directory, filename);
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(file);
            filewriter.write(content);
            filewriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if(filewriter != null) {
                try {
                    filewriter.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    //=================================>> MAIN <<===========================================
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton analize_button;
    private javax.swing.JLabel file_name_label;
    private javax.swing.JToggleButton generate_button;
    private javax.swing.JMenuItem generate_dialog;
    private javax.swing.JComboBox<String> image_combobox;
    private javax.swing.JLabel image_label;
    private javax.swing.JTextArea input_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem new_dialog;
    private javax.swing.JToggleButton next_button;
    private javax.swing.JMenuItem open_dialog;
    private javax.swing.JTextArea output_text;
    private javax.swing.JToggleButton previous_button;
    private javax.swing.JMenuItem save_dialog;
    private javax.swing.JMenuItem saveas_dialog;
    private javax.swing.JTree tree_temp;
    // End of variables declaration//GEN-END:variables
}
