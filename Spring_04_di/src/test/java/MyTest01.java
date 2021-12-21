import com.aitqiao.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}

//    Student{name='麦蔻',
//    address=Address{address='重庆'},
//    books=[百科全书, 百科, 全书],
//    hobby=[健身, 吃饭, 睡觉],
//    card={身份证=090090909090, 银行卡=66666334343346},
//    games=[LOL, BOB, COC],
//    wife='null',
//    info={password=root, 学号=2018120161, username=QiaoWenQiang}}

