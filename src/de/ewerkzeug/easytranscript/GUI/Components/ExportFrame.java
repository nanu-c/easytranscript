/*
 * Copyright (C) 2014 e-werkzeug <administrator@e-werkzeug.eu>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package de.ewerkzeug.easytranscript.GUI.Components;

import de.ewerkzeug.easytranscript.Core.ErrorReport;
import static de.ewerkzeug.easytranscript.Core.V.errors;
import static de.ewerkzeug.easytranscript.Core.V.logger;
import static de.ewerkzeug.easytranscript.Core.V.messages;
import de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler;
import static de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler.transConf;
import static de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler.transcriptPath;
import de.ewerkzeug.easytranscript.IO.Export.ZipProject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author e-werkzeug <administrator@e-werkzeug.eu>
 */
public class ExportFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExportFrame
     */
    public ExportFrame() {
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

        ExportPathTextfield = new javax.swing.JTextField();
        ExportChooseButton = new javax.swing.JButton();
        ExportBottomPanel = new javax.swing.JPanel();
        ExportexportButton = new javax.swing.JButton();
        ExportCancelButton = new javax.swing.JButton();
        ExportInfoScrollpane = new javax.swing.JScrollPane();
        ExportInfoTextarea = new javax.swing.JTextArea();
        ExportInfoLabel = new javax.swing.JLabel();
        ExportTitleLabel = new javax.swing.JLabel();
        ExportSubLabel = new javax.swing.JLabel();
        ExportstatusProgressbar = new javax.swing.JProgressBar();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("de/ewerkzeug/easytranscript/Core/Bundles/Bundle"); // NOI18N
        setTitle(bundle.getString("Easytranscript.ExportTitleLabel.text")); // NOI18N
        setResizable(false);

        ExportPathTextfield.setEditable(false);

        ExportChooseButton.setText(bundle.getString("Easytranscript.ExportChooseButton.text")); // NOI18N
        ExportChooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportChooseButtonActionPerformed(evt);
            }
        });

        ExportexportButton.setText(bundle.getString("Easytranscript.ExportexportButton.text")); // NOI18N
        ExportexportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportexportButtonActionPerformed(evt);
            }
        });
        ExportBottomPanel.add(ExportexportButton);

        ExportCancelButton.setText(bundle.getString("Easytranscript.ExportCancelButton.text")); // NOI18N
        ExportCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCancelButtonActionPerformed(evt);
            }
        });
        ExportBottomPanel.add(ExportCancelButton);

        //ExportInfoTextarea.setBackground(new java.awt.Color(240, 240, 240));
        ExportInfoTextarea.setColumns(20);
        ExportInfoTextarea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ExportInfoTextarea.setLineWrap(true);
        ExportInfoTextarea.setRows(5);
        ExportInfoTextarea.setText(bundle.getString("Easytranscript.ExportInfoTextarea.text")); // NOI18N
        ExportInfoTextarea.setWrapStyleWord(true);
        ExportInfoScrollpane.setViewportView(ExportInfoTextarea);

        ExportInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ExportInfoLabel.setText(bundle.getString("Easytranscript.ExportInfoLabel.text")); // NOI18N

        ExportTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ExportTitleLabel.setText(bundle.getString("Easytranscript.ExportTitleLabel.text")); // NOI18N

        ExportSubLabel.setText(bundle.getString("Easytranscript.ExportSubLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExportBottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ExportTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ExportSubLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ExportPathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExportChooseButton))
                            .addComponent(ExportInfoLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ExportstatusProgressbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExportInfoScrollpane))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportTitleLabel)
                .addGap(34, 34, 34)
                .addComponent(ExportSubLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExportPathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportChooseButton))
                .addGap(24, 24, 24)
                .addComponent(ExportInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExportInfoScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExportstatusProgressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExportBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportChooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportChooseButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter(messages.getString("zetpFiletype"), "zetp"));
        int ruckgabe = fileChooser.showSaveDialog(null);
        fileChooser.getSelectedFile();
        if (ruckgabe == JFileChooser.CANCEL_OPTION) {

            return;
        }

        String exportPath = ((File) fileChooser.getSelectedFile()).getAbsolutePath();

        if (!exportPath.endsWith(".zetp")) {
            exportPath = exportPath + ".zetp";
        }

        if ((new File(exportPath)).exists()) {
            int response = JOptionPane.showConfirmDialog(null, messages.getString("WarningOverwrite"), messages.getString("WarningOverwriteTitle"),
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                this.ExportChooseButtonActionPerformed(evt);

            } else if (response == JOptionPane.YES_OPTION) {
            } else if (response == JOptionPane.CLOSED_OPTION) {

                this.ExportChooseButtonActionPerformed(evt);
            }
        }

        ExportPathTextfield.setText(exportPath);
    }//GEN-LAST:event_ExportChooseButtonActionPerformed

    private void ExportexportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportexportButtonActionPerformed

        ExportexportButton.setEnabled(false);
        ExportCancelButton.setEnabled(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        String tr_pathOld = transConf.getProperty("transcriptPath");
        String me_pathOld = transConf.getProperty("mediaPath");

        ExportstatusProgressbar.setValue(0);

        ExportstatusProgressbar.setStringPainted(false);

        if (tr_pathOld == null) {
            tr_pathOld = "";
        }
        if (me_pathOld == null) {
            me_pathOld = "";
        }

        String sep;

        if (!tr_pathOld.equals("")) {

            transConf.setProperty("transcriptName", "");
            transConf.setProperty("transcriptPath", "");

            sep = "\\";
            boolean contains = tr_pathOld.contains("\\");
            if (contains == false) {
                sep = "/";
            }
            transConf.setProperty("transcriptName", tr_pathOld.substring(tr_pathOld.lastIndexOf(sep) + 1, tr_pathOld.lastIndexOf(".")));

        }

        if (!me_pathOld.equals("")) {

            transConf.setProperty("mediaPath", "");
            transConf.setProperty("mediaName", "");
            sep = "\\";
            boolean contains = me_pathOld.contains("\\");
            if (contains == false) {
                sep = "/";
            }
            transConf.setProperty("mediaName", me_pathOld.substring(me_pathOld.lastIndexOf(sep) + 1));
        }

        try {
            logger.log(Level.INFO, "Schreibe neu: {0}.tmp", transcriptPath);
            TranscriptHandler.writeProjConf(transcriptPath + ".tmp");
        } catch (FileNotFoundException ex) {
            logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("SavingConfig2")), ex);
            setVisible(false);
            return;

        } catch (IOException ex) {
            logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("SavingConfig2")), ex);
            setVisible(false);
            return;
        }

        try {
            transConf.load(new FileInputStream(transcriptPath));
            logger.log(Level.FINE, "Stelle originale Projektkonfiguration wieder her.");
        } catch (IOException ex) {
            setVisible(false);
            logger.log(Level.WARNING, "Die Projektdatei existiert nicht mehr.");

        }
        logger.log(Level.INFO, "Beginne mit Zip-Vorgang");
        ZipProject zip = new ZipProject(transcriptPath, ExportPathTextfield.getText(), me_pathOld, tr_pathOld);

        ExportstatusProgressbar.setValue(100);
        ExportstatusProgressbar.setString(messages.getString("Wait"));
        ExportstatusProgressbar.setStringPainted(true);
        zip.execute();


    }//GEN-LAST:event_ExportexportButtonActionPerformed

    private void ExportCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportCancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_ExportCancelButtonActionPerformed

    public JButton getExportCancelButton() {
        return ExportCancelButton;
    }

    public JButton getExportexportButton() {
        return ExportexportButton;
    }

    public JTextField getExportPathTextfield() {
        return ExportPathTextfield;
    }

    public JProgressBar getExportstatusProgressbar() {
        return ExportstatusProgressbar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExportBottomPanel;
    private javax.swing.JButton ExportCancelButton;
    private javax.swing.JButton ExportChooseButton;
    private javax.swing.JLabel ExportInfoLabel;
    private javax.swing.JScrollPane ExportInfoScrollpane;
    private javax.swing.JTextArea ExportInfoTextarea;
    private javax.swing.JTextField ExportPathTextfield;
    private javax.swing.JLabel ExportSubLabel;
    private javax.swing.JLabel ExportTitleLabel;
    private javax.swing.JButton ExportexportButton;
    private javax.swing.JProgressBar ExportstatusProgressbar;
    // End of variables declaration//GEN-END:variables
}
