import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationTest{

	@Test
	public void testCanCalculateMultiplicationWithoutTheSign(){
	Multiplication multi = new Multiplication();
	int number =5;
	int number1 = 4;
	int totalNumber = multi.multiplicationWork(number, number1);
	assertEquals(20, totalNumber);
	}

}