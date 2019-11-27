package classes;

/**
 *
 * @author matheus
 */
public class Professor {
    
    private int rp;
    private String materia, nome, foto;
    private double digital;
    
    //Construtor
    public Professor(){}
    
    //Métodos Getters
    public String getNome(){ return this.nome; }
    public String getMateria(){ return this.materia; }
    public String getFoto(){ return this.foto; }
    public double getDigital(){ return this.digital; }
    public int getRp(){ return this.rp; }
    
    //Métodos Setters
    public void setNome(String n){ this.nome = n; }
    public void setMateria(String m){ this.materia = m; } 
    public void setFoto(String f){ this.foto = f; }
    public void setDigital(double d){ this.digital = d; }
    public void setRp(int rp){ this.rp = rp; }
}
