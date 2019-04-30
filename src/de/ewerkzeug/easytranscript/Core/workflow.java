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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *&
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package de.ewerkzeug.easytranscript.Core;

import static de.ewerkzeug.easytranscript.Core.V.easytranscript;
import static de.ewerkzeug.easytranscript.Core.V.messages;
import static de.ewerkzeug.easytranscript.Core.V.news;
import static de.ewerkzeug.easytranscript.Core.V.opFolder;
import static de.ewerkzeug.easytranscript.Core.V.projFolder;
import static de.ewerkzeug.easytranscript.Core.V.prop;
import static de.ewerkzeug.easytranscript.Core.V.startFrame;
import static de.ewerkzeug.easytranscript.Core.V.updateFrame;
import de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler;
import static de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler.transcriptPath;
import static de.ewerkzeug.easytranscript.Tools.Tools.readFileLineByLine;
import de.ewerkzeug.easytranscript.Tools.lock;
import java.io.File;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.commons.vfs.FileChangeEvent;
import org.apache.commons.vfs.FileListener;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileSystemManager;
import org.apache.commons.vfs.VFS;
import org.apache.commons.vfs.impl.DefaultFileMonitor;

/**
 *
 * @author e-werkzeug <administrator@e-werkzeug.eu>
 */
public class workflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {



        String projectToBeLoaded2;
        if (args.length > 0) {
            projectToBeLoaded2 = args[0];
        } else {
            projectToBeLoaded2 = "";
        }

        Locale locale = new Locale("en", "US");

        Locale.setDefault(locale);

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
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Easytranscript.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {

            lock l = new lock(projectToBeLoaded2);

        } catch (RuntimeException ex) {
            // exit main app
            javax.swing.JOptionPane.showMessageDialog(null, "Not enough permissions to execute easytranscript!");
            return;
        }



        /* Create and display the form */
        final String projectToBeLoaded = projectToBeLoaded2;
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                easytranscript = new Easytranscript();

                easytranscript.setVisible(true);
                prop.applyProperties();

                if (projectToBeLoaded != null) {
                    if (!projectToBeLoaded.trim().equals("")) {
                        if (projectToBeLoaded.endsWith(".etp")) {
                            easytranscript.getStartFrame().setVisible(false);
                            TranscriptHandler.read(new File(projectToBeLoaded).getAbsolutePath());
                        } else if (projectToBeLoaded.endsWith(".etm")) {
                            easytranscript.getStartFrame().setVisible(false);
                            projFolder.close();
                            projFolder.load(new File(projectToBeLoaded).getAbsolutePath());

                        } else {
                            java.util.logging.Logger.getLogger(Easytranscript.class
                                    .getName()).log(Level.WARNING, "Couldn't load file, cause it's not an easytranscript file.");
                        }
                    }

                }

                FileSystemManager manager;
                try {
                    manager = VFS.getManager();
                    FileObject file = manager.resolveFile(opFolder + "carry");

                    DefaultFileMonitor fm = new DefaultFileMonitor(new MyListener());

                    fm.addFile(file);
                    fm.start();
                } catch (FileSystemException ex) {
                    Logger.getLogger(workflow.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        );

    }

    private static class MyListener implements FileListener {

        MyListener() {
        }

        void action() {
            String path = readFileLineByLine(opFolder + "carry").get(0);
            new File(opFolder + "carry").delete();
            if (path.endsWith(".etp")) {
                int n;
                if (TranscriptHandler.isUnsaved()) {

                    Object[] options = {messages.getString("Ja"),
                        messages.getString("Nein"),
                        messages.getString("Abbrechen")};
                    n = JOptionPane.showOptionDialog(null,
                            messages.getString("WarningCloseProject"),
                            messages.getString("Frage"),
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[2]);

                    if (n == 0) {
                        TranscriptHandler.save(transcriptPath, false, false);
                    }

                    if (n == 2) {
                        return;
                    }

                }

                TranscriptHandler.close();

                TranscriptHandler.read(path);
            } else {
                easytranscript.toFront();
                startFrame.toFront();
                updateFrame.toFront();
                news.toFront();

            }
        }

        @Override
        public void fileCreated(FileChangeEvent fce) throws Exception {
            action();
        }

        @Override
        public void fileDeleted(FileChangeEvent fce) throws Exception {
        }

        @Override
        public void fileChanged(FileChangeEvent fce) throws Exception {
            action();
        }
    }
}
