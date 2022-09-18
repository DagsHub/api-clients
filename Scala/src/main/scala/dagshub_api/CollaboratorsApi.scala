/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package dagshub_api

import java.text.SimpleDateFormat

import io.swagger.client.model.CollaboratorsCollaboratorBody
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

class CollaboratorsApi(
  val defBasePath: String = "http://dagshub.com/api/v1/",
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
  val helper = new CollaboratorsApiAsyncHelper(client, config)

  /**
   * Add user as a collaborator
   * 
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @param collaborator collaborator username 
   * @param body  (optional)
   * @return void
   */
  def addCollaborator(username: String, repo: String, collaborator: String, body: Option[CollaboratorsCollaboratorBody] = None) = {
    val await = Try(Await.result(addCollaboratorAsync(username, repo, collaborator, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add user as a collaborator asynchronously
   * 
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @param collaborator collaborator username 
   * @param body  (optional)
   * @return Future(void)
   */
  def addCollaboratorAsync(username: String, repo: String, collaborator: String, body: Option[CollaboratorsCollaboratorBody] = None) = {
      helper.addCollaborator(username, repo, collaborator, body)
  }

  /**
   * Get collaborators
   * 
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @return void
   */
  def getCollaborators(username: String, repo: String) = {
    val await = Try(Await.result(getCollaboratorsAsync(username, repo), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get collaborators asynchronously
   * 
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @return Future(void)
   */
  def getCollaboratorsAsync(username: String, repo: String) = {
      helper.getCollaborators(username, repo)
  }

  /**
   * Delete collaborator
   * 
   *
   * @return void
   */
  def removeCollaborator() = {
    val await = Try(Await.result(removeCollaboratorAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete collaborator asynchronously
   * 
   *
   * @return Future(void)
   */
  def removeCollaboratorAsync() = {
      helper.removeCollaborator()
  }

}

class CollaboratorsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addCollaborator(username: String,
    repo: String,
    collaborator: String,
    body: Option[CollaboratorsCollaboratorBody] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[CollaboratorsCollaboratorBody]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{username}/{repo}/collaborators/{collaborator}")
      replaceAll("\\{" + "username" + "\\}", username.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "collaborator" + "\\}", collaborator.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling CollaboratorsApi->addCollaborator")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling CollaboratorsApi->addCollaborator")

    if (collaborator == null) throw new Exception("Missing required parameter 'collaborator' when calling CollaboratorsApi->addCollaborator")


    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCollaborators(username: String,
    repo: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{username}/{repo}/collaborators")
      replaceAll("\\{" + "username" + "\\}", username.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling CollaboratorsApi->getCollaborators")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling CollaboratorsApi->getCollaborators")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def removeCollaborator()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{username}/{repo}/collaborators/{collaborator}"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}