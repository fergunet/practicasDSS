public class Hola extends Saludo{

	public static String saludo = "hola";

	public static String saluda(){
		return "Te digo"+saludo;
	}

	public static void setSaludo(String nuevo){
		saludo = nuevo;
	}
}
