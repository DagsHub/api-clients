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
 * Key/value pairs to provide settings for this hook
 */
@Schema(description = "Key/value pairs to provide settings for this hook")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-11T11:41:48.085831Z[Etc/UTC]")
public class WebhookConfig {
  @SerializedName("url")
  private String url = null;

  /**
   * A string defining the media type used to serialize the payloads.
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    JSON("json"),
    FORM("form");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ContentTypeEnum fromValue(String input) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ContentTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;

  @SerializedName("secret")
  private String secret = null;

  public WebhookConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A string defining the URL to which the payloads will be delivered.
   * @return url
  **/
  @Schema(example = "http://yourwebsite.io", required = true, description = "A string defining the URL to which the payloads will be delivered.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookConfig contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * A string defining the media type used to serialize the payloads.
   * @return contentType
  **/
  @Schema(example = "json", required = true, description = "A string defining the media type used to serialize the payloads.")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public WebhookConfig secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * An optional string that&#x27;s passed with the HTTP requests body.
   * @return secret
  **/
  @Schema(example = "supersecretkey", description = "An optional string that's passed with the HTTP requests body.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookConfig webhookConfig = (WebhookConfig) o;
    return Objects.equals(this.url, webhookConfig.url) &&
        Objects.equals(this.contentType, webhookConfig.contentType) &&
        Objects.equals(this.secret, webhookConfig.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, contentType, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookConfig {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
