/*Los miembros con modificador de acceso private en la superclase 
  no son visibles(se ocultan) en la subclase al definir la herencia con la palabra extends */
  
/* Existe un mecanismo llamado m�todo intermediario para poder utilizar los datos no visibles 
   de la superclase en la suclase */
  

/*       No marca error         */ 
class Poligono {    	 
   
  private int ancho , altura;   
 
  void set_atributos (int a, int b) {  
  ancho=a; altura=b;}
  
  int get_altura( ){ 
  	return altura;
  }
  
  int get_ancho( ){
  	return ancho;
  }   
}   
/* ESTE ES UN COMENTARIO AGREGADO POR JULIÁN FUMAROLA PARA QUE PRACTIQUEMOS*/	  
class Rectangulo  extends Poligono {    
 
  	  public int area() { 
  	  return get_ancho() * get_altura() ; /*los m�todos get_ancho() y get_altura()
  	                                        actuan como m�todos intermediarios retornado los valores 
  	                                        ancho y altura para poder calcular el area del rectangulo*/
       }   
}  	  
	class Herencia4 { 
	   public static void main(String  []args ) {   	  
          Rectangulo recta = new Rectangulo();         
          recta.set_atributos (4,5);     	  
          System.out.print("AREA DEL RECTANGULO:  " +  recta.area() );   
	}}  	
