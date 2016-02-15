package examenED;

public class PR02 {
  public static void main(String[] args) {
	  //declaramos las variables
	String mensaje="Paquito es el tio mas guapo que conozco";
	String mensajeCodificado="";
	String temporal="";
	//cambiamos las letras a mayusculas y las almacenamos en mensajeCodificado
	mensajeCodificado=mensaje.toUpperCase();
	//recorremos los caracteres con un for de dos en dos
	for(int i=0;i<mensajeCodificado.length();i+=2){
		//si el caracter esta en la ultima posicion temporal incrementa en este caracter
		if(i+1==mensaje.length()){			
			temporal=temporal+mensajeCodificado.charAt(i);
			//si no, temporal incrementa en este caracter mas el siguiente 
		}else{
			temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
		}
	}
	//igualamos mensajeCodificado a temporal y lo mostramos
	mensajeCodificado=temporal;
	System.out.println(mensajeCodificado);
  }
}


