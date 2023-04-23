 
// There are several other options that you can configure when using OpenAPI and Swagger in Spring with SpringFox. 
// Some of the most commonly used options include:

// - Customizing the base path of the API endpoints
// - Specifying which HTTP methods to include in the generated documentation
// - Adding global parameters to all endpoints
// - Specifying custom response messages for specific HTTP status codes
// - Securing your API documentation with basic authentication or OAuth2

    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.api"))
            .paths(PathSelectors.ant("/api/**"))
            .build()
            .apiInfo(apiInfo())
            .useDefaultResponseMessages(false)
            .globalResponseMessage(RequestMethod.GET, Arrays.asList(
                new ResponseMessageBuilder()
                    .code(500)
                    .message("Internal server error")
                    .build()))
            .securitySchemes(Arrays.asList(
                new BasicAuth("basicAuth"),
                new OAuth("oauth2")
                    .tokenUrl("https://example.com/oauth/token")
                    .scopes(Arrays.asList(
                        new AuthorizationScope("read", "Read access"),
                        new AuthorizationScope("write", "Write access")))));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Example API")
            .description("This is an example API.")
            .version("1.0.0")
            .build();
  }
 }
