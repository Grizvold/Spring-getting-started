# Employee microservice

## Employee microservice requirements:

	* __Employees:__
		- [ ] create new project from Spring Initializer <https://start.spring.io>
		- [ ] the microservice should provide a REST/JSON API for CRUD operations on
			information of employees in an organization.
		- [ ] the employee details should include: name, country, city, id and sallary 
			in USD.
		- [ ] the information is stored in Java collection e.g. Map.
		- [ ] the Map should be configured as a Bean.
		- [ ] the max number of emplyees allowed, must not be hard coded and should be
			injected as an externalized configuration param: autowired using @Value.
	* __Salaries:__
		- [ ] the provided USD should be converted to the local currency using a 3rd
			party convertion service.
		- [ ] use Jackson for parsing 3rd party service JSON payload.
	* __Currency conversion service__
		- [ ] See basic API example usage: <https://free.currencyconverterapi.com>
		- [ ] <https://free.currconv.com/api/v7/convert?q=USD_ILS&compact=ultra&apiKey=b5c63df7a95099b06654> 

## Working with RestTemplate:
	* <https://www.baeldung.com/rest-template> 
	* <https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html> 
	* <https://stackoverflow.com/questions/9381665/how-can-we-configure-the-internal-jackson-mapper-when-using-resttemplate> 
	* <https://www.baeldung.com/spring-rest-template-list> 
	
## Tweats to the microservice:
	After you have your microservice up and running, start adding the below list of enhancements and modification:
	
	* __Logging__
	* __Replace and System.out prints to Spring logging__
	* __Actuators:__
		* Add actuators
		* use postman to check health and which beans were injected
	* __application.properties__
		* review common properties list: 
			<https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html>
		* change the server port
		* inject some property that is used in the code with @Value
		* inject the property once from application.properties, once from command line
			which took precedence?
		* migrate the application.properties to applitaion.yml
	* Add command line runner to the initialization of the Spring Boot application
	* __Controller:__
		* add an Aspect to the REST controller methods
		* add a Filter or Interceptor. See:
			<https://stackoverflow.com/questions/35856454/difference-between-interceptor-and-filter-in-spring-mvc>
		* The added Aspect, Filter and Interceptor should add a log indicating they are invoked and 
			additional availabale information on the operation
		* add an exeption handler (use @ExeptionHandler)
	* __Profiles:__
		* Add 2 profiles according to which, a certain type of bean is created. For
			example, a "production" and "development" profiles according to which the
			transient Java collection will be a different subtype of Map.
