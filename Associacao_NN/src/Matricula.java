import java.time.LocalDateTime;

public class Matricula {
    private int num;
    private LocalDateTime data;
    private float nota;
    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula() {
        this(0, LocalDateTime.now(), null, null);
    }

    public Matricula(int num, LocalDateTime data, Aluno aluno, Disciplina disciplina){
        this.num = num;
        this.nota = 0;
        this.data = data;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }


    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "num=" + num +
                ", data=" + data +
                ", nota=" + nota +
                ", aluno=" + aluno +
                ", disciplina=" + disciplina +
                '}';
    }
}
