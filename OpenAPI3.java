# If you want to use the newer OpenAPI 3 specification instead of the older Swagger 2 specification, you can use the following dependencies instead:

// <dependency>
//     <groupId>io.springfox</groupId>
//     <artifactId>springfox-boot-starter</artifactId>
//     <version>3.0.0</version>
// </dependency>

// - This dependency includes both the OpenAPI 3 specification support and the Swagger UI.

@Configuration
@EnableOpenApi
public class OpenApiConfig {
    @Bean
    public GroupedOpenApi customOpenApi() {
        String[] paths = { "/api/**" };
        return GroupedOpenApi.builder()
                .group("custom-api")
                .pathsToMatch(paths)
                .build();
    }
    
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Custom API")
                        .description("This is a custom API.")
                        .version("1.0.0"));
    }
}


// - @EnableOpenApi annotation to enable OpenAPI support in the Spring Boot application. 
// - We define a customOpenAPI bean to specify the metadata for our API (title, description, and version), and a customOpenApi bean to group and filter the API 
//   endpoints.
