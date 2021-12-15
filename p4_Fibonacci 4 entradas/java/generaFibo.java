package clases;

public class generaFibo {
	
	private int numero;

	public generaFibo() {
		// TODO Auto-generated constructor stub
	}
	public generaFibo(int numero) {
		this.numero=numero;
	}
	public int getNumero() {
		return numero;
	}
	public String generar() {
		int a=0,b=-1,c=1,d=0,f=0;
		String cad="";
		for (int i = 0; i < getNumero(); i++) {
			f=a+b+c+d;
			a=b;
			b=c;
			c=d;
			d=f;
			cad+= f+",";
		}
		return cad;
	}

}
