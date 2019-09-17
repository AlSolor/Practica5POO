public class Cono {
	private double g; //Generatriz
	private double r; //Radio
	private double h; //Altura
	static final double pi = 3.1416;
	//Constructores
	public Cono() {
		g = 0;
		r = 0;
		h = 0;
	}
	public Cono(double r, double h) {
		this.r = r;
		this.h = h;
		g = Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
	}
	//Setters
	public void setR(double r) {
		this.r = r;
	}
	public void setH(double h) {
		this.h = h;
	}
	//Getters
	public double getG(){
		return g;
	}
	public double getR() {
		return r;
	}
	public double getH() {
		return h;
	}
	//Calcular generatriz
	public void calcGen() {
		g = Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
	}
	//Calcular superficie
	public double area() {
		return ((pi * r) * (r + g));
	} 
	//Calcular volumen
	public double volumen() {
		return ((pi * (Math.pow(r,2)) * h) / 3);
	}
}