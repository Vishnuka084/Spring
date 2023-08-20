
import bean.SpringBeanOne;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBeanOne beanOne = ctx.getBean(SpringBeanOne.class);
        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
        System.out.println(beanOne);
        System.out.println(beanTwo);


        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
        System.out.println(beanThree);

        ctx.close();



    }
}
