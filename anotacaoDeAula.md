**ANOTAÇÕS PARA LINHA DE COMANDO NO TERMINAL**


Adicionando dependências via mvn quarkus:add-extension -Dextensions="...",  a partir do prompt de comando...
OBS.: Para adicionar o nome correto basta consultar  uma URL como segue abaixo:
https://code.quarkus.io/?g=edu.eduardocarvalho&a=estudo-unipds-com-quarkus&extension-search=health


**rest-client**
mvn quarkus:add-extension -Dextensions="quarkus-rest-client"

**fault-tolerance**
mvn quarkus:add-extension -Dextensions="quarkus-smallrye-fault-tolerance"

**healthCheck**
mvn quarkus:add-extension -Dextensions="quarkus-smallrye-health"

**PANACHE**
 mvn quarkus:add-extension -Dextensions="quarkus-hibernate-orm-panache"   
 
**H2(Um banco de dados em Memória) 
mvn quarkus:add-extension -Dextensions="quarkus-jdbc-h2"