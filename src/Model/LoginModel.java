package Model;

/**
 *
 * @author pedro
 */

import java.sql.*;

public class LoginModel {

    /**
     * @return the pontuacao_logado
     */
    public int getPontuacao_logado() {
	return pontuacao_logado;
    }

    /**
     * @param pontuacao_logado the pontuacao_logado to set
     */
    public void setPontuacao_logado(int pontuacao_logado) {
	this.pontuacao_logado = pontuacao_logado;
    }

    /**
     * @return the usuario_logado
     */
    public String getUsuario_logado() {
	return usuario_logado;
    }

    /**
     * @param usuario_logado the usuario_logado to set
     */
    public void setUsuario_logado(String usuario_logado) {
	this.usuario_logado = usuario_logado;
    }

    /**
     * @return the nome_logado
     */
    public String getNome_logado() {
	return nome_logado;
    }

    /**
     * @param nome_logado the nome_logado to set
     */
    public void setNome_logado(String nome_logado) {
	this.nome_logado = nome_logado;
    }

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
    
    private static String usuario_logado;
    private static String nome_logado;
    private int pontuacao_logado;
    private String mensagem;
    
    
    public boolean validarLogin(String usuario, String senha) throws SQLException {
	String sql="select * from usuario where usuario=? and senha=?";
	conexao = Conexao.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,usuario);
            pst.setString(2, senha);   
            
            rs = pst.executeQuery();
//            return rs.next();
	    if(rs.next()){
		setNome_logado(rs.getString(2));
		setUsuario_logado(rs.getString(3));
		setPontuacao_logado(rs.getInt(5));
	    }
	    return true;
        } catch (SQLException e) {
            setMensagem(e.getMessage());
	    return false;
	} finally{
	    conexao.close();
	}
    }
    
}
