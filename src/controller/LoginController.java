package controller;

import model.LoginModel;

public class LoginController {

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
    
    private String usuario;
    private int pontuacao;
    private String mensagem;
    private final LoginModel login = new LoginModel();;
    
    public boolean logar(String usuario, String senha){
	login.verificarLogin(usuario, senha);
	if(login.isConectou()){
	    setUsuario(login.getUsuario());
	    setPontuacao(login.getPontuacao());
	}else{
	    setMensagem(login.getMensagem());
	}
	
	return login.isConectou();
    }
}

