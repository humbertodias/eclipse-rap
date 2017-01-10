# Java EE con RAP

Aplicación Java Web usando RAP (Remote Application Platform).


## Prerequisitos

1. Maven 3+
2. Java 8+

## Como correr

1. Clon

	```
	git clone https://github.com/humbertodias/java-eclipse-rap-demo.git
	```

2. Entrar en la carpeta

	```
	cd java-eclipse-rap-demo
	```

3. Correr 

	```
	mvn jetty:run -Djetty.http.port=9999
	```
	
	```
	[INFO] Started ServerConnector@715b886f{HTTP/1.1,[http/1.1]}{0.0.0.0:9999}
	[INFO] Started @25039ms
	[INFO] Started Jetty Server
	[INFO] Using Non-Native Java sun.nio.fs.PollingWatchService
	[WARNING] Quiet Time is too low for non-native WatchService [sun.nio.fs.PollingWatchService]: 1000 < 5000 ms (defaulting to 5000 ms)
	```
	
4. Por último, en su navegador

[http://localhost:9999/demo](http://localhost:9999/demo)

# Salida

![](doc/output.png)


## Referencias

[RAP Remote Application Platform](http://www.eclipse.org/rap/)
