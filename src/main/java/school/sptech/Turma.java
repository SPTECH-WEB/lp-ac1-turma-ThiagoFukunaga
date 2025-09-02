package school.sptech;

public class Turma {
    private String nome;
    private Double mensalidade;
    private Integer qtdAluno;
    private Boolean ativa;

    public Turma(String nome, Double mensalidade){
       this.nome = nome;
        this.mensalidade = mensalidade;
        qtdAluno = 0;
        ativa = true;
    }

    public void matricular(Integer qtd){
        if(qtd != null && qtd > 0 && ativa == true){
            qtdAluno += qtd;
        }
    }

    public Integer cancelar(Integer qtd){
        if(qtd != null && qtd > 0 && qtd <= qtdAluno && ativa == true){
            qtdAluno -= qtd;
            return qtd;
        }return null;

    }

    public Integer desativar(){
        if(ativa == true ){
            Integer presentes = qtdAluno;
            ativa = false;
            qtdAluno = 0;
            return presentes;
        }return null;
    }

    public void transferir(Turma destino, Integer qtdATransferir){
        if(qtdATransferir != null && destino != null && qtdATransferir > 0 &&
                this.ativa == true && this.qtdAluno >= qtdATransferir
        && destino.ativa == true){
            this.qtdAluno -= qtdATransferir;
            destino.qtdAluno += qtdATransferir;
        }
    }

    public Boolean reajustarMensalidade(Double reajuste){
        if(reajuste != null && reajuste > 0){
            mensalidade += mensalidade*reajuste;
            return true;
        }return false;
    }

    public String getNome(){
        return nome;
    }

    public Double getMensalidade(){
        return mensalidade;
    }
    public Integer getQtdAluno(){
        return qtdAluno;
    }

    public Boolean getAtiva(){
        return this.ativa;
    }

    public void setNome(String nome){
        this.nome = nome;
    }












}
