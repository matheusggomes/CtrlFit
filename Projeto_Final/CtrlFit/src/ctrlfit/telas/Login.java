package ctrlfit.telas;

import ctrlfit.conexao.UsuarioDAO;
import ctrlfit.entity.Usuario;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ctrlfit/icons/logo_haltere2.png")));//icone da janela
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
        jPanel2 = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnEsqueciSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 75, 166));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setText("Usuário");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnEntrar.setBackground(new java.awt.Color(242, 242, 242));
        btnEntrar.setText("Entrar");
        btnEntrar.setActionCommand("testeee");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnEsqueciSenha.setBackground(new java.awt.Color(242, 242, 242));
        btnEsqueciSenha.setText("Esqueci a senha");
        btnEsqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueciSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEsqueciSenha)
                    .addComponent(btnEntrar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSenha)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEmail)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(btnEsqueciSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctrlfit/icons/logo_login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            String nome_usuario, senha_usuario;
            nome_usuario = txtUsuario.getText();
            senha_usuario = txtSenha.getText();

            // Verificar se os campos estão vazios
            if (nome_usuario.isEmpty() || senha_usuario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha os campos de usuário e senha.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return; // Interromper o fluxo se os campos estiverem vazios
            }
            //criando um objeto da classe Usuario e atribuindo os valores digitados para usuario e senha
            Usuario objUsuario = new Usuario();
            objUsuario.setNome_usuario(nome_usuario);
            objUsuario.setSenha_usuario(senha_usuario);

            //criando um objeto da classe UsuarioDAO e chamando o metodo autenticarUsuario
            //passando como parametro o objUsuario e armazenando em uma variavel ResultSet
            UsuarioDAO objUsuarioDao = new UsuarioDAO();
            ResultSet rsUsuarioDao = objUsuarioDao.autenticarUsuario(objUsuario);

            if (rsUsuarioDao.next()) {
                //chamar tela que quero abrir              
                // Captura o cargo do usuário autenticado
                String cargo = rsUsuarioDao.getString("Cargo_Usuario");

                if (cargo.equalsIgnoreCase("Outro")) {
                    JOptionPane.showMessageDialog(null, "Cargo do usuário: " + cargo
                            + "\nUsuário não possui acesso ao sistema.");
                    txtUsuario.setText("");
                    txtSenha.setText("");
                } else {
                    //chama a tela inicial passando como parametro o cargo do usuario
                    TelaInicial objTelaInicial = new TelaInicial(cargo);
                    objTelaInicial.setVisible(true);
                    dispose();
                }
            } else {
                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Login [ERRO]: " + erro);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueciSenhaActionPerformed
        JOptionPane.showMessageDialog(null, "Entre em contato com o gerente.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnEsqueciSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueciSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}