package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// 설정하지 않고 default 는 @ComponentScan 가 있는 하위 패키지
@ComponentScan(
        // 탐색할 패키지 지정하여 하위 패키지를 Bean 에 등록
//        basePackages = "hello.core",
        //AppConfig class 를 제외하기 위해서 설정(나중에 공부를 위해 남겨 놓음)
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
