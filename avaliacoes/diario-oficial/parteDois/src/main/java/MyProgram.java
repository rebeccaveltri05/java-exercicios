import java.util.ArrayList;

import model.enums.TipoBloco;
import model.enums.TipoLegislacao;
import model.Bloco;
import model.Contrato;
import model.DiarioOficial;
import model.Legislacao;
import model.Orgao;
import model.Publicacao;
import model.enums.Esfera;
import model.enums.Poder;
import repository.DiarioOficialRepository;

public class MyProgram {

    public static void main(String[] args) {
        Orgao orgaoPrefeitura = new Orgao(1, "PREFEITURA MUNICIPAL DE NITERÓI", Poder.Legislativo);
        Orgao orgaoFundacao = new Orgao(2, "FUNDAÇÃO MUNICIPAL DE EDUCAÇÃO", Poder.Legislativo);

        ArrayList<Publicacao> publicaçõesDo1 = new ArrayList<Publicacao>();

        ArrayList<Bloco> blocosPublicacaoUm = MyProgram.getBlocosPublicaçãoUm();
        ArrayList<Bloco> blocosPublicacaoDois = MyProgram.getBlocosPublicaçãoDois();
        ArrayList<Bloco> blocosPublicacaoTres = MyProgram.getBlocosPublicaçãoTrês();
        ArrayList<Bloco> blocosPublicacaoQuatro = MyProgram.getBlocosPublicaçãoQuatro();
        ArrayList<Bloco> blocosPublicacaoCinco = MyProgram.getBlocosPublicaçãoCinco();

        Legislacao legislacao1 = new Legislacao(1, "LEI Nº 3824 DE 31 DE OUTUBRO DE 2023", null, null, orgaoPrefeitura,
                blocosPublicacaoUm, TipoLegislacao.LeisComplementares);
        Legislacao legislacao2 = new Legislacao(1, "LEI Nº 3825 DE 31 DE OUTUBRO DE 2023", null, null, orgaoPrefeitura,
                blocosPublicacaoDois, TipoLegislacao.LeisComplementares);
        Legislacao portaria1 = new Legislacao(1, "FUNDAÇÃO MUNICIPAL DE EDUCAÇÃO", null, null, orgaoPrefeitura,
                blocosPublicacaoTres, TipoLegislacao.Portaria);
        Contrato contrato = new Contrato("EXTRATO DE TERMO DE CONTRATO Nº 266/2023 ", null, null, orgaoFundacao,
                blocosPublicacaoQuatro, null);
        Legislacao portaria2 = new Legislacao(1, "PORTARIA N° 816/FME/2023", null, null, orgaoPrefeitura,
                blocosPublicacaoCinco, TipoLegislacao.Portaria);

        publicaçõesDo1.add(legislacao1);
        publicaçõesDo1.add(legislacao2);
        publicaçõesDo1.add(portaria1);
        publicaçõesDo1.add(contrato);
        publicaçõesDo1.add(portaria2);

        DiarioOficial doNiteroi = new DiarioOficial("30 de outubro de 2023", 1, "Diário Oficial", Esfera.Municipal,
                publicaçõesDo1);

        doNiteroi.imprimirDiario();

        DiarioOficialRepository diarioOficialRepository = new DiarioOficialRepository();
        diarioOficialRepository.salvar(doNiteroi);
    }

    public static ArrayList<Bloco> getBlocosPublicaçãoUm() {
        ArrayList<Bloco> blocos = new ArrayList<Bloco>();

        Bloco bloco1 = new Bloco(
                "Declara o Grêmio Recreativo Escola de Samba Souza Soares como Patrimônio Cultural Imaterial do Município de Niterói.",
                TipoBloco.Texto, 1);
        blocos.add(bloco1);

        Bloco bloco2 = new Bloco("A CÂMARA MUNICIPAL DE NITERÓI DECRETA E EU SANCIONO A SEGUINTE LEI:", TipoBloco.Texto,
                2);
        blocos.add(bloco2);

        Bloco bloco3 = new Bloco(
                "Art. 1º- Fica reconhecido e declarado como patrimônio cultural imaterial do Município de Niterói o Grêmio Recreativo Escola de Samba Souza",
                TipoBloco.Texto, 3);
        blocos.add(bloco3);

        Bloco bloco4 = new Bloco("Soares.", TipoBloco.Texto, 4);
        blocos.add(bloco4);

        Bloco bloco5 = new Bloco("Art. 2º. Esta Lei entra em vigor na data da sua publicação.", TipoBloco.Texto, 5);
        blocos.add(bloco5);

        Bloco bloco6 = new Bloco("PREFEITURA MUNICIPAL DE NITERÓI, EM 31 DE OUTUBRO DE 2023.", TipoBloco.Texto, 6);
        blocos.add(bloco6);

        Bloco bloco7 = new Bloco("AXEL GRAEL- PREFEITO", TipoBloco.Texto, 6);
        blocos.add(bloco7);

        Bloco bloco8 = new Bloco("PROJETO DE LEI Nº. 099/2022- AUTOR: CARLOS OTÁVIO DIAS VAZ – CASOTA", TipoBloco.Texto,
                6);
        blocos.add(bloco8);

        Bloco bloco9 = new Bloco("COAUTORES: ANDERSON PIPICO, BENNY BRIOLLY E LEONRDO GIORDANO", TipoBloco.Texto, 6);
        blocos.add(bloco9);

        return blocos;
    }

    public static ArrayList<Bloco> getBlocosPublicaçãoDois() {
        ArrayList<Bloco> blocos = new ArrayList<Bloco>();

        Bloco bloco1Publi2 = new Bloco("Dispõe sobre o Polo Gastronômico no Bairro Barreto e dá outras providências.",
                TipoBloco.Texto, 1);
        blocos.add(bloco1Publi2);

        Bloco bloco2Publi2 = new Bloco("A CÂMARA MUNICIPAL DE NITERÓI DECRETA E EU SANCIONO A SEGUINTE LEI:",
                TipoBloco.Texto, 2);
        blocos.add(bloco2Publi2);

        Bloco bloco3Publi2 = new Bloco(
                "Art. 1º- Altera o inciso VII do Parágrafo único do Art. 110 da Lei 2624 de 29 de Dezembro de 2008 - Código de Posturas do Município de Niterói,",
                TipoBloco.Texto, 3);
        blocos.add(bloco3Publi2);

        Bloco bloco4Publi2 = new Bloco("que passa a ter a seguinte redação:", TipoBloco.Texto, 4);
        blocos.add(bloco4Publi2);

        Bloco bloco5Publi2 = new Bloco("“Art. 110. .....................", TipoBloco.Texto, 5);
        blocos.add(bloco5Publi2);

        Bloco bloco6Publi2 = new Bloco(
                "Parágrafo único. Ficam definidos na forma do caput deste artigo os seguintes logradouros abaixo, podendo o Poder Executivo criar, por Decreto,",
                TipoBloco.Texto, 6);
        blocos.add(bloco6Publi2);

        Bloco bloco7Publi2 = new Bloco("novos locais de interesse turístico, cultural ou gastronômico:",
                TipoBloco.Texto, 6);
        blocos.add(bloco7Publi2);

        Bloco bloco8Publi2 = new Bloco("(...)", TipoBloco.Texto, 6);
        blocos.add(bloco8Publi2);

        Bloco bloco9Publi2 = new Bloco(
                "VII – a Rua Dr. Luiz Palmier, no trecho entre o nº 344 ao 446, a Rua Galvão              próximo ao n° 135, Rua Guimarães Junior próximo ao",
                TipoBloco.Texto, 6);
        blocos.add(bloco9Publi2);

        Bloco bloco10Publi2 = new Bloco("n° 15 e o entorno da Praça Dr. Flávio Palmier da Veiga no Barreto.",
                TipoBloco.Texto, 6);
        blocos.add(bloco10Publi2);

        Bloco bloco11Publi2 = new Bloco("Art. 2º Esta Lei poderá ser regulamentada para garantir sua fiel execução.",
                TipoBloco.Texto, 6);
        blocos.add(bloco11Publi2);

        Bloco bloco12Publi2 = new Bloco("Art. 3º. Esta Lei entra em vigor na data de sua publicação.", TipoBloco.Texto,
                6);
        blocos.add(bloco12Publi2);

        Bloco bloco13Publi2 = new Bloco("PREFEITURA MUNICIPAL DE NITERÓI, EM 31 DE OUTUBRO DE 2023.", TipoBloco.Texto,
                6);
        blocos.add(bloco13Publi2);

        Bloco bloco14Publi2 = new Bloco("AXEL GRAEL- PREFEITO ", TipoBloco.Texto, 6);
        blocos.add(bloco14Publi2);

        return blocos;
    }

    public static ArrayList<Bloco> getBlocosPublicaçãoTrês() {
        ArrayList<Bloco> blocos = new ArrayList<Bloco>();

        Bloco bloco1Portaria1 = new Bloco(
                "PORTARIA N° 817/FME/2023- Substitui Equipe de Gestão e Fiscalização do Contrato n° 022/2023; OBJETO: Aquisição de materiais de limpeza ",
                TipoBloco.Texto, 1);
        blocos.add(bloco1Portaria1);

        Bloco bloco2Portaria1 = new Bloco(
                "a fim de atender às demandas da Fundação Municipal de Educação, Sede e Anexos, Bibliotecas Populares e Unidades Escolares ",
                TipoBloco.Texto, 2);
        blocos.add(bloco2Portaria1);

        Bloco bloco3Portaria1 = new Bloco(
                "(2ªretirada). GESTOR: Lorena Neves Pestana Ribeiro. Matrícula n° 237.974-5. Cargo: Professora. Lotação: Departamento Administrativo/FME. ",
                TipoBloco.Texto, 3);
        blocos.add(bloco3Portaria1);

        Bloco bloco4Portaria1 = new Bloco(
                "FISCAIS: 1) Andréia Baliano. Matrícula n° 237.841-6. Cargo: Assessora. Lotação: Departamento Administrativo/FME. 2) Isaias Amorim de ",
                TipoBloco.Texto, 4);
        blocos.add(bloco4Portaria1);

        Bloco bloco5Portaria1 = new Bloco(
                "Araújo. Matrícula n° 234.363-0. Cargo: Agente de Administração Educacional. Lotação: Departamento Administrativo/FME. PARTES: FME e DG ",
                TipoBloco.Texto, 5);
        blocos.add(bloco5Portaria1);

        Bloco bloco6Portaria1 = new Bloco(
                "INDÚSTRIA E DISTRIBUIÇÃO LTDA. FUNDAMENTO: Lei n° 8.666/1993, Decreto Municipal n° 11.950/2015. PROCESSOS: 210/4411/2022 e ",
                TipoBloco.Texto, 6);
        blocos.add(bloco6Portaria1);

        Bloco bloco7Portaria1 = new Bloco("210/12849/2022. ", TipoBloco.Texto, 7);
        blocos.add(bloco7Portaria1);
        return blocos;
    }

    public static ArrayList<Bloco> getBlocosPublicaçãoQuatro() {
        ArrayList<Bloco> blocos = new ArrayList<Bloco>();

        Bloco bloco1Contrato = new Bloco("PROCESSO: 9900031874/2023. INSTRUMENTO: Termo de Contrato n° 266/2023. ",
                TipoBloco.Texto, 1);
        blocos.add(bloco1Contrato);

        Bloco bloco2Contrato = new Bloco("PARTES: FUNDAÇÃO MUNICIPAL DE EDUCAÇÃO, como CONTRATANTE, e, do outro ",
                TipoBloco.Texto, 2);
        blocos.add(bloco2Contrato);

        Bloco bloco3Contrato = new Bloco(
                "lado, a L.F. GOMES COMÉRCIO E SERVIÇOS LTDA, inscrita no CNPJ/MF sob o nº 14.204.043/0001-01, como CONTRATADA. OBJETO:",
                TipoBloco.Texto, 3);
        blocos.add(bloco3Contrato);

        Bloco bloco4Contrato = new Bloco(
                "Prestação de serviços de buffet (coffee break e brunch). PRAZO: 07 (sete) meses. VALOR: R$ 169.432,00 (cento e sessenta e nove mil e",
                TipoBloco.Texto, 4);
        blocos.add(bloco4Contrato);

        Bloco bloco5Contrato = new Bloco(
                "quatrocentos e trinta e dois reais). VERBA: Natureza das Despesas: 3.3.3.9.0.39.00.00.00; Programa de Trabalho: 20.43.12.122.0145.4187;",
                TipoBloco.Texto, 5);
        blocos.add(bloco5Contrato);

        Bloco bloco6Contrato = new Bloco(
                "Fonte: 1.704.00; Nota de Empenho: 001666/2023. FUNDAMENTO: Art. 22, III, §3º c/c art. 23, II, a da Lei Federal n° 8.666/1993. DATA DE",
                TipoBloco.Texto, 6);
        blocos.add(bloco6Contrato);

        Bloco bloco7Contrato = new Bloco(
                "Fonte: 1.704.00; Nota de Empenho: 001666/2023. FUNDAMENTO: Art. 22, III, §3º c/c art. 23, II, a da Lei Federal n° 8.666/1993. DATA DE",
                TipoBloco.Texto, 7);
        blocos.add(bloco7Contrato);

        Bloco bloco8Contrato = new Bloco("ASSINATURA: 26/10/2023.", TipoBloco.Texto, 8);
        blocos.add(bloco8Contrato);

        return blocos;
    }

    public static ArrayList<Bloco> getBlocosPublicaçãoCinco() {
        ArrayList<Bloco> blocos = new ArrayList<Bloco>();

        Bloco bloco1Portaria2 = new Bloco(
                "Institui Equipe de Gestão e Fiscalização do Contrato n° 266/2023. OBJETO: Prestação de serviços de buffet (coffee break e brunch). GESTORA: ",
                TipoBloco.Texto, 1);
        blocos.add(bloco1Portaria2);

        Bloco bloco2Portaria2 = new Bloco(
                "Lorena Neves Pestana Ribeiro. Matrícula n° 237.974-5. Cargo: Professora I. Lotação: Departamento Administrativo/FME. FISCAIS: 1) Andréia ",
                TipoBloco.Texto, 2);
        blocos.add(bloco2Portaria2);

        Bloco bloco3Portaria2 = new Bloco(
                "Baliano, Matrícula n° 237.841-6. Cargo: Assessora. Lotação: Departamento Administrativo/FME. 2) Isaias Amorim de Araújo. Matrícula n° 234.363-",
                TipoBloco.Texto, 3);
        blocos.add(bloco3Portaria2);

        Bloco bloco4Portaria2 = new Bloco(
                "0. Cargo: Agente de Administração Educacional. Lotação: Departamento Administrativo/FME. PARTES: FME e L.F. GOMES COMÉRCIO E ",
                TipoBloco.Texto, 3);
        blocos.add(bloco4Portaria2);

        Bloco bloco5Portaria2 = new Bloco(
                "SERVIÇOS LTDA. FUNDAMENTO: Lei n° 8.666/1993, Decreto Municipal n° 11.950/2015. PROCESSO: 9900031874/2023. ",
                TipoBloco.Texto, 3);
        blocos.add(bloco5Portaria2);

        return blocos;
    }
}
