package Model;

import java.sql.*;

/**
 *
 * @author pedro
 */
public class CadastroUsuarioModel {

    /**
     * @return the mensagem
     */
    public String getMensagem() {
	return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
    }
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String mensagem;
    
    public void inserir(String nome, String email, String usuario, String senha) {
	String sql="insert into usuario(nome_usuario, email, usuario, senha) values(?,?,?,?)";
	conexao = Conexao.conector();
        
	try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,nome);
            pst.setString(2,email); 
	    pst.setString(3,usuario);
	    pst.setString(4,senha);
           
	    int adicionado = pst.executeUpdate();
	    if(adicionado > 0){
		setMensagem("Cadastro inserido com sucesso!");
	    }else{
		setMensagem("Verifique os dados digitados!");
	    }
	    conexao.close();
        } catch (SQLException e) {
            setMensagem(e.getMessage());
	}
    }
}
