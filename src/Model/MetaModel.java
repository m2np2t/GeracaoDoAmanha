package Model;

/**
 *
 * @author pedro
 */

import java.sql.*;

public class MetaModel {
  
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    

    public void alterandoDados(int pontuacao, String usuario){
	String sql="update usuario set pontuacao=? where usuario=?";
	conexao = Conexao.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, pontuacao);
            pst.setString(2, usuario);   
            
            int result = pst.executeUpdate();
//            return rs.next();
	    if(result > 0){
		System.out.println("Atualizado com sucesso!");
	    }
        } catch (SQLException e) {
		e.getMessage();
	}
    }
    
    public int somaPonto(int pontuacao, int pontos, String usuario){
	String sql = "select pontuacao from usuario where usuario= " + usuario;
	pontuacao += pontos;
	return pontuacao;
    }
    
    public int subtraiPonto(int pontuacao, int pontos, String usuario){
	String sql = "select pontuacao from usuario where usuario= " + usuario;
	pontuacao -= pontos;
	return pontuacao;
    }
    
}
