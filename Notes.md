```shell scrpit
mvn "io.quarkus.platform:quarkus-maven-plugin:3.2.10.Final:create" \
    -DprojectArtifactId="agencia-viagem-ai" \
    -Dextensions="quarkus-rest, quarkus-langchain4j-ollama"
```


```shell script
mvn quarkus:add-extension -Dextensions="quarkus-langchain4j-mcp"
```

```shell script
mvn quarkus:add-extension -Dextensions="quarkus-langchain4j-pgvector"
```