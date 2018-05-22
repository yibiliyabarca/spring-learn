import com.chen.spring.learn.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenxingyu on 2018/5/22.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:/config/application-*.xml");
        System.out.println();
        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        System.out.println(accountService.getAccountByName("hahah"));
        System.out.println(accountService.getAccountByName("hahah"));
    }
}
