# Employee microservice

## Employee microservice requirements:

	* Employees:
		-[ ] create new project from Spring Initializer https://start.spring.io/
		-[ ] the microservice should provide a REST/JSON API for CRUD operations on
			information of employees in an organization.
		-[ ] the employee details should include: name, country, city, id and sallary 
			in USD.
		-[ ] the information is stored in Java collection e.g. Map.
		-[ ] the Map should be configured as a Bean.
		-[ ] the max number of emplyees allowed, must not be hard coded and should be
			injected as an externalized configuration param: autowired using @Value.
	* Salaries:
		-[ ] the provided USD should be converted to the local currency using a 3rd
			party convertion service.
		-[ ] use Jackson for parsing 3rd party service JSON payload.
	* Currency conversion service:
		-[ ] See basic API example usage: https://free.currencyconverterapi.com/
		-[ ] https://free.currconv.com/api/v7/convert?q=USD_ILS&compact=ultra&apiKey=b5c63df7a95099b06654
