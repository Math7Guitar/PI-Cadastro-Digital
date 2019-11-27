package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author matheus
 */
public class DigitalDAO {
    
    Connection connection;
	
	public DigitalDAO() {
		
		try {
			this.connection = ConnectionFactory.getConnection();
		}
		catch(ClassNotFoundException c) {
			System.out.println("Não foi possivel por causa do ClassNotFoundException");
		}
		catch(SQLException d){
			System.out.println("Não foi possivel por causa do SQLException");
		}
	}
    
    public void cadastrarA(Aluno a) throws SQLException{
        
        int i = 1;
        String sql = "INSERT INTO Alunos (cod, nome, curso, ra, turma, foto, digital) VALUES (?,?,?,?,?,?,?)";		
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setInt(1, i);
            ps.setString(2, a.getNome());
            ps.setString(3, a.getCurso());
            ps.setInt(4, a.getRa());
            ps.setString(5, a.getTurma());
            ps.setString(6, a.getFoto());
            ps.setDouble(7, a.getDigital());
            
            i++;
        
            ps.execute();
            ps.close();
    }
    
    
    public void cadastrarP(Professor p) throws SQLException{
        
        int i = 1;
        String sql = "INSERT INTO Alunos (cod, nome, materia, rp, foto, digital) VALUES (?,?,?,?,?,?)";		
            
        PreparedStatement ps = this.connection.prepareStatement(sql);
        
        ps.setInt(1, i);
        ps.setString(2, p.getNome());
        ps.setString(3, p.getMateria());
        ps.setInt(4, p.getRp());
        ps.setString(5, p.getFoto());
        ps.setDouble(6, p.getDigital());
        
        
        i++;
        
        ps.execute();
        ps.close();
    }
    
    
    public Aluno consultarA(double d) throws SQLException {
		String sql = "SELECT * FROM Alunos WHERE digital = ?";
		
		PreparedStatement ps = this.connection.prepareStatement(sql);
		
		ps.setDouble(1, d);
		
		ResultSet resultado = ps.executeQuery();
		
		if (resultado.next()) {
                    Aluno aluno = new Aluno();
                    aluno.setNome(resultado.getString("nome"));
                    aluno.setCurso(resultado.getString("curso"));
                    aluno.setRa(resultado.getInt("ra"));
                    aluno.setTurma(resultado.getString("turma"));
                    aluno.setFoto(resultado.getString("foto"));
                    ps.close();
                    return aluno;
		} else {
                    ps.close();
                    return null;
		}
	}
    
    
    public Professor consultarP(int rp) throws SQLException {
		String sql = "SELECT * FROM Professores WHERE rp = ?";
		
		PreparedStatement ps = this.connection.prepareStatement(sql);
		
		ps.setInt(1, rp);
		
		ResultSet resultado = ps.executeQuery();
		
		if (resultado.next()) {
                    Professor prof = new Professor();
                    prof.setNome(resultado.getString("nome"));
                    prof.setMateria(resultado.getString("materia"));
                    prof.setRp(resultado.getInt("rp"));
                    prof.setFoto(resultado.getString("foto"));
                    ps.close();
                    return prof;
		} else {
                    ps.close();
                    return null;
		}
	}
	
    public void alterarA(Aluno aluno) throws SQLException{
	
        String  sql = "UPDATE Alunos Set nome = ?, curso = ?, turma = ? WHERE ra = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        
        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getCurso());
        ps.setString(3, aluno.getTurma());
        ps.setInt(4, aluno.getRa());
        
        ps.execute();
        ps.close();
    }
    
    
    public void alterarP(Professor prof) throws SQLException{
	
        String  sql = "UPDATE Professores Set nome = ?, materia = ?, foto = ? WHERE rp = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
        
        ps.setString(1, prof.getNome());
        ps.setString(2, prof.getMateria());
        ps.setString(3, prof.getFoto());
        ps.setDouble(3, prof.getDigital());
        ps.setInt(4, prof.getRp());
        
        ps.execute();
        ps.close();
    }
    

    public void excluirA(int ra) throws SQLException{
		
        String sql = "DELETE FROM Alunos WHERE ra = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
            
        ps.setInt(1, ra);
            
        ps.execute();
        ps.close();
    }
    
    
    public void excluirP(int rp) throws SQLException{
		
        String sql = "DELETE FROM Professores WHERE rp = ?";
        PreparedStatement ps = this.connection.prepareStatement(sql);
            
        ps.setInt(1, rp);
            
        ps.execute();
        ps.close();
    }    
    
	
    public ArrayList<Aluno> listarA() throws SQLException{
	
        String sql = "SELECT * FROM Alunos";
		
	PreparedStatement ps = this.connection.prepareStatement(sql);
		
	ResultSet resultado = ps.executeQuery();
		
	ArrayList<Aluno> listaDeAlu = new ArrayList<>();
		
            while (resultado.next()) {
			
		Aluno aluno = new Aluno ();
			
		aluno.setNome(resultado.getString("nome"));
		aluno.setCurso(resultado.getString("curso"));
		aluno.setRa(resultado.getInt("ra"));
		aluno.setTurma(resultado.getString("turma"));
			
		listaDeAlu.add(aluno);		
            }
	
            ps.close();
            return listaDeAlu;
    }
    
    
    public ArrayList<Professor> listarP() throws SQLException{
	
        String sql = "SELECT * FROM Professores";
		
	PreparedStatement ps = this.connection.prepareStatement(sql);
		
	ResultSet resultado = ps.executeQuery();
		
	ArrayList<Professor> listaDeProf = new ArrayList<>();
		
            while (resultado.next()) {
			
		Professor prof = new Professor ();
			
		prof.setNome(resultado.getString("nome"));
		prof.setMateria(resultado.getString("materia"));
		prof.setRp(resultado.getInt("rp"));
		prof.setDigital(resultado.getByte("digital"));
                prof.setFoto(resultado.getString("foto"));
			
		listaDeProf.add(prof);		
            }
	
            ps.close();
            return listaDeProf;
		
    }
}
