import java.util.ArrayList;

import model.enums.TipoBloco;
import model.Bloco;
import model.DiarioOficial;
import model.Orgao;
import model.Publicacao;
import model.enums.Esfera;
import model.enums.Poder;

public class MyProgram {

        public static void main(String[] args) {
                Orgao orgaoPrefeitura = new Orgao(1, "PREFEITURA MUNICIPAL DE NITERÓI", Poder.Legislativo);

                ArrayList<Publicacao> publicaçõesDo1 = new ArrayList<Publicacao>();

                ArrayList<Bloco> blocosPublicacaoUm = MyProgram.getBlocosPublicaçãoUm();
                ArrayList<Bloco> blocosPublicacaoDois = MyProgram.getBlocosPublicaçãoDois();

                Publicacao publicação1 = new Publicacao("LEI Nº 3824 DE 31 DE OUTUBRO DE 2023", null, null,
                                orgaoPrefeitura,
                                blocosPublicacaoUm);
                Publicacao publicação2 = new Publicacao("LEI Nº 3825 DE 31 DE OUTUBRO DE 2023", null, null,
                                orgaoPrefeitura,
                                blocosPublicacaoDois);

                publicaçõesDo1.add(publicação1);
                publicaçõesDo1.add(publicação2);

                DiarioOficial doNiteroi = new DiarioOficial("30 de outubro de 2023", 1, "Diário Oficial",
                                Esfera.Municipal,
                                publicaçõesDo1);

                doNiteroi.imprimirDiario();

        }

        public static ArrayList<Bloco> getBlocosPublicaçãoUm() {
                ArrayList<Bloco> blocos = new ArrayList<Bloco>();

                Bloco bloco1 = new Bloco(
                                "Declara o Grêmio Recreativo Escola de Samba Souza Soares como Patrimônio Cultural Imaterial do Município de Niterói.",
                                TipoBloco.Texto, 1);
                blocos.add(bloco1);

                Bloco bloco2 = new Bloco("A CÂMARA MUNICIPAL DE NITERÓI DECRETA E EU SANCIONO A SEGUINTE LEI:",
                                TipoBloco.Texto,
                                2);
                blocos.add(bloco2);

                Bloco bloco3 = new Bloco(
                                "Art. 1º- Fica reconhecido e declarado como patrimônio cultural imaterial do Município de Niterói o Grêmio Recreativo Escola de Samba Souza Soares.",
                                TipoBloco.Texto, 3);
                blocos.add(bloco3);

                Bloco bloco4 = new Bloco("Art. 2º. Esta Lei entra em vigor na data da sua publicação.", TipoBloco.Texto,
                                4);
                blocos.add(bloco4);

                Bloco bloco5 = new Bloco("PREFEITURA MUNICIPAL DE NITERÓI, EM 31 DE OUTUBRO DE 2023.", TipoBloco.Texto,
                                5);
                blocos.add(bloco5);

                Bloco bloco6 = new Bloco("AXEL GRAEL- PREFEITO", TipoBloco.Texto, 6);
                blocos.add(bloco6);

                Bloco bloco7 = new Bloco("PROJETO DE LEI Nº. 099/2022- AUTOR: CARLOS OTÁVIO DIAS VAZ – CASOTA",
                                TipoBloco.Texto,
                                7);
                blocos.add(bloco7);

                Bloco bloco8 = new Bloco("COAUTORES: ANDERSON PIPICO, BENNY BRIOLLY E LEONRDO GIORDANO",
                                TipoBloco.Texto, 8);
                blocos.add(bloco8);

                return blocos;
        }

        public static ArrayList<Bloco> getBlocosPublicaçãoDois() {
                ArrayList<Bloco> blocos = new ArrayList<Bloco>();

                Bloco bloco1Publi2 = new Bloco(
                                "Dispõe sobre o Polo Gastronômico no Bairro Barreto e dá outras providências.",
                                TipoBloco.Texto, 1);
                blocos.add(bloco1Publi2);

                Bloco bloco2Publi2 = new Bloco("A CÂMARA MUNICIPAL DE NITERÓI DECRETA E EU SANCIONO A SEGUINTE LEI:",
                                TipoBloco.Texto, 2);
                blocos.add(bloco2Publi2);

                Bloco bloco3Publi2 = new Bloco(
                                "Art. 1º- Altera o inciso VII do Parágrafo único do Art. 110 da Lei 2624 de 29 de Dezembro de 2008 - Código de Posturas do Município de Niterói, que passa a ter a seguinte redação:",
                                TipoBloco.Texto, 3);
                blocos.add(bloco3Publi2);

                Bloco bloco4Publi2 = new Bloco("“Art. 110. .....................", TipoBloco.Texto, 4);
                blocos.add(bloco4Publi2);

                Bloco bloco5Publi2 = new Bloco(
                                "Parágrafo único. Ficam definidos na forma do caput deste artigo os seguintes logradouros abaixo, podendo o Poder Executivo criar, por Decreto, novos locais de interesse turístico, cultural ou gastronômico:",
                                TipoBloco.Texto, 5);
                blocos.add(bloco5Publi2);

                Bloco bloco6Publi2 = new Bloco("(...)", TipoBloco.Texto, 6);
                blocos.add(bloco6Publi2);

                Bloco bloco7Publi2 = new Bloco(
                                "VII – a Rua Dr. Luiz Palmier, no trecho entre o nº 344 ao 446, a Rua Galvão próximo ao n° 135, Rua Guimarães Junior próximo ao n° 15 e o entorno da Praça Dr. Flávio Palmier da Veiga no Barreto.",
                                TipoBloco.Texto, 7);
                blocos.add(bloco7Publi2);

                Bloco bloco8Publi2 = new Bloco(
                                "Art. 2º Esta Lei poderá ser regulamentada para garantir sua fiel execução.",
                                TipoBloco.Texto, 8);
                blocos.add(bloco8Publi2);

                Bloco bloco9Publi2 = new Bloco("Art. 3º. Esta Lei entra em vigor na data de sua publicação.",
                                TipoBloco.Texto,
                                9);
                blocos.add(bloco9Publi2);

                Bloco bloco10Publi2 = new Bloco("PREFEITURA MUNICIPAL DE NITERÓI, EM 31 DE OUTUBRO DE 2023.",
                                TipoBloco.Texto,
                                10);
                blocos.add(bloco10Publi2);

                Bloco bloco11Publi2 = new Bloco("AXEL GRAEL- PREFEITO ", TipoBloco.Texto, 11);
                blocos.add(bloco11Publi2);

                return blocos;
        }

}
