package exercicioBanco;

import java.util.List;

public class banco {

  private String nome;
  private List<conta>conta;

  public String getNome(){
      return nome;
  }
public void setNome(String nome){
      this.nome =nome;
}
public List<conta>getConta(){
      return conta;
}
public void setConta(List<conta>conta){
      this.conta = conta;
}
}