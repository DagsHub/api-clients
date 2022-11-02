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
import io.swagger.client.model.ComponentsschemasAssigneeYaml;
import io.swagger.client.model.ComponentsschemasBodyYaml;
import io.swagger.client.model.ComponentsschemasMilestoneYaml;
import io.swagger.client.model.ComponentsschemasStateYaml;
import io.swagger.client.model.ComponentsschemasTitleYaml;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PatchIssue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-02T12:04:04.486503Z[Etc/UTC]")
public class PatchIssue {
  @SerializedName("title")
  private ComponentsschemasTitleYaml title = null;

  @SerializedName("body")
  private ComponentsschemasBodyYaml body = null;

  @SerializedName("assignee")
  private ComponentsschemasAssigneeYaml assignee = null;

  @SerializedName("milestone")
  private ComponentsschemasMilestoneYaml milestone = null;

  @SerializedName("state")
  private ComponentsschemasStateYaml state = null;

  public PatchIssue title(ComponentsschemasTitleYaml title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public ComponentsschemasTitleYaml getTitle() {
    return title;
  }

  public void setTitle(ComponentsschemasTitleYaml title) {
    this.title = title;
  }

  public PatchIssue body(ComponentsschemasBodyYaml body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @Schema(description = "")
  public ComponentsschemasBodyYaml getBody() {
    return body;
  }

  public void setBody(ComponentsschemasBodyYaml body) {
    this.body = body;
  }

  public PatchIssue assignee(ComponentsschemasAssigneeYaml assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @Schema(description = "")
  public ComponentsschemasAssigneeYaml getAssignee() {
    return assignee;
  }

  public void setAssignee(ComponentsschemasAssigneeYaml assignee) {
    this.assignee = assignee;
  }

  public PatchIssue milestone(ComponentsschemasMilestoneYaml milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @Schema(description = "")
  public ComponentsschemasMilestoneYaml getMilestone() {
    return milestone;
  }

  public void setMilestone(ComponentsschemasMilestoneYaml milestone) {
    this.milestone = milestone;
  }

  public PatchIssue state(ComponentsschemasStateYaml state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public ComponentsschemasStateYaml getState() {
    return state;
  }

  public void setState(ComponentsschemasStateYaml state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchIssue patchIssue = (PatchIssue) o;
    return Objects.equals(this.title, patchIssue.title) &&
        Objects.equals(this.body, patchIssue.body) &&
        Objects.equals(this.assignee, patchIssue.assignee) &&
        Objects.equals(this.milestone, patchIssue.milestone) &&
        Objects.equals(this.state, patchIssue.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body, assignee, milestone, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchIssue {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
