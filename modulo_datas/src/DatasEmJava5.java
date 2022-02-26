import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava5 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.parse("2019-10-05");/* LocalDate.parse é para pasar ano mês e dia yyyy-MM-dd */

		LocalDate dataNova = LocalDate.parse("2021-11-10");

		System.out.println(
				"Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));/* comparação entre as datas */

		System.out.println("Data antiga é anterior que data nova: " + dataAntiga.isBefore(dataNova));

		System.out.println("Datas são iguais : " + dataAntiga.equals(dataNova));

		System.out.println("----------------------Periodo-----------------");
	
	Period periodo = Period.between(dataAntiga, dataNova);
	
	System.out.println("Quantos dias : " + periodo.getDays());
	
	System.out.println("Quantos meses : " + periodo.getMonths());
	
	System.out.println("Quantos anos : " + periodo.getYears());
	
	System.out.println("Periodo é : " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias.");
	}

}
