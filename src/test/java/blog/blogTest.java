package blog;

import com.jinjie.bean.Post;
import com.jinjie.service.PostService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class blogTest {

    public static PostService postService;

    @BeforeClass
    public static void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:blogAppContext.xml");
        postService = (PostService) context.getBean("postService");
    }

    @Test
    public void test(){
        List<Post> posts = postService.postList();
        printlnFundList(posts);
        System.out.println(posts.size());
    }


    public void printlnFundList(List<Post> funds) {
        for (int i = 0; i < funds.size(); i++) {
            System.out.println(funds.get(i));
        }
    }
}
