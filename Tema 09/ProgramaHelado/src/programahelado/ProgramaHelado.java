package programahelado;

public class ProgramaHelado {
  public static void main (String [] args) {
    Helado miPrimerHelado;
    
    miPrimerHelado = new Helado();
    miPrimerHelado = new Helado ("vainilla", 10);
    miPrimerHelado = new Helado ("fresa", 8,"azucar","singluten","vegano");
    
    //miPrimerHelado.ponerSabor("vainilla");
    System.out.println();
  }
}
