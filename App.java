
/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class App {
  public void executar(){
       // Cria um array de convidados
        String[] convidados = {"João", "Maria", "Pedro", "Ana"};

        // Cria um objeto da classe Reuniao
        Reuniao reuniao = new Reuniao("Planejamento do Projeto", 15, 14, "Carlos");
        
        reuniao.definirLocal("Sala de Reuniões");

        // Adiciona os convidados à reunião
        for (String convidado : convidados) {
            reuniao.adicionarConvidado(convidado);
        }

        // Exibe o texto do cartaz da reunião
        System.out.println(reuniao.textoCartaz());
    }
}
  

