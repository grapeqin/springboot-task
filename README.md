# Getting Started

### Reference Documentation

#### spring async task execute

- Step1. application.properties 配置spring.task.execution相关的属性
- Step2. SpringbootTaskApplication 增加@EnableAsync 注解
- Step3. 编写SimpleTaskService 并增加@Async 注解
- Step4. 编写SpringbootTaskApplicationTests 单元测试并运行

#### custom error handler 

- Step1. 实现AsyncConfigurer接口，重写getAsyncUncaughtExceptionHandler方法

#### spring schedule task

- Step1. SpringbootTaskApplication 增加@EnableScheduling 开启定时任务支持
- Step2. SimpleTaskService中编写定时任务并用@Scheduled修饰