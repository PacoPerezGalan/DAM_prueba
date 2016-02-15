
public class EjemploExamen {
	
public static void main(String[] args) {
	String mensajeCodificado="OZCNOCOE QUO APGUS MA  IOLT EESO ITQUPA";
	String mensaje;
	String temporal="";
	mensaje=mensajeCodificado.toLowerCase();
	for(int i=mensaje.length()-1;i>=0;i--){
		temporal=temporal+mensaje.charAt(i);
	}
	mensaje=temporal;
	temporal="";
	for(int i=0;i<=mensaje.length();i+=2){
		if(i+1==mensaje.length()){			
			temporal=temporal+mensaje.charAt(i);
		}else{
			temporal=temporal+mensaje.charAt(i+1)+mensaje.charAt(i);
		}
	}
	
	mensaje=temporal;
	System.out.println(mensaje);
}
}
