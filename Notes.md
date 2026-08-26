# Create Quarkus Project

```shell scrpit
mvn "io.quarkus.platform:quarkus-maven-plugin:3.2.10.Final:create" \
    -DprojectArtifactId="agencia-viagem-ai" \
    -Dextensions="quarkus-rest, quarkus-langchain4j-ollama"
```
## Additional extensions

```shell script
mvn quarkus:add-extension -Dextensions="quarkus-langchain4j-mcp"
```

```shell script
mvn quarkus:add-extension -Dextensions="quarkus-langchain4j-pgvector"
```

## Commands

``` shell script
curl -X POST -H "Content-Type: text/plain" -H "X-User-Name: Jane Smith" -d "Por favour, cancele minha reserve 67890." http://localhost:8080/travel
```

