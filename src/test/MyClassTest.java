import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyClassTest{
	@Test
	public void devuelveMensajeTest(){
		MyClass myclass = new MyClass();
		String s = myclass.devuelveMensaje();
		assertEquals("Hello World!", s);
	}
}