package model.interfaces;

import java.util.ArrayList;

import model.Disciplina;

public interface Conclusao {

    public boolean estaIntegralizado();
    public ArrayList<Disciplina> getDisciplinasFaltantes();

}
