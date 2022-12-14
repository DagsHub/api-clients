//
// IssuesAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class IssuesAPI {
    /**
     Create an issue

     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter body: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createIssue(owner: String, repo: String, body: PostIssue? = nil, completion: @escaping ((_ data: Issue?,_ error: Error?) -> Void)) {
        createIssueWithRequestBuilder(owner: owner, repo: repo, body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Create an issue
     - POST /repos/{owner}/{repo}/issues

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example={
  "id" : 72,
  "number" : 1,
  "state" : "open",
  "title" : "test issue",
  "body" : "",
  "user" : {
    "id" : 3,
    "username" : "user1",
    "full_name" : "",
    "email" : "fake@local",
    "avatar_url" : "https://secure.gravatar.com/avatar/0207f4280f6c1bd45e1a2ed7cb1cca3d"
  },
  "labels" : [ "bug" ],
  "comments" : 1,
  "created_at" : "2016-03-05T13:18:51-05:00",
  "updated_at" : "2016-03-05T13:18:51-05:00"
}}]
     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter body: (body)  (optional)

     - returns: RequestBuilder<Issue> 
     */
    open class func createIssueWithRequestBuilder(owner: String, repo: String, body: PostIssue? = nil) -> RequestBuilder<Issue> {
        var path = "/repos/{owner}/{repo}/issues"
        let ownerPreEscape = "\(owner)"
        let ownerPostEscape = ownerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{owner}", with: ownerPostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Issue>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Edit an issue

     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter body: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func editIssue(owner: String, repo: String, body: PatchIssue? = nil, completion: @escaping ((_ data: Issue?,_ error: Error?) -> Void)) {
        editIssueWithRequestBuilder(owner: owner, repo: repo, body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Edit an issue
     - PATCH /repos/{owner}/{repo}/issues
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example={
  "id" : 72,
  "number" : 1,
  "state" : "open",
  "title" : "test issue",
  "body" : "",
  "user" : {
    "id" : 3,
    "username" : "user1",
    "full_name" : "",
    "email" : "fake@local",
    "avatar_url" : "https://secure.gravatar.com/avatar/0207f4280f6c1bd45e1a2ed7cb1cca3d"
  },
  "labels" : [ "bug" ],
  "comments" : 1,
  "created_at" : "2016-03-05T13:18:51-05:00",
  "updated_at" : "2016-03-05T13:18:51-05:00"
}}]
     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter body: (body)  (optional)

     - returns: RequestBuilder<Issue> 
     */
    open class func editIssueWithRequestBuilder(owner: String, repo: String, body: PatchIssue? = nil) -> RequestBuilder<Issue> {
        var path = "/repos/{owner}/{repo}/issues"
        let ownerPreEscape = "\(owner)"
        let ownerPostEscape = ownerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{owner}", with: ownerPostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Issue>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Get a single issue

     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter index: (path) the index of an issue or a pull request 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getIssue(owner: String, repo: String, index: Int, completion: @escaping ((_ data: Issue?,_ error: Error?) -> Void)) {
        getIssueWithRequestBuilder(owner: owner, repo: repo, index: index).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a single issue
     - GET /repos/{owner}/{repo}/issues/{index}

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example={
  "id" : 72,
  "number" : 1,
  "state" : "open",
  "title" : "test issue",
  "body" : "",
  "user" : {
    "id" : 3,
    "username" : "user1",
    "full_name" : "",
    "email" : "fake@local",
    "avatar_url" : "https://secure.gravatar.com/avatar/0207f4280f6c1bd45e1a2ed7cb1cca3d"
  },
  "labels" : [ "bug" ],
  "comments" : 1,
  "created_at" : "2016-03-05T13:18:51-05:00",
  "updated_at" : "2016-03-05T13:18:51-05:00"
}}]
     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter index: (path) the index of an issue or a pull request 

     - returns: RequestBuilder<Issue> 
     */
    open class func getIssueWithRequestBuilder(owner: String, repo: String, index: Int) -> RequestBuilder<Issue> {
        var path = "/repos/{owner}/{repo}/issues/{index}"
        let ownerPreEscape = "\(owner)"
        let ownerPostEscape = ownerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{owner}", with: ownerPostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let indexPreEscape = "\(index)"
        let indexPostEscape = indexPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{index}", with: indexPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Issue>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     List issues for a repository

     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listRepoIssues(owner: String, repo: String, completion: @escaping ((_ data: Issues?,_ error: Error?) -> Void)) {
        listRepoIssuesWithRequestBuilder(owner: owner, repo: repo).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List issues for a repository
     - GET /repos/{owner}/{repo}/issues

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example=[ {
  "id" : 72,
  "number" : 1,
  "state" : "open",
  "title" : "test issue",
  "body" : "",
  "user" : {
    "id" : 3,
    "username" : "user1",
    "full_name" : "",
    "email" : "fake@local",
    "avatar_url" : "https://secure.gravatar.com/avatar/0207f4280f6c1bd45e1a2ed7cb1cca3d"
  },
  "labels" : [ "bug" ],
  "comments" : 1,
  "created_at" : "2016-03-05T13:18:51-05:00",
  "updated_at" : "2016-03-05T13:18:51-05:00"
}, {
  "id" : 72,
  "number" : 1,
  "state" : "open",
  "title" : "test issue",
  "body" : "",
  "user" : {
    "id" : 3,
    "username" : "user1",
    "full_name" : "",
    "email" : "fake@local",
    "avatar_url" : "https://secure.gravatar.com/avatar/0207f4280f6c1bd45e1a2ed7cb1cca3d"
  },
  "labels" : [ "bug" ],
  "comments" : 1,
  "created_at" : "2016-03-05T13:18:51-05:00",
  "updated_at" : "2016-03-05T13:18:51-05:00"
} ]}]
     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 

     - returns: RequestBuilder<Issues> 
     */
    open class func listRepoIssuesWithRequestBuilder(owner: String, repo: String) -> RequestBuilder<Issues> {
        var path = "/repos/{owner}/{repo}/issues"
        let ownerPreEscape = "\(owner)"
        let ownerPostEscape = ownerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{owner}", with: ownerPostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Issues>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
