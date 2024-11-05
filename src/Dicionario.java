import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;


public Dicionario() {
    this.dicionario = new HashMap<>();
}

public void adicionarPalavra(String palavra, String descricao) {
    dicionario.put(palavra, descricao);
}

public void removerPalavra(String palavra){
    if (!dicionario.isEmpty()) {
        dicionario.remove(palavra);
    }
    else {
        System.out.println("O dicionário está vazio");
    }
}

public String pesquisarPorPalavra(String palavra) {
    String definicao = dicionario.get(palavra);
    if (definicao != null) {
        return definicao;
    }
    else {
        return "Palavra não encontrada";
    }
}

public void exibirPalavras() {
    if (!dicionario.isEmpty()) {
        System.out.println(dicionario);
    }
    else {
        System.out.println("O dicionário está vazio");
    }
}

public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    //adicionando palavras
    dicionario.adicionarPalavra("Harmonia ", "A combinação agradável de elementos que cria uma sensação de equilíbrio e ordem.");
    dicionario.adicionarPalavra("Caleidoscópio", "Um tubo que contém espelhos e pedaços de vidro colorido que, ao serem girados, criam padrões coloridos e variados.");
    dicionario.adicionarPalavra("Efêmero", "Algo que dura por um período muito curto; passageiro.");
    dicionario.adicionarPalavra("Alegoria", "Uma representação simbólica que transmite uma ideia ou conceito mais profundo através de personagens ou eventos.");
    dicionario.adicionarPalavra("Labirinto", "Um complexo sistema de caminhos, muitas vezes confuso, que pode ser difícil de navegar.");
    dicionario.adicionarPalavra("Ímpeto", "Uma força ou impulso repentino e intenso que motiva uma ação.");

    //exibindo todas as palavras
    dicionario.exibirPalavras();

    //pesquisando palavras
    String definicaoHarmonia = dicionario.pesquisarPorPalavra("Harmonia");
    System.out.println("Difinição da palavra: Harmonia -  " + definicaoHarmonia);

    String definicaoLabirinto = dicionario.pesquisarPorPalavra("Labirinto");
    System.out.println("Definição da palavra: Labirinto - " + definicaoLabirinto);

    //removendo palavra
    dicionario.removerPalavra("Ímpeto");
    dicionario.exibirPalavras();
}

}