
package javareflectionlistaex1;


public class Aluno {
    
    
    private String nome = "Rubens";
    private int prontuario = 3024121;
    private String campus = "SPO";
    private String curso = "TADS";
    private int semestre = 6;

//    public Aluno(String nome, int prontuario, String campus, String curso, int semestre) {
//        this.nome = "Rubens";
//        this.prontuario = 3024121;
//        this.campus = "SPO";
//        this.curso = "TADS";
//        this.semestre = 6;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
      
    
}
