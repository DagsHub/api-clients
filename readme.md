# DagsHub API clients
In this repository there are **auto-generated** native clients for using the [DagsHub API](https://dagshub.com/docs/api) in variouse code languages.
These clients are generated using [swagger-codegen](https://github.com/swagger-api/swagger-codegen), from the [DagsHub OpenAPI description](https://github.com/DagsHub/openapi-description).
Every langauge has an explenation of how to use its client library in its `README.md`. 

To use the **Python** API client, you can run:
```sh
wget https://raw.githubusercontent.com/DagsHub/api-clients/main/Python/setup.py -O - | python3 - install
```
## The clients were NOT tested, use at your own risk, and please [open an issue](https://github.com/DagsHub/api-clients/issues) if you encounter any problems.

---
## Generating API clients
### Prerequisites
**Unix:**
```sh
# Download current stable 3.x.x branch (OpenAPI version 3)
wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.35/swagger-codegen-cli-3.0.35.jar -O swagger-codegen-cli.jar

java -jar swagger-codegen-cli.jar --help
```
**Windows:**
For Windows users, you will need to install [wget](http://gnuwin32.sourceforge.net/packages/wget.htm) or you can use Invoke-WebRequest in PowerShell (3.0+), e.g. `Invoke-WebRequest -OutFile swagger-codegen-cli.jar https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.28/swagger-codegen-cli-2.4.28.jar`

**Mac:**
On a mac, it's even easier with `brew`:
```sh
brew install swagger-codegen
```

### Regenerate the code
Run the following snippet from this directory:
```sh
swagger-codegen generate \
-i https://raw.githubusercontent.com/DagsHub/openapi-description/main/spec.yaml \
-l python \
-o python-client
```
The snippet above generates the **Python** client with the the **Mac**(brew) installation. 
If you installed using the jar file, replace `swagger-codegen` with `java -jar swagger-codegen-cli.jar`

To generate other clients, replace `python` with your langaugh of choice.

- **API clients**: 
**ActionScript**, **Ada**, **Apex**, **Bash**, **C#** (.net 2.0, 3.5 or later), **C++** (cpprest, Qt5, Tizen), **Clojure**, **Dart**, **Elixir**, **Elm**, **Eiffel**, **Erlang**, **Go**, **Groovy**, **Haskell** (http-client, Servant), **Java** (Jersey1.x, Jersey2.x, OkHttp, Retrofit1.x, Retrofit2.x, Feign, RestTemplate, RESTEasy, Vertx, Google API Client Library for Java, Rest-assured), **Kotlin**, **Lua**, **Node.js** (ES5, ES6, AngularJS with Google Closure Compiler annotations) **Objective-C**, **Perl**, **PHP**, **PowerShell**, **Python**, **R**, **Ruby**, **Rust** (rust, rust-server), **Scala** (akka, http4s, swagger-async-httpclient), **Swift** (2.x, 3.x, 4.x, 5.x), **Typescript** (Angular1.x, Angular2.x, Fetch, jQuery, Node)
- **Server stubs**: 
**Ada**, **C#** (ASP.NET Core, NancyFx), **C++** (Pistache, Restbed), **Erlang**, **Go**, **Haskell** (Servant), **Java** (MSF4J, Spring, Undertow, JAX-RS: CDI, CXF, Inflector, RestEasy, Play Framework, [PKMST](https://github.com/ProKarma-Inc/pkmst-getting-started-examples)), **Kotlin**, **PHP** (Lumen, Slim, Silex, [Symfony](https://symfony.com/), [Zend Expressive](https://github.com/zendframework/zend-expressive)), **Python** (Flask), **NodeJS**, **Ruby** (Sinatra, Rails5), **Rust** (rust-server), **Scala** ([Finch](https://github.com/finagle/finch), [Lagom](https://github.com/lagom/lagom), Scalatra)
- **API documentation generators**: **HTML**, **Confluence Wiki**
- **Configuration files**: [**Apache2**](https://httpd.apache.org/)
- **Others**: **JMeter**
