import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava2 {

	public static void main(String[] args) {

		/* Nova API de data apartir do Java 8 */

		LocalDate dataAtual = LocalDate.now();

		System.out.println("Data atual : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));/* Data atual */

		LocalTime horaAtual = LocalTime.now();/* Hora atual */
		System.out.println("A hora atual é : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		LocalDateTime dataAtualHoraAtual = LocalDateTime.now(); /* Hora e data junto */
		System.out.println("A data e hora atual é: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

		
	}

}
