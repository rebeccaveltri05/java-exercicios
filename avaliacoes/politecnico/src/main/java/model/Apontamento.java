package model;

public class Apontamento {
    private Double nota;
    private String status;
    private String data;
    private Disciplina disciplina;

    public Apontamento(Double nota, String status, String data, Disciplina disciplina) {
        this.nota = nota;
        this.status = status;
        this.data = data;
        this.disciplina = disciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void imprimirRegistro(){
        this.disciplina.imprimirRequisitos();
        System.out.println("Nota: " + nota + " Status: " + status + " Data: " + data);
    }
}
