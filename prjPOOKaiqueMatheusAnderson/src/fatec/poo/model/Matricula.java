/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Anderson/Kaique/Matheus
 */
public class Matricula {

    private String data;
    private int qtdeFaltas;
    private double nota;
    private Aluno aluno;
    private AVista aVista;
    private APrazo aPrazo;
    private Turma turma;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void addAvista(AVista avista) {
        this.aVista = avista;
        avista.setMatricula(this);
    }

    public void addAprazo(APrazo aprazo) {
        this.aPrazo = aprazo;
        aprazo.setMatricula(this);
    }
}
