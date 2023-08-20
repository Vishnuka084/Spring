import bean.BeanTwo;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        BeanTwo bean = ctx.getBean(BeanTwo.class);
        System.out.println(bean);


        ctx.close();

    }
}
