/**
 * ServiceTest
 */
import static org.junit.Assert.*;
import org.junit.*;

public class ServiceTest {
  @Test
  public void test(){
    Service service = new Service();
    assertEquals("hello", service.says());
  }
  
}