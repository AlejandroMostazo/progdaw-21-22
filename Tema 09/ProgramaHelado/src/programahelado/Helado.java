package programahelado;

public class Helado {
  private String sabor;
  private int cantidad;
  private boolean azucar;
  private boolean gluten;
  private boolean vegano;
  
  public Helado () {
    this("chocolate",10);
  }
  
  public Helado (String sabor, int cantidad) {
    this.sabor = sabor;
    this.cantidad = cantidad;
    
    this.azucar = true;
    this.gluten = true;
    this.vegano = false;    
  }
  
  public Helado (String sabor, int cantidad, String a, String g, String v) {
    this(sabor,cantidad);    
    if (a.equals("azucar")) {
      this.azucar = true;
    } else {
      this.azucar = false;
    }
    if (g.equals("singluten")) {
      this.gluten = false;
    } else {
      this.gluten = true;    
    }
    if (v.equals("vegano")) {
      this.vegano = true;
    } else {
      this.vegano = false;    
    }
  }
  
  
  
  public void ponerSabor (String saborNuevo) {
    this.sabor = saborNuevo;
  }
  
}
