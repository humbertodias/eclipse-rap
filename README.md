# Eclipse RAP

Aplicação Web com RAP (Remote Application Platform).


## Prérequisitos

1. Maven 3+
2. Java 8+

## Como rodar

1. Clone

```
git clone https://github.com/humbertodias/eclipse-rap.git
```

2. Entre na pasta

```
cd eclipse-rap
```

3. Execute 

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
5. Por fim, acesse pelo navegador

[http://localhost:9999/demo](http://localhost:9999/demo)

# Saída

![](doc/output.png)


## Referências

[RAP Remote Application Platform](http://www.eclipse.org/rap/)