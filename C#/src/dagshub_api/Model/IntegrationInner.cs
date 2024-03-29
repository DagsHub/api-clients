/* 
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
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
    /// IntegrationInner
    /// </summary>
    [DataContract]
        public partial class IntegrationInner :  IEquatable<IntegrationInner>, IValidatableObject
    {
        /// <summary>
        /// Protocol used by the integration
        /// </summary>
        /// <value>Protocol used by the integration</value>
        [JsonConverter(typeof(StringEnumConverter))]
                public enum ProtocolEnum
        {
            /// <summary>
            /// Enum S3 for value: s3
            /// </summary>
            [EnumMember(Value = "s3")]
            S3 = 1,
            /// <summary>
            /// Enum Gs for value: gs
            /// </summary>
            [EnumMember(Value = "gs")]
            Gs = 2        }
        /// <summary>
        /// Protocol used by the integration
        /// </summary>
        /// <value>Protocol used by the integration</value>
        [DataMember(Name="protocol", EmitDefaultValue=false)]
        public ProtocolEnum? Protocol { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="IntegrationInner" /> class.
        /// </summary>
        /// <param name="name">Name/path of the bucket.</param>
        /// <param name="protocol">Protocol used by the integration.</param>
        /// <param name="listPath">URL to list the root of this bucket.</param>
        public IntegrationInner(string name = default(string), ProtocolEnum? protocol = default(ProtocolEnum?), string listPath = default(string))
        {
            this.Name = name;
            this.Protocol = protocol;
            this.ListPath = listPath;
        }
        
        /// <summary>
        /// Name/path of the bucket
        /// </summary>
        /// <value>Name/path of the bucket</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }


        /// <summary>
        /// URL to list the root of this bucket
        /// </summary>
        /// <value>URL to list the root of this bucket</value>
        [DataMember(Name="list_path", EmitDefaultValue=false)]
        public string ListPath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IntegrationInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
            sb.Append("  ListPath: ").Append(ListPath).Append("\n");
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
            return this.Equals(input as IntegrationInner);
        }

        /// <summary>
        /// Returns true if IntegrationInner instances are equal
        /// </summary>
        /// <param name="input">Instance of IntegrationInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IntegrationInner input)
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
                    this.Protocol == input.Protocol ||
                    (this.Protocol != null &&
                    this.Protocol.Equals(input.Protocol))
                ) && 
                (
                    this.ListPath == input.ListPath ||
                    (this.ListPath != null &&
                    this.ListPath.Equals(input.ListPath))
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
                if (this.Protocol != null)
                    hashCode = hashCode * 59 + this.Protocol.GetHashCode();
                if (this.ListPath != null)
                    hashCode = hashCode * 59 + this.ListPath.GetHashCode();
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
