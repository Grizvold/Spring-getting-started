# Spring Boot and REST services

__First read:__
   * SIA 4th edition chapter 21.
   * <https://spring.io/blog/2013/08/06/spring-boot-simplifying-spring-for-everyone>
   * <https://spring.io/projects/spring-boot>
   
__First DI hands-on examples:__
   * First Spring Boot application: <https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-first-application>
   * Build and run the gs-rest-service demo from <https://spring.io/guides/gs/rest-service/>
   * Build and run the gs-spring-boot demo from <https://spring.io/guides/gs/spring-boot/>
   
__Keywords:__
   * <groupId> org.springframework.boot</groupId>
   * <artifactId> spring-boot-starter-parent</artifactId>
   * Starter POM
   * starting-boot-starter-parent
   * spring-boot-starter-web
   * autoconfiguration
   * Uber JAR
   * SpringApplication.run
   * convention-over-configuraiton
   * POJO
   * @SpringBootApplication
   * @Configuration
   * @EnableAutoConfiguration
   * @EnableWebMVC
   * @ComponentScan
   * @Controller
   * @RestController
   * @ResponseBody
   * @RequestMapping
   * @RequestParam
   * @PathVariable
   * @RequestBody
   * @ResponseBody
   * @ResponseEntity
   * @ResponseStatus
   * getBeanDefinitionNames
   * web.xml
   * spring-boot-starter-actuator
   * Actuators
   * Tomcat
   * Jetty
   * Java servlets
   * DispacherServlet
   * HanlderHapping 
   * WebAplicattionContext
   * ContextLoaderListener
   * MVC Filter
   * MVC Interceptor
   * CLI
   * Spring Initializer
   * @ControllerAdvice
   * @Value
   * @ExceptionHandler
   * application.properties, application.yml

__Questions:__
   1. What are some key faetures that Spring Boot gives?
   1. How does Srping Boot enable fast development?   
   1. Explain Spring Boot autoconfiguration means?
   1. Explain Spring Boot autoconfiguration in relation to Jackson?
   1. How do you run a Spring Boot application?
   1. A Single @SprintBootApplication annotation enables three features. Which?
   1. Provide three examples for Spring based Annotation and what they do?
   1. Describe REST in relation to HTTP methods and URL's.
   1. What is CRUD in relation to REST?
   1. Exemplify how a new User would be added to the system over REST?
   1. What is RESTful end points are added by the Actuator?
   1. Describe a difference between MVC architecture and a RESTful architecture.
   1. What is the difference between @Controller and @RestController?
   1. What is the difference between @RequestParam and @PathVariable?
   1. How to set a @RequestParam mandatory or not, how do you set a default value?
   1. Compare @ResponseBody, @ResponseEntity, @ResponseStatus. When to use each?
   1. What are the basic steps in the request processing workflow of the DispatcherServlet?
   1. What in Spring MVC handles HTTP requests?
   1. How are HTTP mapped to POJO methods?
   1. How does the Dispatcher Servlet delegate hte requests to your controller?
   1. Explain Spring Boot autoconfiguration in relation to Tomcat and dispatcherServlet?
   1. How do you handle exceptions thrown by a controller method?
   1. What is the difference between @ControllerAdvice and @ExceptionHandler?
   1. Spring Boot lets you externalize your configuration so that you can work with the same applicaiton code in different environments. In which ways can you inject a property? How its autowired? If a configuraiton property is specified in multiple location - in which precedence?
   1. On which threads are the controller methods called?
   1. Is it the same thread for all REST endpoints?
   1. What are Spring MVC HTTP message converters?
   1. Explain message converts in relation to MappingJacksonHttpMessageConverter.
   1. How does Jackson serialize POJOs to JSON?
   
__Exercises:__
   1. Build and run the gs-rest-service and gs-spring-boot demos.
   1. Review which beans are provided by Spring Boot
   1. Add Actuators to gs-spring-boot demo
  

