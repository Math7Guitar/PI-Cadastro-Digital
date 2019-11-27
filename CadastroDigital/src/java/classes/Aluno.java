package classes;

/**
 *
 * @author matheus
 */
public class Aluno {
    
    private String turma, curso, nome, foto;
    private int ra;
    private double digital;
    
    public Aluno(){}
    
    //Métodos getters
    
    public String getNome(){ return this.nome; }
    public String getTurma(){ return this.turma; }
    public String getCurso(){ return this.curso; }
    public String getFoto(){ return this.foto; }
    public double getDigital(){ return this.digital; }
    public int getRa(){ return this.ra; }
    
    
    //Métodos setters
    
    public void setNome(String n){ this.nome = n; }
    public void setTurma(String t){ this.turma = t; } 
    public void setCurso(String c){ this.curso = c; }
    public void setFoto(String f){ this.foto = f; }
    public void setDigital(double d){ this.digital = d; }
    public void setRa(int ra){ this.ra = ra; }
}
