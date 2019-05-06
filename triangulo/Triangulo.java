package triangulo;

public class Triangulo {
	private long ladoA;
	private long ladoB;
	private long ladoC;
	
	public Triangulo(long a, long b, long c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	public boolean esTriangulo() {
		if(	this.ladoA + this.ladoB <= this.ladoC || 
			this.ladoC + this.ladoB <= this.ladoA || 
			this.ladoA + this.ladoC <= this.ladoB) {
			return false;
		}
		
		return true;
	}
	
	public String getTipoTriangulo() {		
		if(this.ladoA == this.ladoB && this.ladoA == this.ladoC)
			return "Equilatero";
		
		if((this.ladoA == this.ladoB && this.ladoA != this.ladoC)||
		   (this.ladoA == this.ladoC && this.ladoA != this.ladoB)||
		   (this.ladoB == this.ladoC && this.ladoB != this.ladoA))
			return "Isoceles";
		
		return "Escaleno";
	}
}
