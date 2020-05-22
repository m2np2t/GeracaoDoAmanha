package View;

import static View.TelaODS.lblLogoOds;
import static View.TelaODS.lblTituloOds;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Model.LoginModel;

/**
 *
 * @author pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
	initComponents();
	modoInicial();
    }
    
    // Start Variables declaration
    /***
     * Instancing the ImageIcon
     */
    ImageIcon ods01 = new ImageIcon("src/view/images/ods01.png");
    ImageIcon ods02 = new ImageIcon("src/view/images/ods02.png");
    ImageIcon ods03 = new ImageIcon("src/view/images/ods03.png");
    ImageIcon ods04 = new ImageIcon("src/view/images/ods04.png");
    ImageIcon ods05 = new ImageIcon("src/view/images/ods05.png");
    ImageIcon ods06 = new ImageIcon("src/view/images/ods06.png");
    ImageIcon ods07 = new ImageIcon("src/view/images/ods07.png");
    ImageIcon ods08 = new ImageIcon("src/view/images/ods08.png");
    ImageIcon ods09 = new ImageIcon("src/view/images/ods09.png");
    ImageIcon ods10 = new ImageIcon("src/view/images/ods10.png");
    ImageIcon ods11 = new ImageIcon("src/view/images/ods11.png");
    ImageIcon ods12 = new ImageIcon("src/view/images/ods12.png");
    ImageIcon ods13 = new ImageIcon("src/view/images/ods13.png");
    ImageIcon ods14 = new ImageIcon("src/view/images/ods14.png");
    ImageIcon ods15 = new ImageIcon("src/view/images/ods15.png");
    ImageIcon ods16 = new ImageIcon("src/view/images/ods16.png");
    ImageIcon ods17 = new ImageIcon("src/view/images/ods17.png");
    
    // End declaration variables
    
    public void addImages(){
	lblOds01.setIcon(ods01);
	lblOds02.setIcon(ods02);
	lblOds03.setIcon(ods03);
	lblOds04.setIcon(ods04);
	lblOds05.setIcon(ods05);
	lblOds06.setIcon(ods06);
	lblOds07.setIcon(ods07);
	lblOds08.setIcon(ods08);
	lblOds09.setIcon(ods09);
	lblOds10.setIcon(ods10);
	lblOds11.setIcon(ods11);
	lblOds12.setIcon(ods12);
	lblOds13.setIcon(ods13);
	lblOds14.setIcon(ods14);
	lblOds15.setIcon(ods15);
	lblOds16.setIcon(ods16);
	lblOds17.setIcon(ods17);
    }
    
    public void confImagesInitial(){
	ods01.setImage(ods01.getImage().getScaledInstance(lblOds01.getWidth(), lblOds01.getHeight(),1));
	ods02.setImage(ods02.getImage().getScaledInstance(lblOds02.getWidth(), lblOds02.getHeight(),1));
	ods03.setImage(ods03.getImage().getScaledInstance(lblOds03.getWidth(), lblOds03.getHeight(),1));
	ods04.setImage(ods04.getImage().getScaledInstance(lblOds04.getWidth(), lblOds04.getHeight(),1));
	ods05.setImage(ods05.getImage().getScaledInstance(lblOds05.getWidth(), lblOds05.getHeight(),1));
	ods06.setImage(ods06.getImage().getScaledInstance(lblOds06.getWidth(), lblOds06.getHeight(),1));
	ods07.setImage(ods07.getImage().getScaledInstance(lblOds07.getWidth(), lblOds07.getHeight(),1));
	ods08.setImage(ods08.getImage().getScaledInstance(lblOds08.getWidth(), lblOds08.getHeight(),1));
	ods09.setImage(ods09.getImage().getScaledInstance(lblOds09.getWidth(), lblOds08.getHeight(),1));
	ods10.setImage(ods10.getImage().getScaledInstance(lblOds10.getWidth(), lblOds10.getHeight(),1));
	ods11.setImage(ods11.getImage().getScaledInstance(lblOds11.getWidth(), lblOds11.getHeight(),1));
	ods12.setImage(ods12.getImage().getScaledInstance(lblOds12.getWidth(), lblOds12.getHeight(),1));
	ods13.setImage(ods13.getImage().getScaledInstance(lblOds13.getWidth(), lblOds13.getHeight(),1));
	ods14.setImage(ods14.getImage().getScaledInstance(lblOds14.getWidth(), lblOds14.getHeight(),1));
	ods15.setImage(ods15.getImage().getScaledInstance(lblOds15.getWidth(), lblOds15.getHeight(),1));
	ods16.setImage(ods16.getImage().getScaledInstance(lblOds16.getWidth(), lblOds16.getHeight(),1));
	ods17.setImage(ods17.getImage().getScaledInstance(lblOds17.getWidth(), lblOds17.getHeight(),1));
    }
    
    private void modoInicial(){
	confImagesInitial();
	addImages();
    }
    
    private void chamarODS01(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Erradicação da Pobreza");
	lblLogoOds.setIcon(ods01);
	tods.setNomeArquivo("ODS01.html");
	tods.setVisible(true);
    }
    
    private void chamarODS02(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Fome Zero e Agricultura Sustentável");
	lblLogoOds.setIcon(ods02);
	tods.setNomeArquivo("ODS02.html");
	tods.setVisible(true);
    }
    
    private void chamarODS03(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Sáude e Bem-Estar");
	lblLogoOds.setIcon(ods03);
	tods.setNomeArquivo("ODS03.html");
	tods.setVisible(true);
    }
    
    private void chamarODS04(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Educação de Qualidade");
	lblLogoOds.setIcon(ods04);
	tods.setNomeArquivo("ODS04.html");
	tods.setVisible(true);
    }
    
    private void chamarODS05(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Igualde de Gênero");
	lblLogoOds.setIcon(ods05);
	tods.setNomeArquivo("ODS05.html");
	tods.setVisible(true);
    }
    
    private void chamarODS06(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Água Potável e Saneamento");
	lblLogoOds.setIcon(ods06);
	tods.setNomeArquivo("ODS06.html");
	tods.setVisible(true);
    }
    
    private void chamarODS07(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Energia Limpa e Acessível");
	lblLogoOds.setIcon(ods07);
	tods.setNomeArquivo("ODS07.html");
	tods.setVisible(true);
    }
    
    private void chamarODS08(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Trabalho Decente e Crescimento Econômico");
	lblLogoOds.setIcon(ods08);
	tods.setNomeArquivo("ODS08.html");
	tods.setVisible(true);
    }
    
    private void chamarODS09(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Indústria, Inovação e Infraestrutura");
	lblLogoOds.setIcon(ods09);
	tods.setNomeArquivo("ODS09.html");
	tods.setVisible(true);
    }
    
    private void chamarODS10(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Redução das Desigualdades");
	lblLogoOds.setIcon(ods10);
	tods.setNomeArquivo("ODS10.html");
	tods.setVisible(true);
    }
    
    private void chamarODS11(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Cidades e Comunidades Sustentáveis");
	lblLogoOds.setIcon(ods11);
	tods.setNomeArquivo("ODS11.html");
	tods.setVisible(true);

    }
    
    private void chamarODS12(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Consumo e Produção Responsáveis");
	lblLogoOds.setIcon(ods12);
	tods.setNomeArquivo("ODS12.html");
	tods.setVisible(true);
    }
    
    private void chamarODS13(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Ação contra mudança Global do Clima");
	lblLogoOds.setIcon(ods13);
	tods.setNomeArquivo("template.html");
	tods.setVisible(true);
    }
    
    private void chamarODS14(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Vida na Água");
	lblLogoOds.setIcon(ods14);
	tods.setNomeArquivo("ODS14.html");
	tods.setVisible(true);
    }
    
    private void chamarODS15(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Vida Terrestre");
	lblLogoOds.setIcon(ods15);
	tods.setNomeArquivo("ODS15.html");
	tods.setVisible(true);
    }
    
    private void chamarODS16(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Pas, justiça e Instituições Eficazes");
	lblLogoOds.setIcon(ods16);
	tods.setNomeArquivo("ODS16.html");
	tods.setVisible(true);
    }
    
    private void chamarODS17(){
	TelaODS tods = new TelaODS();
	lblTituloOds.setText("Parcerias e Meios de Implementação");
	lblLogoOds.setIcon(ods17);
	tods.setNomeArquivo("ODS17.html");
	tods.setVisible(true);
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
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jPanelOds01 = new javax.swing.JPanel();
        lblOds01 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelOds04 = new javax.swing.JPanel();
        lblOds04 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelOds07 = new javax.swing.JPanel();
        lblOds07 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelOds10 = new javax.swing.JPanel();
        lblOds10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanelOds13 = new javax.swing.JPanel();
        lblOds13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanelOds16 = new javax.swing.JPanel();
        lblOds16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanelOds02 = new javax.swing.JPanel();
        lblOds02 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelOds03 = new javax.swing.JPanel();
        lblOds03 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelOds05 = new javax.swing.JPanel();
        lblOds05 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelOds08 = new javax.swing.JPanel();
        lblOds08 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanelOds11 = new javax.swing.JPanel();
        lblOds11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanelOds14 = new javax.swing.JPanel();
        lblOds14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanelOds17 = new javax.swing.JPanel();
        lblOds17 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanelOds06 = new javax.swing.JPanel();
        lblOds06 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanelOds09 = new javax.swing.JPanel();
        lblOds09 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanelOds12 = new javax.swing.JPanel();
        lblOds12 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanelOds15 = new javax.swing.JPanel();
        lblOds15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(74, 128, 80));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(960, 750));
        setName("frmPrincipal"); // NOI18N
        setSize(new java.awt.Dimension(976, 789));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setMaximumSize(new java.awt.Dimension(1920, 200));
        jPanelHeader.setMinimumSize(new java.awt.Dimension(960, 100));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(960, 100));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/LogoLogin64.png"))); // NOI18N
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setPreferredSize(new java.awt.Dimension(100, 100));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(80, 80, 80));
        lblTitulo.setText("Geração do Amanhã");

        lblPontuacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(242, 242, 242));
        lblPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontuacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/FundoPontos64.png"))); // NOI18N
        lblPontuacao.setText("0");
        lblPontuacao.setFocusable(false);
        lblPontuacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPontuacao.setMaximumSize(new java.awt.Dimension(100, 100));
        lblPontuacao.setMinimumSize(new java.awt.Dimension(100, 100));
        lblPontuacao.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(80, 80, 80));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        lblNome.setMaximumSize(new java.awt.Dimension(150, 45));
        lblNome.setMinimumSize(new java.awt.Dimension(150, 45));
        lblNome.setPreferredSize(new java.awt.Dimension(200, 45));

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContent.setBackground(new java.awt.Color(74, 128, 80));
        jPanelContent.setMaximumSize(new java.awt.Dimension(1920, 880));
        jPanelContent.setMinimumSize(new java.awt.Dimension(960, 650));
        jPanelContent.setPreferredSize(new java.awt.Dimension(960, 650));

        jPanelOds01.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds01.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds01.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds01MouseClicked(evt);
            }
        });
        jPanelOds01.setLayout(null);

        lblOds01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds01.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds01.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds01.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds01.add(lblOds01);
        lblOds01.setBounds(10, 15, 70, 70);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Pobreza");
        jPanelOds01.add(jLabel1);
        jLabel1.setBounds(90, 50, 210, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 80, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Erradicação da");
        jPanelOds01.add(jLabel2);
        jLabel2.setBounds(90, 20, 210, 22);

        jPanelOds04.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds04.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds04.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds04MouseClicked(evt);
            }
        });
        jPanelOds04.setLayout(null);

        lblOds04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds04.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds04.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds04.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds04.add(lblOds04);
        lblOds04.setBounds(10, 15, 70, 70);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 80, 80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Qualidade");
        jPanelOds04.add(jLabel4);
        jLabel4.setBounds(90, 50, 210, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 80, 80));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Educação de ");
        jPanelOds04.add(jLabel3);
        jLabel3.setBounds(90, 20, 210, 22);

        jPanelOds07.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds07.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds07.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds07.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds07MouseClicked(evt);
            }
        });
        jPanelOds07.setLayout(null);

        lblOds07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds07.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds07.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds07.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds07.add(lblOds07);
        lblOds07.setBounds(10, 15, 70, 70);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 80, 80));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Energia Limpa");
        jPanelOds07.add(jLabel5);
        jLabel5.setBounds(90, 20, 210, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 80));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Acessível");
        jPanelOds07.add(jLabel6);
        jLabel6.setBounds(90, 50, 210, 17);

        jPanelOds10.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds10.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds10.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds10MouseClicked(evt);
            }
        });
        jPanelOds10.setLayout(null);

        lblOds10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds10.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds10.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds10.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds10.add(lblOds10);
        lblOds10.setBounds(10, 15, 70, 70);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(80, 80, 80));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Redução das");
        jPanelOds10.add(jLabel25);
        jLabel25.setBounds(90, 20, 210, 22);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(80, 80, 80));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Desigualdades");
        jPanelOds10.add(jLabel26);
        jLabel26.setBounds(90, 50, 210, 17);

        jPanelOds13.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds13.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds13.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds13MouseClicked(evt);
            }
        });
        jPanelOds13.setLayout(null);

        lblOds13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds13.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds13.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds13.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds13.add(lblOds13);
        lblOds13.setBounds(10, 15, 70, 70);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(80, 80, 80));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Ação contra a");
        jPanelOds13.add(jLabel27);
        jLabel27.setBounds(90, 10, 210, 22);

        jLabel40.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(80, 80, 80));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Mudança Global");
        jPanelOds13.add(jLabel40);
        jLabel40.setBounds(90, 40, 210, 17);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(80, 80, 80));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("do Clima");
        jPanelOds13.add(jLabel28);
        jLabel28.setBounds(90, 70, 210, 17);

        jPanelOds16.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds16.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds16.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds16MouseClicked(evt);
            }
        });
        jPanelOds16.setLayout(null);

        lblOds16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds16.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds16.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds16.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds16.add(lblOds16);
        lblOds16.setBounds(10, 15, 70, 70);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(80, 80, 80));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Paz, Justiça e");
        jPanelOds16.add(jLabel29);
        jLabel29.setBounds(90, 10, 210, 22);

        jLabel41.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(80, 80, 80));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Instituições");
        jPanelOds16.add(jLabel41);
        jLabel41.setBounds(90, 40, 210, 17);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(80, 80, 80));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Eficazes");
        jPanelOds16.add(jLabel30);
        jLabel30.setBounds(90, 70, 210, 17);

        jPanelOds02.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds02.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds02.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds02MouseClicked(evt);
            }
        });
        jPanelOds02.setLayout(null);

        lblOds02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds02.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds02.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds02.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds02.add(lblOds02);
        lblOds02.setBounds(10, 15, 70, 70);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 80, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Agricultura Sustentável");
        jPanelOds02.add(jLabel8);
        jLabel8.setBounds(90, 50, 210, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 80, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Fome Zero, e ");
        jPanelOds02.add(jLabel7);
        jLabel7.setBounds(90, 20, 210, 22);

        jPanelOds03.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds03.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds03.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds03MouseClicked(evt);
            }
        });
        jPanelOds03.setLayout(null);

        lblOds03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds03.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds03.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds03.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds03.add(lblOds03);
        lblOds03.setBounds(10, 15, 70, 70);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(80, 80, 80));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Saúde e ");
        jPanelOds03.add(jLabel9);
        jLabel9.setBounds(90, 20, 210, 22);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(80, 80, 80));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Bem-Estar");
        jPanelOds03.add(jLabel10);
        jLabel10.setBounds(90, 50, 210, 17);

        jPanelOds05.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds05.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds05.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds05.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds05.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanelOds05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds05MouseClicked(evt);
            }
        });
        jPanelOds05.setLayout(null);

        lblOds05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds05.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds05.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds05.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds05.add(lblOds05);
        lblOds05.setBounds(10, 15, 70, 70);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(80, 80, 80));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Igualdade de");
        jPanelOds05.add(jLabel11);
        jLabel11.setBounds(90, 20, 210, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(80, 80, 80));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Gênero");
        jPanelOds05.add(jLabel12);
        jLabel12.setBounds(90, 50, 210, 17);

        jPanelOds08.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds08.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds08.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds08.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds08.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanelOds08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds08MouseClicked(evt);
            }
        });
        jPanelOds08.setLayout(null);

        lblOds08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds08.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds08.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds08.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds08.add(lblOds08);
        lblOds08.setBounds(10, 15, 70, 70);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(80, 80, 80));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Trabalho Decente");
        jPanelOds08.add(jLabel15);
        jLabel15.setBounds(90, 10, 210, 22);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(80, 80, 80));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Econômico");
        jPanelOds08.add(jLabel16);
        jLabel16.setBounds(90, 70, 210, 17);

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(80, 80, 80));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("e Crescimento");
        jPanelOds08.add(jLabel35);
        jLabel35.setBounds(90, 40, 210, 17);

        jPanelOds11.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds11.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds11.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds11.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanelOds11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds11MouseClicked(evt);
            }
        });
        jPanelOds11.setLayout(null);

        lblOds11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds11.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds11.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds11.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds11.add(lblOds11);
        lblOds11.setBounds(10, 15, 70, 70);

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(80, 80, 80));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Comunidades");
        jPanelOds11.add(jLabel36);
        jLabel36.setBounds(90, 40, 210, 17);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(80, 80, 80));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Sustentáveis");
        jPanelOds11.add(jLabel24);
        jLabel24.setBounds(90, 70, 210, 17);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(80, 80, 80));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Cidades e ");
        jPanelOds11.add(jLabel23);
        jLabel23.setBounds(90, 10, 210, 22);

        jPanelOds14.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds14.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds14.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds14.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanelOds14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds14MouseClicked(evt);
            }
        });
        jPanelOds14.setLayout(null);

        lblOds14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds14.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds14.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds14.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds14.add(lblOds14);
        lblOds14.setBounds(10, 15, 70, 70);

        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(80, 80, 80));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Água");
        jPanelOds14.add(jLabel32);
        jLabel32.setBounds(90, 50, 210, 17);

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(80, 80, 80));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Vida na");
        jPanelOds14.add(jLabel31);
        jLabel31.setBounds(90, 20, 210, 22);

        jPanelOds17.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds17.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds17.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds17.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanelOds17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds17MouseClicked(evt);
            }
        });
        jPanelOds17.setLayout(null);

        lblOds17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds17.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds17.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds17.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds17.add(lblOds17);
        lblOds17.setBounds(10, 15, 70, 70);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(80, 80, 80));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Parcerias e Meios");
        jPanelOds17.add(jLabel33);
        jLabel33.setBounds(90, 20, 210, 22);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(80, 80, 80));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("de Implementação");
        jPanelOds17.add(jLabel34);
        jLabel34.setBounds(90, 50, 210, 17);

        jPanelOds06.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds06.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds06.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds06.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds06MouseClicked(evt);
            }
        });
        jPanelOds06.setLayout(null);

        lblOds06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds06.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds06.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds06.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds06.add(lblOds06);
        lblOds06.setBounds(10, 15, 70, 70);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(80, 80, 80));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Saneamento");
        jPanelOds06.add(jLabel14);
        jLabel14.setBounds(90, 50, 210, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(80, 80, 80));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Água Potável e");
        jPanelOds06.add(jLabel13);
        jLabel13.setBounds(90, 20, 210, 22);

        jPanelOds09.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds09.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds09.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds09.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds09MouseClicked(evt);
            }
        });
        jPanelOds09.setLayout(null);

        lblOds09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds09.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds09.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds09.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds09.add(lblOds09);
        lblOds09.setBounds(10, 15, 70, 70);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(80, 80, 80));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Indústria, Inocação");
        jPanelOds09.add(jLabel17);
        jLabel17.setBounds(90, 20, 210, 22);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(80, 80, 80));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("e Infraestrutura");
        jPanelOds09.add(jLabel18);
        jLabel18.setBounds(90, 50, 210, 17);

        jPanelOds12.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds12.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds12.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds12MouseClicked(evt);
            }
        });
        jPanelOds12.setLayout(null);

        lblOds12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds12.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds12.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds12.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds12.add(lblOds12);
        lblOds12.setBounds(10, 15, 70, 70);

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(80, 80, 80));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Consumo e ");
        jPanelOds12.add(jLabel37);
        jLabel37.setBounds(90, 10, 210, 22);

        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(80, 80, 80));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Produção");
        jPanelOds12.add(jLabel38);
        jLabel38.setBounds(90, 40, 210, 17);

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(80, 80, 80));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Responsáveis");
        jPanelOds12.add(jLabel39);
        jLabel39.setBounds(90, 70, 210, 17);

        jPanelOds15.setBackground(new java.awt.Color(242, 242, 242));
        jPanelOds15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOds15.setMaximumSize(new java.awt.Dimension(300, 100));
        jPanelOds15.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanelOds15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOds15MouseClicked(evt);
            }
        });
        jPanelOds15.setLayout(null);

        lblOds15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOds15.setMaximumSize(new java.awt.Dimension(70, 70));
        lblOds15.setMinimumSize(new java.awt.Dimension(70, 70));
        lblOds15.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanelOds15.add(lblOds15);
        lblOds15.setBounds(10, 15, 70, 70);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(80, 80, 80));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Terrestre");
        jPanelOds15.add(jLabel22);
        jLabel22.setBounds(90, 50, 210, 17);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(80, 80, 80));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Vida");
        jPanelOds15.add(jLabel21);
        jLabel21.setBounds(90, 20, 210, 22);

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jPanelOds01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelOds02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelOds03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelOds04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelOds07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContentLayout.createSequentialGroup()
                                        .addComponent(jPanelOds05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanelOds06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelContentLayout.createSequentialGroup()
                                        .addComponent(jPanelOds08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanelOds09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jPanelOds16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelOds17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jPanelOds10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelOds11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelOds12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jPanelOds13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelOds14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelOds15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))))
        );

        jPanelContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelOds01, jPanelOds02, jPanelOds03, jPanelOds04, jPanelOds05, jPanelOds06, jPanelOds07, jPanelOds08, jPanelOds09, jPanelOds10, jPanelOds11, jPanelOds12, jPanelOds13, jPanelOds14, jPanelOds15, jPanelOds16, jPanelOds17});

        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOds01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelOds02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelOds03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOds04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelOds06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelOds05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOds07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOds10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOds13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOds17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOds16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanelContentLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanelOds01, jPanelOds02, jPanelOds03, jPanelOds04, jPanelOds05, jPanelOds06, jPanelOds07, jPanelOds08, jPanelOds09, jPanelOds10, jPanelOds11, jPanelOds12, jPanelOds13, jPanelOds14, jPanelOds15, jPanelOds16, jPanelOds17});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(976, 789));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        if(this.getState() == JFrame.MAXIMIZED_BOTH){
	    this.jPanelHeader.setSize(1920, 200);
	    this.jPanelContent.setSize(1920,880);
	}
    }//GEN-LAST:event_formWindowStateChanged

    private void jPanelOds13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds13MouseClicked
        chamarODS13();
    }//GEN-LAST:event_jPanelOds13MouseClicked

    private void jPanelOds01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds01MouseClicked
        chamarODS01();	
    }//GEN-LAST:event_jPanelOds01MouseClicked

    private void jPanelOds02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds02MouseClicked
        chamarODS02();
    }//GEN-LAST:event_jPanelOds02MouseClicked

    private void jPanelOds03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds03MouseClicked
        chamarODS03();
    }//GEN-LAST:event_jPanelOds03MouseClicked

    private void jPanelOds04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds04MouseClicked
        chamarODS04();
    }//GEN-LAST:event_jPanelOds04MouseClicked

    private void jPanelOds05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds05MouseClicked
        chamarODS05();
    }//GEN-LAST:event_jPanelOds05MouseClicked

    private void jPanelOds06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds06MouseClicked
        chamarODS06();
    }//GEN-LAST:event_jPanelOds06MouseClicked

    private void jPanelOds07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds07MouseClicked
        chamarODS07();
    }//GEN-LAST:event_jPanelOds07MouseClicked

    private void jPanelOds08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds08MouseClicked
        chamarODS08();
    }//GEN-LAST:event_jPanelOds08MouseClicked

    private void jPanelOds09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds09MouseClicked
        chamarODS09();
    }//GEN-LAST:event_jPanelOds09MouseClicked

    private void jPanelOds10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds10MouseClicked
        chamarODS10();
    }//GEN-LAST:event_jPanelOds10MouseClicked

    private void jPanelOds11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds11MouseClicked
        chamarODS11();
    }//GEN-LAST:event_jPanelOds11MouseClicked

    private void jPanelOds12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds12MouseClicked
        chamarODS12();
    }//GEN-LAST:event_jPanelOds12MouseClicked

    private void jPanelOds14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds14MouseClicked
        chamarODS14();
    }//GEN-LAST:event_jPanelOds14MouseClicked

    private void jPanelOds15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds15MouseClicked
        chamarODS15();
    }//GEN-LAST:event_jPanelOds15MouseClicked

    private void jPanelOds16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds16MouseClicked
        chamarODS16();
    }//GEN-LAST:event_jPanelOds16MouseClicked

    private void jPanelOds17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOds17MouseClicked
        chamarODS17();
    }//GEN-LAST:event_jPanelOds17MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

	int keyCode = evt.getKeyCode(); 

	switch (keyCode){
	    case KeyEvent.VK_F1:
		TelaMetas metas = new TelaMetas();
		metas.setVisible(true);
		break;
	}                    
    }//GEN-LAST:event_formKeyPressed

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
	    java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new TelaPrincipal().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelOds01;
    private javax.swing.JPanel jPanelOds02;
    private javax.swing.JPanel jPanelOds03;
    private javax.swing.JPanel jPanelOds04;
    private javax.swing.JPanel jPanelOds05;
    private javax.swing.JPanel jPanelOds06;
    private javax.swing.JPanel jPanelOds07;
    private javax.swing.JPanel jPanelOds08;
    private javax.swing.JPanel jPanelOds09;
    private javax.swing.JPanel jPanelOds10;
    private javax.swing.JPanel jPanelOds11;
    private javax.swing.JPanel jPanelOds12;
    private javax.swing.JPanel jPanelOds13;
    private javax.swing.JPanel jPanelOds14;
    private javax.swing.JPanel jPanelOds15;
    private javax.swing.JPanel jPanelOds16;
    private javax.swing.JPanel jPanelOds17;
    private javax.swing.JLabel lblLogo;
    public static javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOds01;
    private javax.swing.JLabel lblOds02;
    private javax.swing.JLabel lblOds03;
    private javax.swing.JLabel lblOds04;
    private javax.swing.JLabel lblOds05;
    private javax.swing.JLabel lblOds06;
    private javax.swing.JLabel lblOds07;
    private javax.swing.JLabel lblOds08;
    private javax.swing.JLabel lblOds09;
    private javax.swing.JLabel lblOds10;
    private javax.swing.JLabel lblOds11;
    private javax.swing.JLabel lblOds12;
    private javax.swing.JLabel lblOds13;
    private javax.swing.JLabel lblOds14;
    private javax.swing.JLabel lblOds15;
    private javax.swing.JLabel lblOds16;
    private javax.swing.JLabel lblOds17;
    public static javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
