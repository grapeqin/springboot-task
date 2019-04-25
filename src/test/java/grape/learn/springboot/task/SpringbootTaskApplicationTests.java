package grape.learn.springboot.task;

import grape.learn.springboot.task.service.SimpleTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTaskApplicationTests {

	@Autowired
	private SimpleTaskService simpleTaskService;

	@Test
	public void contextLoads() throws InterruptedException {
		simpleTaskService.hello("小明");
		simpleTaskService.exeExcept();
		simpleTaskService.hello("小刘");

		Thread.currentThread().join(30000);
	}

}
