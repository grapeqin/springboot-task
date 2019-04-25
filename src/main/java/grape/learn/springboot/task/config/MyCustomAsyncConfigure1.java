package grape.learn.springboot.task.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

/**
 * 自定义一个异常处理Handler
 * @author grape
 * @date 2019/4/25
 */
@Configuration
@Slf4j
public class MyCustomAsyncConfigure1 implements AsyncConfigurer {

	@Override
	@Bean
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return (ex, method, params) -> {
			if(ex instanceof ArithmeticException){
				log.warn("方法:{} throw a exception.",method.getName());
			}
		};
	}
}
