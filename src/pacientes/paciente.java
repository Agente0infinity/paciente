package pacientes;
public class paciente {
	String nombre;
	int edad;
	double peso;
	double metros;
	int latidos;
	int PresionSistolica;
	int PresionDiastolica;
	double temperatura;
	
	public paciente(String nombre,int edad,double peso,double metros,int latidos,int PresionSistolica,
			int PresionDiastolica,double temperatura) {
		this.nombre=nombre;
		this.edad=edad;
		this.latidos=latidos;
		this.metros=metros;
		this.peso=peso;
		this.PresionDiastolica=PresionDiastolica;
		this.PresionSistolica=PresionSistolica;
		this.temperatura=temperatura;
	}
	
	public double IMC(){
		
		return this.peso/Math.pow(this.metros,2);
		
	}

	
}
