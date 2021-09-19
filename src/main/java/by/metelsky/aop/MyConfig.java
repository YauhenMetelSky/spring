package by.metelsky.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("by.metelsky.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
