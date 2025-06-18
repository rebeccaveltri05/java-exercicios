package model;

import java.util.ArrayList;
import model.interfaces.Conclusao;

public class Aluno extends Pessoa implements Conclusao {

    private int matricula;
    private ArrayList<Apontamento> historico;
    private Grade grade;

    public Aluno(String nome, String apelido, String numeroFiscal, int matricula, Grade grade, ArrayList<Apontamento> apontamentos) {
        super(nome, apelido, numeroFiscal);
        this.matricula = matricula;
        this.grade = grade;
        this.historico = apontamentos;
    }

    public Aluno(String nome, String apelido, String numeroFiscal, int matricula, ArrayList<Apontamento> historico,
            Grade grade) {
        super(nome, apelido, numeroFiscal);
        this.matricula = matricula;
        this.historico = new ArrayList<Apontamento>();
        this.grade = grade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Apontamento> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Apontamento> historico) {
        this.historico = historico;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void addHistorico(Apontamento apontamento) {
        this.historico.add(apontamento);
    }

    public void imprimirHistorico() {
        System.out.println("Aluno [Nome: " + getNome() + ", Apelido: " + getApelido() + ", Numero Fiscal: "
                + getNumeroFiscal() + ", Matricula: " + matricula + "]");
        System.out.println("----------- Grade -----------");
        this.grade.imprimirGrade(grade);
        System.out.println("----------- Histórico -----------");
        for (Apontamento historicos : historico) {
            historicos.imprimirRegistro();
        }
    }

    @Override
    public boolean estaIntegralizado() {
        if (this.grade.getDisciplinas().size() > this.historico.size()) {
            return false;
        }

        int contador = 0;
        for (Apontamento apontamento : this.historico) {
            for (Disciplina disciplina : this.grade.getDisciplinas()) {
                if (disciplina.getNome() == apontamento.getDisciplina().getNome()) {
                    contador++;
                }
            }
        }

        if (contador >= this.getGrade().getDisciplinas().size()) {
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Disciplina> getDisciplinasFaltantes() {
        ArrayList<Disciplina> disciplinasFaltantes = new ArrayList<Disciplina>();

        for (Disciplina disciplina : this.grade.getDisciplinas()) {
            boolean cursou = false;

            for (Apontamento apontamento : this.historico) {
                if (apontamento.getDisciplina().getNome() == disciplina.getNome()) {
                    cursou = true;
                }
            }

            if (!cursou) {
                disciplinasFaltantes.add(disciplina);
            }
        }

        return disciplinasFaltantes;
    }

    public void imprimirPessoa() {
        System.out.println("Aluno [Nome: " + getNome() + ", Apelido: " + getApelido() + ", NumeroFiscal: "
                + getNumeroFiscal() + ", Matricula: " + this.matricula + "]");
    }
}
