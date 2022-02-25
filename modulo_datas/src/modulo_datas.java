import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class modulo_datas {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println(" Data em milisegundos: " + date.getTime());
		System.out.println(" Calendario em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println(" Dia do mês: " + date.getDate());
		System.out.println("Calendario dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("Calendario dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("Calendario Ano: " + calendar.get(Calendar.YEAR));
		

		/*------------------Simple Date Format*/

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");// Desde jeito para gravar no banco de dados
		System.out.println("Data formato para banco de dados: " + simpleDateFormat.format(date));

		System.out.println("Calendario data atual: " + simpleDateFormat.format(calendar.getTime()));
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");// Para teste
		System.out.println("Data atual padrão é string: " + simpleDateFormat2.format(date));

		 simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println("Objeto data: " + simpleDateFormat.parse("25/02/2022"));
	}

}
