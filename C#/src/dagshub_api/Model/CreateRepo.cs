/* 
 * DagsHub API
 *
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = dagshub_api.Client.SwaggerDateConverter;

namespace dagshub_api.Model
{
    /// <summary>
    /// CreateRepo
    /// </summary>
    [DataContract]
        public partial class CreateRepo :  IEquatable<CreateRepo>, IValidatableObject
    {
        /// <summary>
        /// Desired LICENSE template to apply. Use the name of the template.
        /// </summary>
        /// <value>Desired LICENSE template to apply. Use the name of the template.</value>
        [JsonConverter(typeof(StringEnumConverter))]
                public enum LicenseEnum
        {
            /// <summary>
            /// Enum ApacheLicense20 for value: Apache License 2.0
            /// </summary>
            [EnumMember(Value = "Apache License 2.0")]
            ApacheLicense20 = 1,
            /// <summary>
            /// Enum MITLicense for value: MIT License
            /// </summary>
            [EnumMember(Value = "MIT License")]
            MITLicense = 2,
            /// <summary>
            /// Enum AbstylesLicense for value: Abstyles License
            /// </summary>
            [EnumMember(Value = "Abstyles License")]
            AbstylesLicense = 3,
            /// <summary>
            /// Enum AcademicFreeLicensev11 for value: Academic Free License v1.1
            /// </summary>
            [EnumMember(Value = "Academic Free License v1.1")]
            AcademicFreeLicensev11 = 4,
            /// <summary>
            /// Enum AcademicFreeLicensev12 for value: Academic Free License v1.2
            /// </summary>
            [EnumMember(Value = "Academic Free License v1.2")]
            AcademicFreeLicensev12 = 5,
            /// <summary>
            /// Enum AcademicFreeLicensev20 for value: Academic Free License v2.0
            /// </summary>
            [EnumMember(Value = "Academic Free License v2.0")]
            AcademicFreeLicensev20 = 6,
            /// <summary>
            /// Enum AcademicFreeLicensev21 for value: Academic Free License v2.1
            /// </summary>
            [EnumMember(Value = "Academic Free License v2.1")]
            AcademicFreeLicensev21 = 7,
            /// <summary>
            /// Enum AcademicFreeLicensev30 for value: Academic Free License v3.0
            /// </summary>
            [EnumMember(Value = "Academic Free License v3.0")]
            AcademicFreeLicensev30 = 8,
            /// <summary>
            /// Enum AfferoGeneralPublicLicensev10 for value: Affero General Public License v1.0
            /// </summary>
            [EnumMember(Value = "Affero General Public License v1.0")]
            AfferoGeneralPublicLicensev10 = 9,
            /// <summary>
            /// Enum ApacheLicense10 for value: Apache License 1.0
            /// </summary>
            [EnumMember(Value = "Apache License 1.0")]
            ApacheLicense10 = 10,
            /// <summary>
            /// Enum ApacheLicense11 for value: Apache License 1.1
            /// </summary>
            [EnumMember(Value = "Apache License 1.1")]
            ApacheLicense11 = 11,
            /// <summary>
            /// Enum ArtisticLicense10 for value: Artistic License 1.0
            /// </summary>
            [EnumMember(Value = "Artistic License 1.0")]
            ArtisticLicense10 = 12,
            /// <summary>
            /// Enum ArtisticLicense20 for value: Artistic License 2.0
            /// </summary>
            [EnumMember(Value = "Artistic License 2.0")]
            ArtisticLicense20 = 13,
            /// <summary>
            /// Enum BSD2ClauseLicense for value: BSD 2-clause License
            /// </summary>
            [EnumMember(Value = "BSD 2-clause License")]
            BSD2ClauseLicense = 14,
            /// <summary>
            /// Enum BSD3ClauseLicense for value: BSD 3-clause License
            /// </summary>
            [EnumMember(Value = "BSD 3-clause License")]
            BSD3ClauseLicense = 15,
            /// <summary>
            /// Enum BSD4ClauseLicense for value: BSD 4-clause License
            /// </summary>
            [EnumMember(Value = "BSD 4-clause License")]
            BSD4ClauseLicense = 16,
            /// <summary>
            /// Enum CreativeCommonsCC010Universal for value: Creative Commons CC0 1.0 Universal
            /// </summary>
            [EnumMember(Value = "Creative Commons CC0 1.0 Universal")]
            CreativeCommonsCC010Universal = 17,
            /// <summary>
            /// Enum EclipsePublicLicense10 for value: Eclipse Public License 1.0
            /// </summary>
            [EnumMember(Value = "Eclipse Public License 1.0")]
            EclipsePublicLicense10 = 18,
            /// <summary>
            /// Enum EducationalCommunityLicensev10 for value: Educational Community License v1.0
            /// </summary>
            [EnumMember(Value = "Educational Community License v1.0")]
            EducationalCommunityLicensev10 = 19,
            /// <summary>
            /// Enum EducationalCommunityLicensev20 for value: Educational Community License v2.0
            /// </summary>
            [EnumMember(Value = "Educational Community License v2.0")]
            EducationalCommunityLicensev20 = 20,
            /// <summary>
            /// Enum GNUAfferoGeneralPublicLicensev30 for value: GNU Affero General Public License v3.0
            /// </summary>
            [EnumMember(Value = "GNU Affero General Public License v3.0")]
            GNUAfferoGeneralPublicLicensev30 = 21,
            /// <summary>
            /// Enum GNUFreeDocumentationLicensev11 for value: GNU Free Documentation License v1.1
            /// </summary>
            [EnumMember(Value = "GNU Free Documentation License v1.1")]
            GNUFreeDocumentationLicensev11 = 22,
            /// <summary>
            /// Enum GNUFreeDocumentationLicensev12 for value: GNU Free Documentation License v1.2
            /// </summary>
            [EnumMember(Value = "GNU Free Documentation License v1.2")]
            GNUFreeDocumentationLicensev12 = 23,
            /// <summary>
            /// Enum GNUFreeDocumentationLicensev13 for value: GNU Free Documentation License v1.3
            /// </summary>
            [EnumMember(Value = "GNU Free Documentation License v1.3")]
            GNUFreeDocumentationLicensev13 = 24,
            /// <summary>
            /// Enum GNUGeneralPublicLicensev10 for value: GNU General Public License v1.0
            /// </summary>
            [EnumMember(Value = "GNU General Public License v1.0")]
            GNUGeneralPublicLicensev10 = 25,
            /// <summary>
            /// Enum GNUGeneralPublicLicensev20 for value: GNU General Public License v2.0
            /// </summary>
            [EnumMember(Value = "GNU General Public License v2.0")]
            GNUGeneralPublicLicensev20 = 26,
            /// <summary>
            /// Enum GNUGeneralPublicLicensev30 for value: GNU General Public License v3.0
            /// </summary>
            [EnumMember(Value = "GNU General Public License v3.0")]
            GNUGeneralPublicLicensev30 = 27,
            /// <summary>
            /// Enum GNULesserGeneralPublicLicensev21 for value: GNU Lesser General Public License v2.1
            /// </summary>
            [EnumMember(Value = "GNU Lesser General Public License v2.1")]
            GNULesserGeneralPublicLicensev21 = 28,
            /// <summary>
            /// Enum GNULesserGeneralPublicLicensev30 for value: GNU Lesser General Public License v3.0
            /// </summary>
            [EnumMember(Value = "GNU Lesser General Public License v3.0")]
            GNULesserGeneralPublicLicensev30 = 29,
            /// <summary>
            /// Enum GNULibraryGeneralPublicLicensev20 for value: GNU Library General Public License v2.0
            /// </summary>
            [EnumMember(Value = "GNU Library General Public License v2.0")]
            GNULibraryGeneralPublicLicensev20 = 30,
            /// <summary>
            /// Enum ISClicense for value: ISC license
            /// </summary>
            [EnumMember(Value = "ISC license")]
            ISClicense = 31,
            /// <summary>
            /// Enum MozillaPublicLicense10 for value: Mozilla Public License 1.0
            /// </summary>
            [EnumMember(Value = "Mozilla Public License 1.0")]
            MozillaPublicLicense10 = 32,
            /// <summary>
            /// Enum MozillaPublicLicense11 for value: Mozilla Public License 1.1
            /// </summary>
            [EnumMember(Value = "Mozilla Public License 1.1")]
            MozillaPublicLicense11 = 33,
            /// <summary>
            /// Enum MozillaPublicLicense203 for value: Mozilla Public License 2.03
            /// </summary>
            [EnumMember(Value = "Mozilla Public License 2.03")]
            MozillaPublicLicense203 = 34        }
        /// <summary>
        /// Desired LICENSE template to apply. Use the name of the template.
        /// </summary>
        /// <value>Desired LICENSE template to apply. Use the name of the template.</value>
        [DataMember(Name="license", EmitDefaultValue=false)]
        public LicenseEnum? License { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateRepo" /> class.
        /// </summary>
        /// <param name="name">name of the repository (required).</param>
        /// <param name="description">A short description of the repository.</param>
        /// <param name="_private">Either true to create a private repository, or false to create a public one. (default to false).</param>
        /// <param name="autoInit">Pass true to create an initial commit with README, .gitignore and LICENSE. (default to false).</param>
        /// <param name="gitignores">Desired language .gitignore templates to apply. Use the name of the templates..</param>
        /// <param name="license">Desired LICENSE template to apply. Use the name of the template..</param>
        /// <param name="readme">Desired README template to apply. Use the name of the template. (default to &quot;Default&quot;).</param>
        public CreateRepo(string name = default(string), string description = default(string), bool? _private = false, bool? autoInit = false, string gitignores = default(string), LicenseEnum? license = default(LicenseEnum?), string readme = "Default")
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for CreateRepo and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            this.Description = description;
            // use default value if no "_private" provided
            if (_private == null)
            {
                this._Private = false;
            }
            else
            {
                this._Private = _private;
            }
            // use default value if no "autoInit" provided
            if (autoInit == null)
            {
                this.AutoInit = false;
            }
            else
            {
                this.AutoInit = autoInit;
            }
            this.Gitignores = gitignores;
            this.License = license;
            // use default value if no "readme" provided
            if (readme == null)
            {
                this.Readme = "Default";
            }
            else
            {
                this.Readme = readme;
            }
        }
        
        /// <summary>
        /// name of the repository
        /// </summary>
        /// <value>name of the repository</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// A short description of the repository
        /// </summary>
        /// <value>A short description of the repository</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Either true to create a private repository, or false to create a public one.
        /// </summary>
        /// <value>Either true to create a private repository, or false to create a public one.</value>
        [DataMember(Name="private", EmitDefaultValue=false)]
        public bool? _Private { get; set; }

        /// <summary>
        /// Pass true to create an initial commit with README, .gitignore and LICENSE.
        /// </summary>
        /// <value>Pass true to create an initial commit with README, .gitignore and LICENSE.</value>
        [DataMember(Name="auto_init", EmitDefaultValue=false)]
        public bool? AutoInit { get; set; }

        /// <summary>
        /// Desired language .gitignore templates to apply. Use the name of the templates.
        /// </summary>
        /// <value>Desired language .gitignore templates to apply. Use the name of the templates.</value>
        [DataMember(Name="gitignores", EmitDefaultValue=false)]
        public string Gitignores { get; set; }


        /// <summary>
        /// Desired README template to apply. Use the name of the template.
        /// </summary>
        /// <value>Desired README template to apply. Use the name of the template.</value>
        [DataMember(Name="readme", EmitDefaultValue=false)]
        public string Readme { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateRepo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  _Private: ").Append(_Private).Append("\n");
            sb.Append("  AutoInit: ").Append(AutoInit).Append("\n");
            sb.Append("  Gitignores: ").Append(Gitignores).Append("\n");
            sb.Append("  License: ").Append(License).Append("\n");
            sb.Append("  Readme: ").Append(Readme).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CreateRepo);
        }

        /// <summary>
        /// Returns true if CreateRepo instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateRepo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateRepo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this._Private == input._Private ||
                    (this._Private != null &&
                    this._Private.Equals(input._Private))
                ) && 
                (
                    this.AutoInit == input.AutoInit ||
                    (this.AutoInit != null &&
                    this.AutoInit.Equals(input.AutoInit))
                ) && 
                (
                    this.Gitignores == input.Gitignores ||
                    (this.Gitignores != null &&
                    this.Gitignores.Equals(input.Gitignores))
                ) && 
                (
                    this.License == input.License ||
                    (this.License != null &&
                    this.License.Equals(input.License))
                ) && 
                (
                    this.Readme == input.Readme ||
                    (this.Readme != null &&
                    this.Readme.Equals(input.Readme))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this._Private != null)
                    hashCode = hashCode * 59 + this._Private.GetHashCode();
                if (this.AutoInit != null)
                    hashCode = hashCode * 59 + this.AutoInit.GetHashCode();
                if (this.Gitignores != null)
                    hashCode = hashCode * 59 + this.Gitignores.GetHashCode();
                if (this.License != null)
                    hashCode = hashCode * 59 + this.License.GetHashCode();
                if (this.Readme != null)
                    hashCode = hashCode * 59 + this.Readme.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
