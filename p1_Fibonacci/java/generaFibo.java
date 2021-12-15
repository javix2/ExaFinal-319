package clases;


public class generaFibo {
	
	private int numero;

	public generaFibo() {
		// TODO Auto-generated constructor stub
	}
	
	public generaFibo(int numero){
		this.numero=numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public String genera() {
		int a=0,b=1,f=0;
		String cad = "";
		for (int i = 0; i < getNumero(); i++) {
			f=a+b;
			b=a;
			a=f;
			cad+=f+",";
		}
		return cad;
	}

}
