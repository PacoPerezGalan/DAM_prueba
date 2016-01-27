
public class pokemon {
	
	public static void main(String[] args) {
		String frase="Paco@es@un c1ch4nd4";
		String decodificada="";
		String subfrase1=frase.substring(0,frase.length()/2);
		String subfrase2=frase.substring(frase.length()/2,frase.length());
		
		for(int i=0;i<subfrase1.length();i++){
			if(subfrase1.charAt(i)=='@'){
				decodificada+=' ';
			}else{
				decodificada+=subfrase1.charAt(i);
			}
		}
		for(int i=0;i<subfrase2.length();i++){
			if(subfrase2.charAt(i)=='1'){
				decodificada+='a';
			}else if(subfrase2.charAt(i)=='2'){
				decodificada+='e';
			}else if(subfrase2.charAt(i)=='3'){
				decodificada+='i';
			}else if(subfrase2.charAt(i)=='4'){
				decodificada+='o';
			}else if(subfrase2.charAt(i)=='5'){
				decodificada+='u';
			}else{
				decodificada+=subfrase2.charAt(i);
		    }
		}
		System.out.println(decodificada);
		}
			
}
