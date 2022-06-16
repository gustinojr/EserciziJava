public class Persona {
   private String nome;
   private String cognome;
   public String sesso;
   public Integer eta;

   public Persona() {
   }

   public String getCognome() {
      return cognome;
   }

   public void setCognome(String cognome) {
      this.cognome = cognome;
   }

   //setter
   public void setNome(String nuovoNome){
      this.nome=nuovoNome;
   }


   //getter
   public String getNome(){
      return this.nome;
   }

public String nomeCompleto(){
      return nome +" " + cognome;
}



}