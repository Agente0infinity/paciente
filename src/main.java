import pacientes.paciente;
public class main {

	public static void main(String[] args) {
		paciente pablo=new paciente("pablo",27,73.5,1.77,99,105,76,38.5);
	    System.out.print(pablo.IMC());
	}
	
}
