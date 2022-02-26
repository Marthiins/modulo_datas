import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2022-02-25");
		
		/*Simulação de parcela de Boletos*/
		for(int mes = 1; mes <=12; mes ++ ) {
			dataBase = dataBase.plusMonths(1);/*Adicionando um mês ao boleto*/
		
		System.out.println("Data de vencimento do boleto :" + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês :" + mes);
		}
		

	}

}
