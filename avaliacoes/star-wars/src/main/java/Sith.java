import java.util.ArrayList;

import interfaces.Force;

public class Sith extends Pessoa implements Force {
    private String titulo = "Sith";
    private ArrayList weapons;

    public Sith(String nome, String sobrenome, String titulo/* , String weapons */) {
        super(nome, sobrenome);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Sith() {

    }

    public void imprime() {
        System.out.println(super.getNome() + " " + super.getSobrenome());
        System.out.println("Titulo: " + titulo);
    }

    @Override
    public void mindControl() {
        System.out.println("[Sith]: Controle mental ativado");

    }

    @Override
    public void farseeing() {
        System.out.println("[Sith]: Visão amplificada");

    }

    @Override
    public void telepath() {
        System.out.println("[Sith]: Telepatia ativada");

    }

    @Override
    public void levitation() {
        System.out.println("[Sith]: Levitação ativada");

    }

    public void levitation(String smt) {
        smt = "Something";
        System.out.println("Levitating " + smt);
    }

    public void lightning() {

    }

}
