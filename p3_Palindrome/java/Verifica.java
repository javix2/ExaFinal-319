package clases;

public class Verifica {
	
	private String cadena;

	public Verifica() {
		// TODO Auto-generated constructor stub
	}
	public Verifica(String cadena){
		this.cadena= cadena;
		
	}
	
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	public String verificar() {
		String res,rev = "";
        for (int i = getCadena().length()-1; i >= 0; i--)
        {
            String car = getCadena().substring(i,i+1);
            rev = rev + car;
        }
        if (rev.equals(getCadena())) { res = "es palindrome"; }
        else {res = "no es palindrome"; }
        
        return res;
	}

}
