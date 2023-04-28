
import java.util.Scanner;
public class Aposentadoria {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade =0 ;
		int tempTrab = 0;
		int funcA = 0 ;
		int funcSA =0; 
		int i = 0;

	//	lerAposentadoria(idade,tempTrab ,funcA, funcSA);
	//verAposentadoria();
	//	aposentadoria(funcA, funcSA);
	
	//}

//	private static void lerAposentadoria( int idade ,int tempTrab, int funcA,int funcSA) {

		

		for(  i = 0; i <3 ; i++) {

			System.out.println(" Idade do Funcionario");
			idade = Integer.parseInt(in.nextLine());
			System.out.println(" Tempo Trabalhado");
			tempTrab  = Integer.parseInt(in.nextLine());
		
	
	//private static void verAposentadoria( int idade ,int tempTrab, int funcA,int funcSA) {

		//for(int i = 0; i <3 ; i++) {

			if((idade >= 65 && tempTrab >= 30) || (idade >= 60 && tempTrab >= 25)) 
				funcA++;
			else 
				funcSA++;
		}
//}
//	private static void aposentadoria(int funcA , int funcSA) {
		// TODO Auto-generated method stub
	

	
	System.out.println("Funcionarios Requer a Aposentadoria : "+funcA);
	System.out.println("Funcionarios sem o Direito a Aposentadoria : "+funcSA);
	}
}


