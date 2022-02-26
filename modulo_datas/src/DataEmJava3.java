import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava3 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("A data atual formatada é : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("Dia da semana : " + localDate.getDayOfWeek().name());
	
		System.out.println("Dia do Mês : " + localDate.getDayOfMonth());
		System.out.println("Nos estamos no Mês de : " + localDate.getMonth());
	
		System.out.println("Dia da Ano : " + localDate.getDayOfYear());
	
		System.out.println("Nos estamos no ano de : " + localDate.getYear());
	}

}
