/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
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
import io.swagger.client.model.WebhookConfig;
import io.swagger.client.model.WebhookEvents;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RepoHooksBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-24T12:47:40.132792Z[Etc/UTC]")
public class RepoHooksBody {
  /**
   * The type of webhook
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DAGSHUB("dagshub"),
    SLACK("slack"),
    DISCORD("discord"),
    DINGTALK("dingtalk");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("config")
  private WebhookConfig config = null;

  @SerializedName("events")
  private WebhookEvents events = null;

  public RepoHooksBody type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of webhook
   * @return type
  **/
  @Schema(example = "discord", required = true, description = "The type of webhook")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RepoHooksBody config(WebhookConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(required = true, description = "")
  public WebhookConfig getConfig() {
    return config;
  }

  public void setConfig(WebhookConfig config) {
    this.config = config;
  }

  public RepoHooksBody events(WebhookEvents events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public WebhookEvents getEvents() {
    return events;
  }

  public void setEvents(WebhookEvents events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoHooksBody repoHooksBody = (RepoHooksBody) o;
    return Objects.equals(this.type, repoHooksBody.type) &&
        Objects.equals(this.config, repoHooksBody.config) &&
        Objects.equals(this.events, repoHooksBody.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, config, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoHooksBody {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
