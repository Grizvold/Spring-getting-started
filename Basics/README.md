# Spring basics - DI, AOP, IoC

* __General knowledge:__
   * <https://en.wikipedia.org/wiki/Spring_Framework>
   * <http://springtutorials.com/spring-framework-vs-rest-of-the-world/>
   
* __DI and Spring Beans, in a nutshel:__
   * <https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring>
   * <https://www.vogella.com/tutorials/SpringDependencyInjection/article.html>
   
* __First DI hands-on examples:__
   * <https://www.tutorialspoint.com/spring/>
   
* __Deeper reading and coding into Spring Core(IoC, DI, AOP):__
   * <https://www.dropbox.com/s/sq8phrogaeisvwe/Spring%20in%20Action%20-%204th%20Edition.2014.11.pdf>
   
* __Spring official documentation:__
   * <https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/>
   * <https://docs.spring.io/spring/docs/current/spring-framework-reference/overview.html#spring-introduction>
   
* __Keywords:__
   * Web Application Framework
   * Dependency injection
   * IoC
   * Spring Beans
   * Spring container
   * Bean lifecycle
   * Spring configuration
   * Spring Annotation Based configuration
   * Spring Java based configuration
   * Spring XML based configuration
   * component scanning
   * auto-wiring
   * AOP
   * @Autowired
   * @Bean
   * @Configuration
   * @Required
   * @Component
   * @ComponentScan
   * @Import
   * @ImportResource
   * @Profile
   * @ActiveProfiles
   * @Conditional
   * @Primary
   * @Qualifier
   * @Scope
   * @PropertySource
   * @ContextConfiguration
   * @Primary
   * @Qualifier
   * @Order
   * @Aspect
   * @Pointcut
   * @Around
   * @Before/@After
   
* __Questions:__
   1. What is DI?
   1. What is relationship between inversion of control and dependency injection?
   1. What are the three styles of dependency injection?
   1. What are the different types of DI supported in Spring?
   1. Where should you use AOP?
   1. What is Aspect/Pointcut/JointPoint and AdviceArguments?
   1. What is benefit of using IoC framework?
   1. What is the role of the Spring IoC container?
   1. Name some of the importand String framework modules.
   1. What are the two distinct types of containers in Spring? What is the difference?
   1. What is Spring Bean?
   1. Describe the bean lifecycle in Spring.
   1. How do you create beans using XML/Java?
   1. What is component scanning? Is it enabled by default?
   1. Give cons and pros for ctor based vs setter based?
   1. How do you specify a method to be called before the destruction of the object?
   1. What is Spring Autowiring?
   1. How you can avoid autowiring ambiguity?
   1. How do you enable component scanning?
   1. What are different scopes for Spring beans?
   1. Does Spring beann provide thread safety?
   1. What are the kinds of a situation supported by Spring AOP?
   1. How can you generate a situation in which noSuchBeanDefinition?
   1. What is the difference between Spring AOP and AspectJ AOP?
   1. What is the difference between @Component & @Service?
   1. Name some of the design patterns used in Spring Framework.
   
* __Extra Questions:__
   1. How ApplicationContext and XmlBeanFactory compare in terms of lazy/eager instantiation of Spring beans?
   1. When should you use ApplicationContext and when XmlBeanFactory?
   1. In which order are the beans instantiated?
   1. On which thread is the beans instantiation taking place?
   1. Compare the beans instantiation, wiring and initialization steps - are they similar in both
   		ApplicationContext and XmlBeanFactory.
   1. What is the shared super interface of ApplicaionContext and XmlBeanFactory?
   1. To which interfaces belong getBean() and getBeansOfType()?
   1. Are beans beans instantiated in every call to getBean()?
   1. When you call getBean(), what is the actual runtime class of the returned bean instance?
   1. Describe a scenario where NoUniqueBeanDefinitionException is thrown as result of calling ApplicaitonContext.Bean()?
   1. Typically, we don't want to use the getBean() method directly in our program - why?
   		So what would we use if we want to use a bean?
   1. How is spring concept of Singleton Bean different from the Singleton design pattern as in the 
   		Gang of Four (GoF) patterns book?
   1. When calling getBean() multiple times from both ApplicationContext and then from XmlBeansFactory.
   		Are all 6 object same instances?
   1. What will be the difference in number of beans instances if you change the Knight bean scope from
   		singleton to prototype?
   1. When should you use singleton beans, when should you use prototype beans? 

 
