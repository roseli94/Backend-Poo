public class App {
    
    public static void main(String[] args) {
        
        System.out.println("Aprendendo POO em Java");
    
     // Que estou instanciando uma classe, construindo um objeto.
    Pessoa pessoa1 = new Pessoa();

pessoa1.setNome("Fulano");
pessoa1.setIdade (21);

System.out.println(pessoa1.getNome());
System.out.println(pessoa1.getIdade());

    

Carro meuCarro = new Carro();
meuCarro.setModelo("Honda Civic");
meuCarro.setAno(2019);
meuCarro.setCor("Prata");

System.out.println(meuCarro.getModelo());
System.out.println(meuCarro.getAno());
System.out.println(meuCarro.getCor());

Carro novoCarro = new Carro("fiat Toro", 2020,"Branca");

System.out.println(novoCarro.getModelo());
System.out.println(novoCarro.getAno());
System.out.println(novoCarro.getCor());
}

}