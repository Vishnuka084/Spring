
import bean.SpringBeanOne;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
/*        // Run Something just before jvm shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shout down");
                ctx.close();
            }
        }));*/

        ctx.registerShutdownHook();

        ctx.register(AppConfig.class);
        ctx.refresh();

/*        SpringBeanOne beanOne = ctx.getBean(SpringBeanOne.class); // class type -->
        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
        System.out.println(beanOne);
        System.out.println(beanTwo);


        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
        System.out.println(beanThree);*/


        //Bean Name request (Bean ID)
        //SpringBeanOne -> springBeanOne (Bean ID)
        SpringBeanOne springBeanOne = (SpringBeanOne) ctx.getBean("springBeanOne");
        System.out.println(springBeanOne);


        //SpringBeanTwo -> springBeanTwo
        SpringBeanTwo springBeanTwo = (SpringBeanTwo) ctx.getBean("springBeanTwo");
        System.out.println(springBeanTwo);


    }
}
