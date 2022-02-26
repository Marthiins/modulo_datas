import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava3 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("A data atual formatada � : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("Dia da semana : " + localDate.getDayOfWeek().name());
	
		System.out.println("Dia do M�s : " + localDate.getDayOfMonth());
		System.out.println("Nos estamos no M�s de : " + localDate.getMonth());
	
		System.out.println("Dia da Ano : " + localDate.getDayOfYear());
	
		System.out.println("Nos estamos no ano de : " + localDate.getYear());
	}

}
