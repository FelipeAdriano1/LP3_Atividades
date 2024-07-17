package classeLivro;

public class Main {
	public static void main(String[] args) {
	
		estudante estudante1 = new estudante("Felipe", 19, 7);
		
		System.out.println("Estudante foi aprovado ? " + estudante1.isApproved(8));
	}

}
