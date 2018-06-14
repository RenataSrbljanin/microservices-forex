This is an example of microservice architecture, built of two microservices 
(forex-microservice and currency-conversion service) talking to each other 
using Eureka Naming Server and Ribbon for Client Side Load Balancing.

CurrencyConversionService(CCS) is converting a bucket of currencies into another currency.
It uses the Forex Service(FS) to get current currency exchange value.
CCS is the Service Consumer.