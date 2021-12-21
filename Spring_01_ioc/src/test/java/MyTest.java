import com.atqiao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        获取ApplicationContext，拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserService) context.getBean("UserService");
        userService.getUser();
    }
}
