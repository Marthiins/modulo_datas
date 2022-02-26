import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava5 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.parse("2019-10-05");/* LocalDate.parse � para pasar ano m�s e dia yyyy-MM-dd */

		LocalDate dataNova = LocalDate.parse("2021-11-10");

		System.out.println(
				"Data antiga � maior que data nova: " + dataAntiga.isAfter(dataNova));/* compara��o entre as datas */

		System.out.println("Data antiga � anterior que data nova: " + dataAntiga.isBefore(dataNova));

		System.out.println("Datas s�o iguais : " + dataAntiga.equals(dataNova));

		System.out.println("----------------------Periodo-----------------");
	
	Period periodo = Period.between(dataAntiga, dataNova);
	
	System.out.println("Quantos dias : " + periodo.getDays());
	
	System.out.println("Quantos meses : " + periodo.getMonths());
	
	System.out.println("Quantos anos : " + periodo.getYears());
	
	System.out.println("Periodo � : " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias.");
	}

}
