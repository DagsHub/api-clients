# CreateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**kotlin.String**](.md) | name of the repository | 
**description** | [**kotlin.String**](.md) | A short description of the repository |  [optional]
**&#x60;private&#x60;** | [**kotlin.Boolean**](.md) | Either true to create a private repository, or false to create a public one. |  [optional]
**autoInit** | [**kotlin.Boolean**](.md) | Pass true to create an initial commit with README, .gitignore and LICENSE. |  [optional]
**gitignores** | [**kotlin.String**](.md) | Desired language .gitignore templates to apply. Use the name of the templates. |  [optional]
**license** | [**inline**](#LicenseEnum) | Desired LICENSE template to apply. Use the name of the template. |  [optional]
**readme** | [**kotlin.String**](.md) | Desired README template to apply. Use the name of the template. |  [optional]

<a name="LicenseEnum"></a>
## Enum: license
Name | Value
---- | -----
license | Apache License 2.0, MIT License, Abstyles License, Academic Free License v1.1, Academic Free License v1.2, Academic Free License v2.0, Academic Free License v2.1, Academic Free License v3.0, Affero General Public License v1.0, Apache License 1.0, Apache License 1.1, Artistic License 1.0, Artistic License 2.0, BSD 2-clause License, BSD 3-clause License, BSD 4-clause License, Creative Commons CC0 1.0 Universal, Eclipse Public License 1.0, Educational Community License v1.0, Educational Community License v2.0, GNU Affero General Public License v3.0, GNU Free Documentation License v1.1, GNU Free Documentation License v1.2, GNU Free Documentation License v1.3, GNU General Public License v1.0, GNU General Public License v2.0, GNU General Public License v3.0, GNU Lesser General Public License v2.1, GNU Lesser General Public License v3.0, GNU Library General Public License v2.0, ISC license, Mozilla Public License 1.0, Mozilla Public License 1.1, Mozilla Public License 2.03
