# R API client for dagshub_api

This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project. By using the [OpenAPI/Swagger spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 1.0.2
- Package version: 1.0.3
- Build package: io.swagger.codegen.v3.generators.r.RClientCodegen

## Installation
You'll need the `devtools` package in order to build the API.
Make sure you have a proper CRAN repository from which you can download packages.

### Prerequisites
Install the `devtools` package with the following command.
```R
if(!require(devtools)) { install.packages("devtools") }
```

### Installation of the API package
Make sure you set the working directory to where the API code is located.
Then execute
```R
library(devtools)
install(".")
```

## Author


