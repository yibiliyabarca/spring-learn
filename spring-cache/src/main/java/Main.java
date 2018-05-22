import com.chen.spring.learn.bean.Account;
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
        System.out.println(accountService.getAccountByName("chen").getName());//查询DB
        System.out.println(accountService.getAccountByName("chen").getName());//查询缓存
        accountService.updateAccount("chen",new Account("tao"));//更新db，清除缓存
        System.out.println(accountService.getAccountByName("chen").getName());//查询db，重置缓存
        accountService.getAccountAndSetCahe("chen",new Account("Taotao"));//修改db 重置缓存
        System.out.println(accountService.getAccountByName("chen").getName());//查询缓存
    }

}
