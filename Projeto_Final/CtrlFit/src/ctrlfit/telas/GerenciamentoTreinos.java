package ctrlfit.telas;

import ctrlfit.conexao.AlunoDAO;
import ctrlfit.conexao.ExercicioDAO;
import ctrlfit.entity.Aluno;
import ctrlfit.entity.Exercicio;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoTreinos extends javax.swing.JFrame {

    private boolean pesquisarAluno = false;
    Aluno alunoParaEmitirTreino = new Aluno();

    public GerenciamentoTreinos() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ctrlfit/icons/logo_haltere2.png")));
        jTableTreinos.setDefaultEditor(Object.class, null);//Deixa a jTable não editavel
        carregarDadosTreinos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTreinos = new javax.swing.JTable();
        btnCadastrarTreino = new javax.swing.JButton();
        btnExibirTreino = new javax.swing.JButton();
        btnExcluirTreino = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarAluno = new javax.swing.JTextField();
        btnPesquisarAluno = new javax.swing.JButton();
        btnEmitirTreino = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jComboBoxPesquisarTreino = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Treinos");
        setResizable(false);

        jTableTreinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Matrícula", "Treino", "Exercício", "Séries", "Repetições", "Observações"
            }
        ));
        jTableTreinos.setFocusable(false);
        jTableTreinos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableTreinos);
        if (jTableTreinos.getColumnModel().getColumnCount() > 0) {
            jTableTreinos.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableTreinos.getColumnModel().getColumn(1).setMaxWidth(70);
            jTableTreinos.getColumnModel().getColumn(2).setMaxWidth(70);
            jTableTreinos.getColumnModel().getColumn(4).setMaxWidth(70);
            jTableTreinos.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        btnCadastrarTreino.setText("Cadastrar");
        btnCadastrarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTreinoActionPerformed(evt);
            }
        });

        btnExibirTreino.setText("Exibir");
        btnExibirTreino.setToolTipText("Exibir ou Alterar dados");
        btnExibirTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirTreinoActionPerformed(evt);
            }
        });

        btnExcluirTreino.setText("Excluir");
        btnExcluirTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTreinoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar Matrícula:");

        btnPesquisarAluno.setText("Pesquisar");
        btnPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAlunoActionPerformed(evt);
            }
        });

        btnEmitirTreino.setText("Emitir Treino");
        btnEmitirTreino.setEnabled(false);
        btnEmitirTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirTreinoActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar Treino:");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jComboBoxPesquisarTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "A", "B", "C", "D", "E" }));
        jComboBoxPesquisarTreino.setFocusable(false);
        jComboBoxPesquisarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarTreinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPesquisarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrarTreino)
                        .addGap(18, 18, 18)
                        .addComponent(btnExibirTreino)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirTreino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmitirTreino)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxPesquisarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarTreino)
                    .addComponent(btnExibirTreino)
                    .addComponent(btnExcluirTreino)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmitirTreino)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTreinoActionPerformed
        CadastroExercicio cadastroExers = new CadastroExercicio(this);
        cadastroExers.setVisible(true);
    }//GEN-LAST:event_btnCadastrarTreinoActionPerformed

    private void btnExibirTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirTreinoActionPerformed
        //armazena o indice da linha na variavel linhaSelecionada, a primeira linha é 0, -1 para nenhuma linha selecionada
        int linhaSelecionada = jTableTreinos.getSelectedRow();

        if (linhaSelecionada != -1) {
            //obetr o codigo da linha selecionada
            int codigo = (int) jTableTreinos.getValueAt(linhaSelecionada, 0);

            Exercicio objExercicio = new Exercicio();
            objExercicio.setCodigo(codigo);

            ExercicioDAO objExercicioDao = new ExercicioDAO();
            objExercicio = objExercicioDao.exibirExercicio(objExercicio);

            CadastroExercicio cadastroExers = new CadastroExercicio(this, objExercicio);
            cadastroExers.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para exibir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExibirTreinoActionPerformed

    private void btnExcluirTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTreinoActionPerformed
        //armazena o indice da linha na variavel linhaSelecionada, a primeira linha é 0, -1 para nenhuma linha selecionada
        int linhaSelecionada = jTableTreinos.getSelectedRow();

        if (linhaSelecionada != -1) {
            // Obter o codigo da linha selecionada
            int codigo = (int) jTableTreinos.getValueAt(linhaSelecionada, 0);

            Exercicio objExercicio = new Exercicio();
            objExercicio.setCodigo(codigo);

            // Tela para confirmar exclusão
            //int resposta = JOptionPane.showConfirmDialog(null, "Você deseja realmente excluir esse exercício?");
            Object[] opcoes = {"Sim", "Não"};
            int resposta = JOptionPane.showOptionDialog(
                    this,
                    "Você deseja realmente excluir esse exercício?",
                    "Confirmação de Exclusão",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, // Ícone padrão
                    opcoes, // Opções de botões personalizadas
                    opcoes[0] // Opção padrão selecionada
            );

            if (resposta == JOptionPane.YES_OPTION) {
                ExercicioDAO objExercicioDao = new ExercicioDAO();
                objExercicioDao.excluirExercicio(objExercicio);
                carregarDadosTreinos();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirTreinoActionPerformed

    private void btnPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAlunoActionPerformed
        if (txtPesquisarAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a matrícula do aluno(a) para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int matricula = Integer.parseInt(txtPesquisarAluno.getText());

                ExercicioDAO objExercicioDao = new ExercicioDAO();
                // Verificar se a matrícula existe
                if (!objExercicioDao.verificarMatriculaExistente(matricula)) {
                    JOptionPane.showMessageDialog(null, "A matrícula do aluno não existe. Verifique e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                    txtPesquisarAluno.setText("");
                } else {
                    alunoParaEmitirTreino.setMatricula(matricula);
                    pesquisarAluno = true;
                    carregarDadosTreinos();
                    btnEmitirTreino.setEnabled(true);
                    jComboBoxPesquisarTreino.setSelectedIndex(0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "A matrícula deve conter apenas números.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                txtPesquisarAluno.setText("");
            }
        }
    }//GEN-LAST:event_btnPesquisarAlunoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        pesquisarAluno = false;
        carregarDadosTreinos();
        txtPesquisarAluno.setText("");
        btnEmitirTreino.setEnabled(false);
        jComboBoxPesquisarTreino.setSelectedIndex(0);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEmitirTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirTreinoActionPerformed
        //Pegar todas as informações do aluno e colocar no objeto alunoParaEmitirTreino
        AlunoDAO objAlunoDao = new AlunoDAO();
        alunoParaEmitirTreino = objAlunoDao.exibirAluno(alunoParaEmitirTreino);

        //chamar o metodo emitir treino da classe ExercicioDAO passando um objeto aluno com todas as informações do aluno
        ExercicioDAO objExercicioDao = new ExercicioDAO();
        objExercicioDao.emitirTreino(alunoParaEmitirTreino);
    }//GEN-LAST:event_btnEmitirTreinoActionPerformed

    private void jComboBoxPesquisarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarTreinoActionPerformed
        carregarDadosTreinos();
    }//GEN-LAST:event_jComboBoxPesquisarTreinoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrarTreino;
    private javax.swing.JButton btnEmitirTreino;
    private javax.swing.JButton btnExcluirTreino;
    private javax.swing.JButton btnExibirTreino;
    private javax.swing.JButton btnPesquisarAluno;
    private javax.swing.JComboBox<String> jComboBoxPesquisarTreino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTreinos;
    private javax.swing.JTextField txtPesquisarAluno;
    // End of variables declaration//GEN-END:variables

    public void carregarDadosTreinos() {
        try {
            Connection conexao = ctrlfit.conexao.ConexaoDAO.conectarBD();

            String sql = "";
            PreparedStatement st;

            if (pesquisarAluno) {
                int matriculaAluno = Integer.parseInt(txtPesquisarAluno.getText());
                int opcao = jComboBoxPesquisarTreino.getSelectedIndex();

                if (opcao == 1) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Aluno_Matricula_Aluno = ? AND Divisao_Treino = 'A'";
                } else if (opcao == 2) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Aluno_Matricula_Aluno = ? AND Divisao_Treino = 'B'";
                } else if (opcao == 3) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Aluno_Matricula_Aluno = ? AND Divisao_Treino = 'C'";
                } else if (opcao == 4) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Aluno_Matricula_Aluno = ? AND Divisao_Treino = 'D'";
                } else if (opcao == 5) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Aluno_Matricula_Aluno = ? AND Divisao_Treino = 'E'";
                } else {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Aluno_Matricula_Aluno = ? ORDER BY Divisao_Treino";
                }

                st = conexao.prepareStatement(sql);
                st.setInt(1, matriculaAluno);// Define o valor para o parâmetro

            } else {
                int opcao = jComboBoxPesquisarTreino.getSelectedIndex();

                if (opcao == 1) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Divisao_Treino = 'A'";
                } else if (opcao == 2) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Divisao_Treino = 'B'";
                } else if (opcao == 3) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Divisao_Treino = 'C'";
                } else if (opcao == 4) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Divisao_Treino = 'D'";
                } else if (opcao == 5) {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino WHERE Divisao_Treino = 'E'";
                } else {
                    sql = "SELECT Codigo_Treino, Aluno_Matricula_Aluno, Divisao_Treino, Nome_Treino, QuantSeries_Treino, QuantRepeticoes_Treino, Observacoes_Treino FROM treino";
                }

                st = conexao.prepareStatement(sql);

            }

            ResultSet rs = st.executeQuery();

            // Obter o modelo da tabela e limpar dados anteriores
            DefaultTableModel model = (DefaultTableModel) jTableTreinos.getModel();
            model.setRowCount(0);

            // Iterar pelos resultados e adicionar à tabela
            while (rs.next()) {
                int codigoTreino = rs.getInt("Codigo_Treino");
                int matriculaAluno = rs.getInt("Aluno_Matricula_Aluno");
                char divisaoTreino = rs.getString("Divisao_Treino").charAt(0);
                String nomeTreino = rs.getString("Nome_Treino");
                int series = rs.getInt("QuantSeries_Treino");
                int repeticoes = rs.getInt("QuantRepeticoes_Treino");
                String observacoes = rs.getString("Observacoes_Treino");
                model.addRow(new Object[]{codigoTreino, matriculaAluno, divisaoTreino, nomeTreino, series, repeticoes, observacoes});
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

}