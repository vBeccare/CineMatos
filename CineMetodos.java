import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CineMetodos {
	
	public Cinema cinezao;
	public BDC bd;
	private PreparedStatement st;
	private ResultSet rs;
	private String men, sql;
	public static final byte alteracaoA = 1;
	public static final byte alteracaoB = 2;
	public static final byte alteracaoC = 3;
	public static final byte adicionar = 4;

public CineMetodos() {
	cinezao = new Cinema();
	bd = new BDC();
	
}


public String adicionar(int operacao2){
	men = "Compra efetuada com sucesso";
	try {
		if (operacao2 == adicionar) {
			sql= "insert into infos values(?,?,?,?,?,?,?,?,?,?,?,?)";
			st = bd.c.prepareStatement(sql);
			st.setString(1, cinezao.getPedido());
			st.setString(2, cinezao.getNomeFilme());
			st.setString(3, cinezao.getHorarioSala());
			st.setString(4, cinezao.getCadeiras());
			st.setString(5, cinezao.getEntrada());
			st.setString(6, cinezao.getInteiran());
			st.setString(7, cinezao.getMeian());
			st.setDouble(8, cinezao.getPreco());
			st.setString(9, cinezao.getPipocat());
			st.setString(10, cinezao.getBebida());
			st.setString(11, cinezao.getDoce1());
			st.setString(12, cinezao.getDoce2());
		}
		if(st.executeUpdate()==0){
			men="Falha na operação";
		}
		}catch (SQLException erro) {
			men = "Falha na operação" + erro.toString();
		}
		return men;
}
public String atualizar(int operacao) {
	men = "Compra efetuada com sucesso";
	try {
		if (operacao == alteracaoA) {
			st = bd.c.prepareStatement( sql= "update filmes set A1= ?,A2= ?,A3= ?,A4= ?,A5= ?,A6= ?,A7= ?,A8= ?,A9= ?,A10= ? where nome = ? and sala =?");
			st.setString(1, cinezao.getA1());
			st.setString(2, cinezao.getA2());
			st.setString(3, cinezao.getA3());
			st.setString(4, cinezao.getA4());
			st.setString(5, cinezao.getA5());
			st.setString(6, cinezao.getA6());
			st.setString(7, cinezao.getA7());
			st.setString(8, cinezao.getA8());
			st.setString(9, cinezao.getA9());
			st.setString(10, cinezao.getA10());
			st.setString(11, cinezao.getNomeFilme());
			st.setString(12, cinezao.getHorarioSala());
		} else if (operacao == alteracaoB) {
			 sql= "update filmes set B1= ?,B2= ?,B3= ?,B4= ?,B5= ?,B6= ?,B7= ?,B8= ?,B9= ?,B10= ? where nome = ? and sala =?";
			st = bd.c.prepareStatement(sql);
			st.setString(1, cinezao.getB1());
			st.setString(2, cinezao.getB2());
			st.setString(3, cinezao.getB3());
			st.setString(4, cinezao.getB4());
			st.setString(5, cinezao.getB5());
			st.setString(6, cinezao.getB6());
			st.setString(7, cinezao.getB7());
			st.setString(8, cinezao.getB8());
			st.setString(9, cinezao.getB9());
			st.setString(10, cinezao.getB10());
			st.setString(11, cinezao.getNomeFilme());
			st.setString(12, cinezao.getHorarioSala());
		} else if (operacao == alteracaoC) {
			sql= "update filmes set C1= ?,C2= ?,C3= ?,C4= ?,C5= ?,C6= ?,C7= ?,C8= ?,C9= ?,C10= ? where nome = ? and sala =?";
			st = bd.c.prepareStatement(sql);
			st.setString(1, cinezao.getC1());
			st.setString(2, cinezao.getC2());
			st.setString(3, cinezao.getC3());
			st.setString(4, cinezao.getC4());
			st.setString(5, cinezao.getC5());
			st.setString(6, cinezao.getC6());
			st.setString(7, cinezao.getC7());
			st.setString(8, cinezao.getC8());
			st.setString(9, cinezao.getC9());
			st.setString(10, cinezao.getC10());
			st.setString(11, cinezao.getNomeFilme());
			st.setString(12, cinezao.getHorarioSala());
		}
		if (st.executeUpdate() == 0) {
			men = "Falha na operação";
		}
	} catch (SQLException erro) {
		men = "Falha na operação" + erro.toString();
	}
	return men;
}

	 
	
public void setarcadeiras(){
	sql= "select *from filmes where nome = ? and sala =?";
	try {
		st = bd.c.prepareStatement(sql);
		st.setString(1, cinezao.getNomeFilme());
		st.setString(2, cinezao.getHorarioSala());
		rs = st.executeQuery();
		if (rs.next()) {
		cinezao.setA1(rs.getString(3));
		cinezao.setA2(rs.getString(4));
		cinezao.setA3(rs.getString(5));
		cinezao.setA4(rs.getString(6));
		cinezao.setA5(rs.getString(7));
		cinezao.setA6(rs.getString(8));
		cinezao.setA7(rs.getString(9));
		cinezao.setA8(rs.getString(10));
		cinezao.setA9(rs.getString(11));
		cinezao.setA10(rs.getString(12));
		cinezao.setB1(rs.getString(13));
		cinezao.setB2(rs.getString(14));
		cinezao.setB3(rs.getString(15));
		cinezao.setB4(rs.getString(16));
		cinezao.setB5(rs.getString(17));
		cinezao.setB6(rs.getString(18));
		cinezao.setB7(rs.getString(19));
		cinezao.setB8(rs.getString(20));
		cinezao.setB9(rs.getString(21));
		cinezao.setB10(rs.getString(22));
		cinezao.setC1(rs.getString(23));
		cinezao.setC2(rs.getString(24));
		cinezao.setC3(rs.getString(25));
		cinezao.setC4(rs.getString(26));
		cinezao.setC5(rs.getString(27));
		cinezao.setC6(rs.getString(28));
		cinezao.setC7(rs.getString(29));
		cinezao.setC8(rs.getString(30));
		cinezao.setC9(rs.getString(31));
		cinezao.setC10(rs.getString(32));
		} else {
			JOptionPane.showMessageDialog(null, "Filme não encontrado");
			
		}
	} catch (SQLException erro) {
		JOptionPane.showMessageDialog(null, erro);
	}
	
	
	}






}