import java.util.Date;

public class modulo_datas {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Horas : " + date.getHours());
		
		System.out.println("Horas : " + (date.getYear() + 1900));/*Ano que que ser somado ao 1900*/
		
	}

}
