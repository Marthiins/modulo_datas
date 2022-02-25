import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class modulo_datas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("27/02/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("25/02/2021");
		
		/*After: Se a data 1 for maior que a data 2*/
		/*Before: Se a data 1 for menor que a data 2*/
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) { //after depois da data atual
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - Urgente");
		}

	}
}
