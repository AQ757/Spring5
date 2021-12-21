import com.aitqiao.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("users.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());
    }
}
