package clases;

public class factorial {
	
	private int numero; 

	public factorial() {
		// TODO Auto-generated constructor stub
	}
	public factorial(int numero) {
		this.numero=numero;
	}
	public int getNumero() {
		return numero;
	}
	public int factn() {
		int resultado = 1;
        for (int i = 1; i <= getNumero(); i++) {
            resultado *= i;
        }
        return resultado;
	}

}
