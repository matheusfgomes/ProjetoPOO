package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Anderson/Kaique/Matheus
 */
public class Instrutor extends Pessoa {

    private String formacao;
    private String areaAtuacao;
    private ArrayList<Turma> turmas;

    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
        turmas = new ArrayList<>();
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void addTurma(Turma t) {
        turmas.add(t);
        t.setInstrutor(this);
    }

}
