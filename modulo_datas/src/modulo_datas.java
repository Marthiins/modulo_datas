import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class modulo_datas {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		/*------------------Simple Date Format*/

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");// Desde jeito para gravar no banco de dados
		System.out.println("Data formato para banco de dados: " + simpleDateFormat.format(date));																	// dados

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");// Para teste
		System.out.println("Data atual padrão é string: " + simpleDateFormat2.format(date));

		 simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println("Objeto data: " + simpleDateFormat.parse("25/02/2022"));
	}

}
