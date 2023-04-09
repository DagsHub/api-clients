/*
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CollaboratorsCollaboratorBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-09T12:18:35.169871Z[Etc/UTC]")
public class CollaboratorsCollaboratorBody {
  @SerializedName("permission")
  private String permission = "write";

  public CollaboratorsCollaboratorBody permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * The permission to grant the collaborator. Can be one of **read**, **write** and **admin**.
   * @return permission
  **/
  @Schema(description = "The permission to grant the collaborator. Can be one of **read**, **write** and **admin**.")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaboratorsCollaboratorBody collaboratorsCollaboratorBody = (CollaboratorsCollaboratorBody) o;
    return Objects.equals(this.permission, collaboratorsCollaboratorBody.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollaboratorsCollaboratorBody {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
