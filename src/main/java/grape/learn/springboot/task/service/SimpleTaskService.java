package grape.learn.springboot.task.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author grape
 * @date 2019/4/25
 */
@Service
@Slf4j
public class SimpleTaskService {

	/**
	 * 向人打招呼
	 * @param name
	 */
	@Async
	public void hello(String name){
		log.info("你好:{}",name);
	}

	/**
	 *
	 * @throws RuntimeException
	 */
	@Async
	public void exeExcept(){
		int i = 10;
		i /= 0 ;
		log.info("{}/0 = ",i);
	}

	@Scheduled(fixedRate = 5000)
	public void schedule(){
		log.info("now is :"+ DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
	}
}
