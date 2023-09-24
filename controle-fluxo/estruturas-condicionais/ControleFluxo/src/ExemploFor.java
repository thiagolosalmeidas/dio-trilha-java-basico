// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
/*//Estrutura 1
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
		System.out.println("Joãozinho dormiu");
		
*///Estrutura 2
//o que importa é somente o bloco condicional
		int carneirinhos = 1;
		for( ; carneirinhos <=10; ) {
     	System.out.println("Carneirinho(s)" + carneirinhos);
     	carneirinhos ++;
	}

	}
}