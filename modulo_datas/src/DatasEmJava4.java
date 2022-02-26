import java.time.Duration;
import java.time.Instant;

public class DatasEmJava4 {

	public static void main(String[] args) throws InterruptedException {
		
	Instant inicio = Instant.now();
	
	Thread.sleep(2000);/*Pode ser um tempo qualquer que n�o conhecemos*/
	
	Instant ifinal = Instant.now();
	
	Duration duracao = Duration.between(inicio, ifinal); /*Dura��o entre o inicio e o final*/
	
	System.out.println(" Dura��o em namo segundos: " + duracao.toNanos());
	
	System.out.println(" Dura��o em minutos: " + duracao.toMinutes());
	
	System.out.println(" Dura��o em horas: " + duracao.toHours());
	
	System.out.println(" Dura��o em milisegundos: " + duracao.toMillis());
	
	System.out.println(" Dura��o em dias: " + duracao.toDays());
	}

}
