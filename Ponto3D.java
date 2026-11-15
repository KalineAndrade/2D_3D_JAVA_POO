
public class Ponto3D extends Ponto2D{
	private double z;

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	//@Override
	public String toString() {
		return  "Ponto3D [z=" + z + "]" + super.toString();
	}
	public Ponto3D(double x, double y, double z) {
		super(x,y);
		this.z = z;
	}
	public void imprimir() {
		System.out.println(this);
	}
	
}
