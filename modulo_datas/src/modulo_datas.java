import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class modulo_datas {

	public static void main(String[] args) throws ParseException {


	long dias =  ChronoUnit.DAYS.between(LocalDate.parse("2022-02-24"), LocalDate.now());/*Total de dias de uma data ate hoje*/
	
	System.out.println("Possui " + dias + " entre a faixa da data");
	
	
	long dias2 =  ChronoUnit.WEEKS.between(LocalDate.parse("2021-02-24"), LocalDate.now());/*Total de dias de uma data ate hoje*/
	System.out.println("Possui " + dias2 + "  semanas entre a faixa da data");
	}
}
