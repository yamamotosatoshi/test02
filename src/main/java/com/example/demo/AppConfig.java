package com.example.demo;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.*;


@Configuration
@EnableSwagger2  // Springfox���g�p�\�ɂ��邽�߂̃A�m�e�[�V����
 public class AppConfig {

    @Bean
    public Docket document() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().paths(paths()).build().apiInfo(apiInfo());
    }


    private Predicate<String> paths() {
        return or(containsPattern("/api*"));  //API�̃G���g���|�C���g�𐳋K�\���Ŏw��
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Sample API", "",
                "terms of service", "", "", "", "");
        return apiInfo;
    }
}
