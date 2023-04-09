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
import java.util.ArrayList;
import java.util.List;
/**
 * ExperimentKeys
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-09T12:18:35.169871Z[Etc/UTC]")
public class ExperimentKeys {
  @SerializedName("experiment_keys")
  private List<String> experimentKeys = new ArrayList<String>();

  public ExperimentKeys experimentKeys(List<String> experimentKeys) {
    this.experimentKeys = experimentKeys;
    return this;
  }

  public ExperimentKeys addExperimentKeysItem(String experimentKeysItem) {
    this.experimentKeys.add(experimentKeysItem);
    return this;
  }

   /**
   * Get experimentKeys
   * @return experimentKeys
  **/
  @Schema(required = true, description = "")
  public List<String> getExperimentKeys() {
    return experimentKeys;
  }

  public void setExperimentKeys(List<String> experimentKeys) {
    this.experimentKeys = experimentKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentKeys experimentKeys = (ExperimentKeys) o;
    return Objects.equals(this.experimentKeys, experimentKeys.experimentKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentKeys {\n");
    
    sb.append("    experimentKeys: ").append(toIndentedString(experimentKeys)).append("\n");
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
