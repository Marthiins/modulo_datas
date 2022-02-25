import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class modulo_datas {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();/* Pega a data atual */

		/* Simular que a data vem do banco de dados */

		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("25-02-2022"));/* Definindo uma data qualquer */

		calendar.add(Calendar.DAY_OF_MONTH, 20);/* data de hoje mais 20 dias */

		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.MONTH, 1);

		System.out.println("Somando o mês : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.YEAR, 1);

		System.out.println("Somando 1 ano : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
