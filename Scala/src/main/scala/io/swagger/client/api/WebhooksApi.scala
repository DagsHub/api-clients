/**
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
package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.HooksIdBody
import io.swagger.client.model.RepoHooksBody
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class WebhooksApi(
  val defBasePath: String = "https://dagshub.com/api/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new WebhooksApiAsyncHelper(client, config)

  /**
   * Create a hook
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param body  (optional)
   * @return void
   */
  def createHook(owner: String, repo: String, body: Option[RepoHooksBody] = None) = {
    val await = Try(Await.result(createHookAsync(owner, repo, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a hook asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param body  (optional)
   * @return Future(void)
   */
  def createHookAsync(owner: String, repo: String, body: Option[RepoHooksBody] = None) = {
      helper.createHook(owner, repo, body)
  }

  /**
   * Delete a hook
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param id  
   * @return void
   */
  def deleteHook(owner: String, repo: String, id: Integer) = {
    val await = Try(Await.result(deleteHookAsync(owner, repo, id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a hook asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param id  
   * @return Future(void)
   */
  def deleteHookAsync(owner: String, repo: String, id: Integer) = {
      helper.deleteHook(owner, repo, id)
  }

  /**
   * Edit a hook
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param id  
   * @param body  (optional)
   * @return void
   */
  def editHook(owner: String, repo: String, id: Integer, body: Option[HooksIdBody] = None) = {
    val await = Try(Await.result(editHookAsync(owner, repo, id, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Edit a hook asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param id  
   * @param body  (optional)
   * @return Future(void)
   */
  def editHookAsync(owner: String, repo: String, id: Integer, body: Option[HooksIdBody] = None) = {
      helper.editHook(owner, repo, id, body)
  }

  /**
   * List hooks
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @return void
   */
  def listHooks(owner: String, repo: String) = {
    val await = Try(Await.result(listHooksAsync(owner, repo), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List hooks asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @return Future(void)
   */
  def listHooksAsync(owner: String, repo: String) = {
      helper.listHooks(owner, repo)
  }

}

class WebhooksApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createHook(owner: String,
    repo: String,
    body: Option[RepoHooksBody] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[RepoHooksBody]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/hooks")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling WebhooksApi->createHook")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling WebhooksApi->createHook")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteHook(owner: String,
    repo: String,
    id: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/hooks/{id}")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling WebhooksApi->deleteHook")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling WebhooksApi->deleteHook")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def editHook(owner: String,
    repo: String,
    id: Integer,
    body: Option[HooksIdBody] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[HooksIdBody]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/hooks/{id}")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling WebhooksApi->editHook")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling WebhooksApi->editHook")


    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listHooks(owner: String,
    repo: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/hooks")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling WebhooksApi->listHooks")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling WebhooksApi->listHooks")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
