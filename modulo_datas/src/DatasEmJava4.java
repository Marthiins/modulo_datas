import java.time.Duration;
import java.time.Instant;

public class DatasEmJava4 {

	public static void main(String[] args) throws InterruptedException {
		
	Instant inicio = Instant.now();
	
	Thread.sleep(2000);/*Pode ser um tempo qualquer que não conhecemos*/
	
	Instant ifinal = Instant.now();
	
	Duration duracao = Duration.between(inicio, ifinal); /*Duração entre o inicio e o final*/
	
	System.out.println(" Duração em namo segundos: " + duracao.toNanos());
	
	System.out.println(" Duração em minutos: " + duracao.toMinutes());
	
	System.out.println(" Duração em horas: " + duracao.toHours());
	
	System.out.println(" Duração em milisegundos: " + duracao.toMillis());
	
	System.out.println(" Duração em dias: " + duracao.toDays());
	}

}
