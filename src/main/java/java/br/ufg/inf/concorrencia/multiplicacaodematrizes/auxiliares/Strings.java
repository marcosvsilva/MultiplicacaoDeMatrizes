package java.br.ufg.inf.concorrencia.multiplicacaodematrizes.auxiliares;

/**
 * Contêm os conteúdos fixos da aplicação.
 */
public class Strings {

    /**
     * Endereço do arquivo de configuração.
     *
     * <p>Este arquivo de configuração contêm o número de linhas e colunas
     * das matrizes a serem multiplicadas.
     */
    public static final String enderecoArquivoConfiguracao =
            "./Configuracao/config.properties";

    /**
     * Tag da quantidade de linhas da matriz A dentro da lista.
     */
    public static final String tagLinhaMatrizA = "NumeroDeLinhasMatrizA";

    /**
     * Tag da quantidade de colunas da matriz A dentro da lista.
     */
    public static final String tagColunasMatrizA = "NumeroDeColunasMatrizA";

    /**
     * Tag da quantidade de linhas da matriz B dentro da lista.
     */
    public static final String tagLinhaMatrizB = "NumeroDeLinhasMatrizB";

    /**
     * Tag da quantidade de colunas da matriz B dentro da lista.
     */
    public static final String tagColunasMatrizB = "NumeroDeColunasMatrizB";

    /**
     * Tag do tamanho máximo dos elementos das matrizes.
     */
    public static final String tagTamanhoMaximoElemento =
            "TamanhoMaximoElementosMatriz";

    /**
     * Posicao linha matriz A dentro da Lista que contêm linhas e colunas.
     */
    public static final int posicaoLinhaA = 0;

    /**
     * Posicao coluna matriz A dentro da Lista que contêm linhas e colunas.
     */
    public static final int posicaoColunaA = 1;

    /**
     * Posicao linha matriz B dentro da Lista que contêm linhas e colunas.
     */
    public static final int posicaoLinhaB = 2;

    /**
     * Posicao coluna matriz B dentro da Lista que contêm linhas e colunas.
     */
    public static final int posicaoColunaB = 3;
}
