# microservices2

Copyright © 2016 programarunesh@gmail.com 


Copyright © 2016 Arunesh Kumar Dubey

These are maven application so run mavne command from the application folder 

mvn clean install

Start all the application using following commands :

java -jar #name of the jar file from target folder

Hit url : http://localhost:7213/spotparkingclient/pincode1

you will get json data 

then try stopping any of the application either spotparking or spotparking1 , if any one of then is stopped the also you 
get response from the another one.

API gateway has been added for the micro services, to access the microservices from api gateway, build the api gateway and run it by java jar command 

and access it from 

http://localhost:9002/spotparking/pincode

please email me for any help regarding micro services on my email id : programarunesh@gmail

