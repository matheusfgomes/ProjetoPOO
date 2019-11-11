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
public class Aluno extends Pessoa {

    private String escolaridade;
    private Matricula matricula;

    public Aluno(String cpf, String nome) {
        super(cpf, nome);
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public void addMatricula(Matricula m) {
      this.matricula = m;
      m.setAluno(this);
    }

}
