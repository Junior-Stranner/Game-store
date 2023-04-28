package FilaeOilha;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
			Fila fila = new Fila();

			menu(fila);
		}

		private static void menu(Fila fila) {
			int op;
			do {
				op = lerMenu();
				switch(op) {

				case 1: fila.adiciona(10);
				fila.adiciona(20);
				fila.adiciona(30);
				fila.adiciona(40);

				break;
				case 2: fila.excluir(0);
				break;
				case 3: fila.mostrarDados();
				break;
				case 4: System.out.println("Sistema Finalizado");
				}
			}while(op!=4);
		}
		private static int lerMenu() {
			Scanner consoleInt = new Scanner(System.in);

			int op;
			do {
				System.out.println("MENU"
						+ "\n 1 - Adicionar valor"
						+ "\n 2 - Excluir valor"
						+ "\n 3 - Mostrar dados"
						+ "\n 9 - Finalizar sistema");
				op = consoleInt.nextInt();

				if(op<1 || op>4) {
					System.out.println("Op��o Inv�lida");
				}

			}while(op<1 || op>9);
			return(op);
		}
}