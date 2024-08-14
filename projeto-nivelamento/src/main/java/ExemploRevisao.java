public class ExemploRevisao {
    public static void main(String[] args) {
        //Tipos mais utilizados
        //Classes sempre começam com caixa alta ex String, Integer, Double, NomeRevisao etc

        //Tipos Wrapper = são classes
        //possuem métodos que ajudam
        // As classes não possuem valor inicial, como uma váriavel, valor de wrapper = null
        String nome = "Bob da Silva";
        Integer idade = 22;
        Double altura = 1.55;
        Boolean bloqueado = false;

        //Somente println
        System.out.println(
                "Meu nome é " + nome + ", minha altura é " + altura + "\n e minha idade é " + idade
        );

        //Println usando interpolação
        System.out.println(
                "Meu nome é %s, minha altura é %.2f e minha idade é %d".formatted(nome, altura, idade)
        );

        //Println usando interpolação e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));

        String nomePet;
        nomePet = "Teste";

        //Não usaremos!!
        //Tipo primitivo, não são classes, não possuem métodos
        //Tipo primitivo sempre tem valor inicial
        boolean bloqueado2 = false;
        int numero = 42;

    }
}
