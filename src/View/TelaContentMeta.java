/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import model.MetaModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static View.TelaPrincipal.lblNome;
import static View.TelaPrincipal.lblPontuacao;

/**
 *
 * @author pedro
 */
public class TelaContentMeta extends javax.swing.JFrame {

    /**
     * @return the pontos
     */
    public int getPontos() {
	return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
	this.pontos = pontos;
    }

    /**
     * @return the content
     */
    public String getContent() {
	return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
	this.content = content;
    }

    /**
     * @return the nomeArquivo
     */
    public String getNomeArquivo() {
	return nomeArquivo;
    }

    /**
     * @param nomeArquivo the nomeArquivo to set
     */
    public void setNomeArquivo(String nomeArquivo) {
	this.nomeArquivo = nomeArquivo;
    }

    /**
     * Creates new form TelaContentMeta
     */
    public TelaContentMeta() {
	initComponents();
    }
    
    private int pontos;
    private String content;
    private String nomeArquivo;
    
    private void lerArquivo(String path){
	String cont = "";
	try {
	   FileReader fr = new FileReader(path);
	   BufferedReader lerArq = new BufferedReader(fr);
	   while(lerArq.ready()){
	       cont += lerArq.readLine();
	   }  
	   setContent(cont);
	} catch (IOException e) {
	    e.getMessage();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelContent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp = new javax.swing.JTextPane();
        jLabelExit = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jToggleButtonConc = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setName("frmContentMetas"); // NOI18N
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelContent.setMaximumSize(new java.awt.Dimension(1000, 550));
        jPanelContent.setMinimumSize(new java.awt.Dimension(1000, 550));
        jPanelContent.setPreferredSize(new java.awt.Dimension(1000, 550));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(1000, 550));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(1000, 550));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 550));

        tp.setEnabled(false);
        tp.setMaximumSize(new java.awt.Dimension(1000, 500));
        tp.setMinimumSize(new java.awt.Dimension(1000, 500));
        tp.setPreferredSize(new java.awt.Dimension(1000, 500));
        jScrollPane2.setViewportView(tp);

        jLabelExit.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 0, 0));
        jLabelExit.setText("X");
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelExit)
                .addGap(30, 30, 30))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.getAccessibleContext().setAccessibleDescription("text/plain");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFooter.setBackground(new java.awt.Color(80, 80, 80));
        jPanelFooter.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanelFooter.setMaximumSize(new java.awt.Dimension(1000, 100));
        jPanelFooter.setMinimumSize(new java.awt.Dimension(1000, 100));
        jPanelFooter.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanelFooter.setRequestFocusEnabled(false);

        jToggleButtonConc.setBackground(new java.awt.Color(0, 255, 0));
        jToggleButtonConc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButtonConc.setText("Concluído");
        jToggleButtonConc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addContainerGap(854, Short.MAX_VALUE)
                .addComponent(jToggleButtonConc)
                .addGap(43, 43, 43))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jToggleButtonConc)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
	tp.setContentType("text/html");
	String caminho = "src/view/resources/" + getNomeArquivo();
	System.out.println(caminho);
	lerArquivo(caminho);
	tp.setText(getContent());
	tp.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_formWindowOpened

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        // TODO add your handling code here:
	this.dispose();
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jToggleButtonConcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConcActionPerformed
        // TODO add your handling code here:
	String usuario = lblNome.getText();
	String pontuacao = lblPontuacao.getText();
	MetaModel meta = new MetaModel();
	int pont = Integer.parseInt(pontuacao);
	if(jToggleButtonConc.getText().contains("Concluído")){
	    int temp = meta.somaPonto(pont, 1, usuario);
	    lblPontuacao.setText(Integer.toString(temp));
	    meta.alterandoDados(temp, usuario);
	    jPanelFooter.setBackground(Color.GREEN);
	    jToggleButtonConc.setBackground(Color.YELLOW);
	    jToggleButtonConc.setText("Pendente");
	}
	else if(jToggleButtonConc.getText().equals("Pendente")){
	    int temp = meta.subtraiPonto(pont, 1, usuario);
	    lblPontuacao.setText(Integer.toString(temp));
	    meta.alterandoDados(temp, usuario);
	    jPanelFooter.setBackground(Color.YELLOW);
	    jToggleButtonConc.setBackground(Color.GREEN);
	    jToggleButtonConc.setText("Concluído");
	}
    }//GEN-LAST:event_jToggleButtonConcActionPerformed

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
	    java.util.logging.Logger.getLogger(TelaContentMeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(TelaContentMeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(TelaContentMeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(TelaContentMeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new TelaContentMeta().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButtonConc;
    private javax.swing.JTextPane tp;
    // End of variables declaration//GEN-END:variables
}
