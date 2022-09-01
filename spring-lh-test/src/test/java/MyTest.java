import com.lh.config.MyClassPathApplicationContext;
import com.lh.config.MyConfig;
import com.lh.pojo.Person;
import com.lh.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:22/8/11 8:54
 *
 * @author LH
 */
public class MyTest {
  @Test
  public void user() {
    ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    User user = context.getBean("getUser", User.class);
    System.out.println(user.getName());
  }

  @Test
  public void person() {
    ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    Person person = context.getBean("Person", Person.class);
    person.show();
    System.out.println(person.toString());
  }

  @Test
  public void myContext() {
    ApplicationContext context = new MyClassPathApplicationContext("ApplicationContext.xml");
    System.out.println(context);
  }
}
