/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Anderson/Kaique/Matheus
 */
public class Turma {

    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdVagas;
    private String observacoes;
    private Instrutor instrutor;
    private ArrayList<Matricula> matriculas;
    private Curso curso;

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
        matriculas = new ArrayList<>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public void setSiglaTurma(String siglaTurma) {
        this.siglaTurma = siglaTurma;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void addMatricla(Matricula m) {
        matriculas.add(m);
        m.setTurma(this);
    }

}
