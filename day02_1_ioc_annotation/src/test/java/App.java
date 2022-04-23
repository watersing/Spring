import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App  class
 *
 * @author lst
 * @version 1.0
 * @date 2022/4/23 0:21
 */

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();

        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();

        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        bookDao.save();

    }
}
