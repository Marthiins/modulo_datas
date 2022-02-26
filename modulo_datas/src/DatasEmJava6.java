import java.time.LocalDate;

public class DatasEmJava6 {

	public static void main(String[] args) {

		LocalDate dataBase = LocalDate.parse("2019-10-05");

		System.out.println("Data Atual: " + dataBase);

		System.out.println("-------------------------------------------------------------------------------");

		System.out.println("Adicionando e diminuindo valor a data inicial por esse motivo dataBase = ");

		System.out.println("-------------------------------------------------------------------------------");

		System.out.println("Mais mais 5 dias: " + (dataBase = dataBase.plusDays(5)));

		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));

		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));

		System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 anos: "  + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 2 meses: " + (dataBase = dataBase.minusMonths(2)));
	}

}
