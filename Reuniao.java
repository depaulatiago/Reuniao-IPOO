import java.util.ArrayList;

public class Reuniao {
  private String assunto;
  private int dia;
  private int hora;
  private String local;
  private String organizador;
  private ArrayList<String> convidados;

  public Reuniao(String assunto, int dia, int hora, String organizador) {
    this.assunto = assunto;
    this.dia = dia;
    this.hora = hora;
    this.organizador = organizador;
    convidados = new ArrayList<>();
  }

  public void definirLocal(String local) {
    this.local = local;
  }

  public void adicionarConvidado(String convidado) {
    convidados.add(convidado);
  }

  public int nroParticipantes() {
    // organizador mais os convidados
    return convidados.size() + 1;
  }
  
  public String textoCartaz(){
      String listaConvidado = " ";
      
      for (String convidado : convidados)
      {
          listaConvidado += convidado + " ";
      }

        
      return ("Reunião: " + assunto  + "Dia " + dia + " as " + hora + " no " + local  
      + "Organizador : " + organizador + " - Convidados: " + listaConvidado  +
      nroParticipantes() + " participantes");
  }
}
