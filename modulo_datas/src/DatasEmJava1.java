
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava1 {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("25/02/2022");/*Data inicial*/

		Calendar calendar = Calendar.getInstance();/*Instaciar um objeto calendario*/
		calendar.setTime(dataInicial);/*Passo a data inicial*/

		for (int parcela = 1; parcela <= 12; parcela++) {/*Boleto de vinanciamento de 12 parcelas*/
			calendar.add(Calendar.MONTH, 1); /* A partir vou adicionar 1 mês */
		
		System.out.println("Parcela de numero: " + parcela + " Vencimento é em : "
		+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
