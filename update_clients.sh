# Download current stable 3.x.x branch (OpenAPI version 3)
if [ ! -f swagger-codegen-cli.jar ]; then wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.35/swagger-codegen-cli-3.0.35.jar -O swagger-codegen-cli.jar; fi

rm -rf Python R java C# Go javascript

# Python client
java -jar swagger-codegen-cli.jar generate \
-i https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/main/theme/openapi/spec.yaml \
-l python \
--git-user-id "DagsHub" \
--git-repo-id "api-clients" \
-DpackageName=dagshub-api \
-c config.json \
-o Python

# R client
java -jar swagger-codegen-cli.jar generate \
-i https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/main/theme/openapi/spec.yaml \
-l r \
--git-user-id "DagsHub" \
--git-repo-id "api-clients" \
-DpackageName=dagshub-api \
-c config.json \
-o R

# Java client
java -jar swagger-codegen-cli.jar generate \
-i https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/main/theme/openapi/spec.yaml \
-l java \
--git-user-id "DagsHub" \
--git-repo-id "api-clients" \
-DpackageName=dagshub-api \
-c config.json \
-o java

# C# client
java -jar swagger-codegen-cli.jar generate \
-i https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/main/theme/openapi/spec.yaml \
-l csharp \
--git-user-id "DagsHub" \
--git-repo-id "api-clients" \
-DpackageName=dagshub-api \
-c config.json \
-o C#

# Go client
java -jar swagger-codegen-cli.jar generate \
-i https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/main/theme/openapi/spec.yaml \
-l go \
--git-user-id "DagsHub" \
--git-repo-id "api-clients" \
-DpackageName=dagshub-api \
-c config.json \
-o Go

# JavaScript codegen
java -jar swagger-codegen-cli.jar generate \
-i https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/main/theme/openapi/spec.yaml \
-l javascript \
--git-user-id "DagsHub" \
--git-repo-id "api-clients" \
-DpackageName=dagshub-api \
-c config.json \
-o javascript
