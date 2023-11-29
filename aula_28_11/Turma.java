package aula_28_11;

public class Turma {
    
    private Curso curso;
    private Disciplina disciplina;
    
    public Curso getCurso(){
        return this.curso;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public Disciplina getDisciplina(){
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
}
