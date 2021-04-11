import com.example.Microkernel.api.Printer;

public class SecondPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("--External Jar: Printer 2 --" );
	}
}