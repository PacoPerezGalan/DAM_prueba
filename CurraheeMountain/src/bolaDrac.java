
public class bolaDrac {
		public static void main(String[] args) {
		
		String frase="SDFRCHVCXQCFDFKRQGR";
		String abecedario=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char afrase[];
		char aabecedario[];
		afrase=frase.toCharArray();
		aabecedario=abecedario.toCharArray();
		String decodificada="";
		int desplazamiento=3;
		
        for(int i=0;i<frase.length();i++){
			for(int j=0;j<abecedario.length();j++){
				if(aabecedario[j]==frase.charAt(i)){
						decodificada+=aabecedario[j-3];
					}
					
				}
			}
        System.out.println(decodificada);
		}
		 
		
		
}
