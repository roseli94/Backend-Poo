public class Pessoa {
    //atributos 
    private String nome;
    private Integer idade;
    
    //Getters e Setters 
    public void setNome(String nome){
       /*Aqui pode ter validações e outros */
        this.nome = nome;
    }
        public String getNome(){
            return this.nome;
        }

        public Integer getIdade(){
            return this.idade;
        }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
}
/**
 * METODOS ACESSADOS:
 * PUBLIC: Indicar que qualquer um pode acessar a elementos.
 * PRIVATE:Indicar que somente a classe consegue acessar.
 * PROTECTED:Indicar que somente a  classe e seus filhos conseguem acessar 
 * DEFAULT:Indicar que somente a classe, seus filhos e as classes no mesmo package, podem acessar
 */

 /*
  * getters e setters
  */