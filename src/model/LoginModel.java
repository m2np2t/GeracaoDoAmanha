package model;

import java.sql.*;

public class LoginModel {

    /**
     * @return the usuario
     */
    public String getUsuario() {
	return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }

    /**
     * @return the pontuacao
     */
    public int getPontuacao() {
	return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(int pontuacao) {
	this.pontuacao = pontuacao;
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

    /**
     * @return the conectou
     */
    public boolean isConectou() {
	return conectou;
    }

    /**
     * @param conectou the conectou to set
     */
    public void setConectou(boolean conectou) {
	this.conectou = conectou;
    }
    
    private String usuario;
    private int pontuacao;
    private String mensagem;
    private boolean conectou;
    private Connection conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public void verificarLogin(String usuario, String senha){
	String sql = "select usuario, pontuacao from usuario where usuario=? and senha=?";
	
	try {
	   conexao = Conexao.conector();
	   pst = conexao.prepareStatement(sql);
	   pst.setString(1, usuario);
	   pst.setString(2, senha); 
	   
	   rs = pst.executeQuery();
	   if(rs.next()){
	       setUsuario(rs.getString(1));
	       setPontuacao(rs.getInt(2));
	       setConectou(true);
	   }else{
	       setConectou(false);
	       setMensagem("Usuário e Senha inválidos !");
	   }
	   
	} catch (SQLException e) {
	    setMensagem(e.getMessage());
	    setConectou(false);
	}    
    }
}