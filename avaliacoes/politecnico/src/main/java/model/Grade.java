package model;

import java.util.ArrayList;

public class Grade {
    private int ano;
    private int chTotal;
    private ArrayList<Disciplina> disciplinas;
    private Curso curso;

    public Grade(int ano, Curso curso, ArrayList<Disciplina> disciplinas) {
        this.ano = ano;
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    public Grade(int ano, int chTotal, ArrayList<Disciplina> disciplinas, Curso curso) {
        this.ano = ano;
        this.chTotal = chTotal;
        this.disciplinas = new ArrayList<Disciplina>();
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getChTotal() {
        return chTotal;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void imprimirGrade(Grade grade){
       System.out.println("Ano: " + ano + ", chTotal: " + chTotal);
       this.curso.imprimirInfo();
       for (Disciplina disciplina : disciplinas) {
        disciplina.imprimirRequisitos();
       }
    }
}
