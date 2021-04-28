# Spring Boot With Swagger 3.0.0
#### Add Maven Dependency:-
```
<properties>        
    <springfox-swagger2.version>3.0.0</springfox-swagger2.version>
</properties>
 	
<!-- For Swagger2 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>${springfox-swagger2.version}</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>${springfox-swagger2.version}</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>${springfox-swagger2.version}</version>
</dependency>
```
#### Create a configuration class :-
```
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@Slf4j
public class SwaggerConfig {

 @Bean
 public Docket api() {
     log.info("Inside SwaggerConfig");
     return new Docket(DocumentationType.SWAGGER_2).
             select().
             paths(PathSelectors.any()).
             apis(RequestHandlerSelectors.basePackage("<Package Deatils>")).
             build().
             apiInfo(apiInfo());
 }


 private ApiInfo apiInfo() {

     return new ApiInfoBuilder().
             title("<Application Title>").
             description("<Application Description>").
             version("<Application Version>").
             termsOfServiceUrl("<Term of service>").
             contact(new Contact("<Support Team Name>",
                     "<Contacts Urls>",
                     "<Support Team Mailis>")).
             license("<Licence of Api>").build();
 }
}
```
Now there is *no extra configuration* to *activate swagger* on the spring-boot project like the previous. if try to configure with security, there is some configuration. plz refer to this article.

In swagger version 3 remove the ```@EnableSwagger2``` annotation base config also.

And most of the user tries to find HTML swagger document file using ```{host}/swagger-ui.html``` or ```{host}/swagger-ui``` those are now removed.

**use** ```{host}/swagger-ui/``` to see the HTML document

This is a sample project link on GitHub Refer to [documentation](https://swagger.io/docs/open-source-tools/swagger-ui/usage/configuration/) io.springfox
