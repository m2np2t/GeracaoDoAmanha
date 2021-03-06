package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CadastroUsuarioModel;

public class TelaCadastro extends javax.swing.JFrame {

    /**
     * @return the senhaconfere
     */
    public boolean isSenhaconfere() {
	return senhaconfere;
    }

    /**
     * @param senhaconfere the senhaconfere to set
     */
    public void setSenhaconfere(boolean senhaconfere) {
	this.senhaconfere = senhaconfere;
    }

    /**
     * @return the validado
     */
    public boolean isValidado() {
	return validado;
    }

    /**
     * @param validado the validado to set
     */
    public void setValidado(boolean validado) {
	this.validado = validado;
    }

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
	initComponents();
	modoInicial();
    }
    
    private boolean validado = false;
    private boolean senhaconfere = false;
    
    private void modoInicial(){
	txtNome.setText(null);
	txtEmail.setText(null);
	txtUsuario.setText(null);
	txtSenha.setText(null);
	txtConfSenha.setText(null);
	lblMensagemSenha.setVisible(false);
    }

    private void confirmaSenha(){
	if(!(txtSenha.getText().equals(txtConfSenha.getText()))){
	    lblMensagemSenha.setVisible(true);
	    setSenhaconfere(false);
	}else{
	    lblMensagemSenha.setVisible(false);
	    setSenhaconfere(true);
	}
    }
    private void verificarDados(){
	if(txtNome.getText().isEmpty()){
	    JOptionPane.showMessageDialog(null,"Preencha o campo referente ao nome.");
	    setValidado(false);
	}else{
	    if(txtUsuario.getText().isEmpty()){
		JOptionPane.showMessageDialog(null,"Preencha o campo referente ao usuario.");
		setValidado(false);
	    }else{
		if(txtSenha.getText().isEmpty()){
		    JOptionPane.showMessageDialog(null,"Preencha o campo referente ao senha.");
		    setValidado(false);
		}else{
		    if(!(isSenhaconfere())){
			JOptionPane.showMessageDialog(null,"Verifique a sua senha, pois elas não confere.");
			setValidado(false);
		    }else{
			setValidado(true);
		    }
		}
	    }
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

        jPanelHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblMinimized = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblConfSenha = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        lblMensagemSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("frmCadastro"); // NOI18N
        setUndecorated(true);
        setOpacity(0.95F);
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanelHeader.setBackground(new java.awt.Color(74, 128, 80));
        jPanelHeader.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanelHeader.setMaximumSize(new java.awt.Dimension(900, 500));
        jPanelHeader.setMinimumSize(new java.awt.Dimension(900, 500));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(216, 216, 216));
        lblTitle.setText("Geração do Amanhã - Cadastro");
        lblTitle.setMaximumSize(new java.awt.Dimension(450, 50));
        lblTitle.setMinimumSize(new java.awt.Dimension(450, 50));
        lblTitle.setPreferredSize(new java.awt.Dimension(450, 50));

        lblMinimized.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        lblMinimized.setForeground(new java.awt.Color(216, 216, 216));
        lblMinimized.setText("-");
        lblMinimized.setMaximumSize(new java.awt.Dimension(30, 50));
        lblMinimized.setMinimumSize(new java.awt.Dimension(30, 50));
        lblMinimized.setPreferredSize(new java.awt.Dimension(30, 50));
        lblMinimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizedMouseClicked(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(216, 216, 216));
        lblExit.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(216, 216, 216));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setMaximumSize(new java.awt.Dimension(30, 50));
        lblExit.setMinimumSize(new java.awt.Dimension(30, 50));
        lblExit.setPreferredSize(new java.awt.Dimension(30, 50));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(lblMinimized, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinimized, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 450, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelHeader);
        jPanelHeader.setBounds(0, 0, 900, 50);

        jPanelContent.setBackground(new java.awt.Color(119, 191, 86));
        jPanelContent.setMaximumSize(new java.awt.Dimension(900, 550));
        jPanelContent.setMinimumSize(new java.awt.Dimension(900, 550));
        jPanelContent.setPreferredSize(new java.awt.Dimension(915, 550));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/LogoLogin.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(120, 120, 120));
        lblUsuario.setText("Usuário");

        lblSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(120, 120, 120));
        lblSenha.setText("Senha");

        txtUsuario.setBackground(new java.awt.Color(216, 216, 216));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario.setToolTipText("Digite seu Usuário");

        txtSenha.setBackground(new java.awt.Color(216, 216, 216));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.setToolTipText("Digite sua senha");

        btnLogin.setBackground(new java.awt.Color(34, 167, 240));
        btnLogin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnLogin.setText("Cadastrar");
        btnLogin.setToolTipText("Efetuar um Cadastro");
        btnLogin.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(192, 57, 43));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(242, 242, 242));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar tentativa de login");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(216, 216, 216));
        lblLogin.setText("Clique aqui para voltar a tela de login . Login ");
        lblLogin.setToolTipText("Vá para a tela de Login");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(120, 120, 120));
        lblNome.setText("Nome");

        txtNome.setBackground(new java.awt.Color(216, 216, 216));
        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setToolTipText("Digite seu Nome");

        lblEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(120, 120, 120));
        lblEmail.setText("Email");

        txtEmail.setBackground(new java.awt.Color(216, 216, 216));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setToolTipText("Digite seu Email");

        lblConfSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblConfSenha.setForeground(new java.awt.Color(120, 120, 120));
        lblConfSenha.setText("Confirme sua senha");

        txtConfSenha.setBackground(new java.awt.Color(216, 216, 216));
        txtConfSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtConfSenha.setToolTipText("Confirme a senha digitada");
        txtConfSenha.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtConfSenhaCaretUpdate(evt);
            }
        });

        lblMensagemSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMensagemSenha.setForeground(new java.awt.Color(255, 0, 51));
        lblMensagemSenha.setText("As senhas digitadas não são iguais, por favor digite novamente");

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelContentLayout.createSequentialGroup()
                            .addComponent(btnCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLogin)
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblConfSenha)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(lblMensagemSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanelContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnLogin});

        jPanelContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblConfSenha, lblEmail, lblNome, lblSenha, lblUsuario});

        jPanelContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtConfSenha, txtEmail, txtNome, txtSenha, txtUsuario});

        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConfSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensagemSenha)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addGap(17, 17, 17)
                        .addComponent(lblLogin))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelContent);
        jPanelContent.setBounds(0, 50, 900, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizedMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizedMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

	modoInicial();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
       
	TelaLogin login = new TelaLogin();
	login.setVisible(true);
	login.pack();
	login.setLocationRelativeTo(null);
	login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
	if(isValidado()){
	    CadastroUsuarioModel model = new CadastroUsuarioModel();
	    model.inserir(txtNome.getText(), txtEmail.getText(),txtUsuario.getText(), txtSenha.getText());
	    modoInicial();
	    JOptionPane.showMessageDialog(null, model.getMensagem());
	}else{
	    verificarDados();
	}
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtConfSenhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtConfSenhaCaretUpdate
        
	confirmaSenha();
    }//GEN-LAST:event_txtConfSenhaCaretUpdate

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
	    java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new TelaCadastro().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMensagemSenha;
    private javax.swing.JLabel lblMinimized;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
