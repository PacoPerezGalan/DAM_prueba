package examenED;

public class PR03 {
	public static void main(String[] args) {
		//declaramos las variables
		String mensajeCodificado="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		String mensaje;
		String temporal="";
		//cambiamos las letras a minusculas y las almacenamos en mensaje
		mensaje=mensajeCodificado.toLowerCase();
		//recorremos los caracteres con un for de dos en dos
		for(int i=0;i<=mensaje.length();i+=2){
			//si el caracter esta en la ultima posicion, temporal incrementa en este caracter
			if(i+1==mensaje.length()){			
				temporal=temporal+mensaje.charAt(i);
				//si no, temporal incrementa en este caracter mas el siguiente
			}else{
				temporal=temporal+mensaje.charAt(i+1)+mensaje.charAt(i);
			}
		}
		//igualamos mensaje a temporal y lo mostramos
		mensaje=temporal;
		System.out.println(mensaje);
	}
}
