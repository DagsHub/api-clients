# Download current stable 3.x.x branch (OpenAPI version 3)
if [ ! -f swagger-codegen-cli.jar ]; then wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.35/swagger-codegen-cli-3.0.35.jar -O swagger-codegen-cli.jar; fi

spec_url=https://dagshub.com/DAGsHub-Official/dagshub-docs/raw/openapi-spec-and-swagger-ui/theme/openapi/spec.yaml
git_user="DagsHub"
git_repo="api-clients"
package_name=dagshub-api
config_file=config.json

# language name, understandable by swagger-codegen
languages=(python r java csharp go javascript swift5 scala kotlin-client typescript-axios)

# output folder name, must be in the same order as the language list above 👆
output_names=(Python R Java C# Go JavaScript Swift Scala Kotlin TypeScript)

for i in "${!languages[@]}"; do
	rm -rf ${output_names[i]}
	java -jar swagger-codegen-cli.jar generate \
	-i $spec_url \
	-l ${languages[i]} \
	--git-user-id $git_user \
	--git-repo-id $git_repo \
	-DpackageName=$package_name \
	-c $config_file \
	-o ${output_names[i]}
done
