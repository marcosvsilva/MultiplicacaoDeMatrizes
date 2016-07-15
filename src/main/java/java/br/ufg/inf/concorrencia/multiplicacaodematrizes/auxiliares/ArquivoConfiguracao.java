package java.br.ufg.inf.concorrencia.multiplicacaodematrizes.auxiliares;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Classe que lê o arquivo de configuração.
 */
public class ArquivoConfiguracao {

    /**
     * Variável que contem as linhas e colunas do arquivo de configuração.
     */
    private static List<Integer> linhasColunas = new ArrayList<Integer>();

    private static double tamanhoMaximoElemento;

    /**
     * Carrega o arquivo de configuração.
     *
     * @throws IOException caso ocorra erro na leitura do arquivo.
     */
    public ArquivoConfiguracao() throws IOException {
        Properties properties = new Properties();

        FileInputStream file = new
                FileInputStream(Strings.enderecoArquivoConfiguracao);

        properties.load(file);

        List<Integer> linhasColunas = new ArrayList<Integer>();
        linhasColunas.add(Integer.parseInt(properties.getProperty
                (Strings.tagLinhaMatrizA)),Strings.posicaoLinhaA);

        linhasColunas.add(Integer.parseInt(properties.getProperty
                (Strings.tagColunasMatrizA)),Strings.posicaoColunaA);

        linhasColunas.add(Integer.parseInt(properties.getProperty
                (Strings.tagLinhaMatrizB)),Strings.posicaoLinhaB);

        linhasColunas.add(Integer.parseInt(properties.getProperty
                (Strings.tagColunasMatrizB)),Strings.posicaoColunaB);

        String valor = properties.getProperty(Strings.tagTamanhoMaximoElemento);
        valor = valor.replace(",",".");
        tamanhoMaximoElemento = Double.parseDouble(valor);
    }

    /**
     * Número de linhas da matriz A.
     * @return número de linhas.
     */
    public Integer getLinhaMatrizA(){
        return linhasColunas.get(Strings.posicaoLinhaA);
    }

    /**
     * Número de colunas da matriz A.
     * @return número de colunas.
     */
    public Integer getColunaMatrizA(){
        return linhasColunas.get(Strings.posicaoColunaA);
    }

    /**
     * Número de linhas da matriz B.
     * @return número de linhas.
     */
    public Integer getLinhaMatrizB(){
        return linhasColunas.get(Strings.posicaoLinhaB);
    }

    /**
     * Número de colunas da matriz B.
     * @return número de colunas.
     */
    public Integer getColunaMatrizB(){
        return linhasColunas.get(Strings.posicaoColunaB);
    }

    public double getTamanhoMaximoElemento(){
        return tamanhoMaximoElemento;
    }
}