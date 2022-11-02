//
// CollaboratorsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class CollaboratorsAPI {
    /**
     Add user as a collaborator

     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 
     - parameter collaborator: (path) collaborator username 
     - parameter body: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func addCollaborator(username: String, repo: String, collaborator: String, body: CollaboratorsCollaboratorBody? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        addCollaboratorWithRequestBuilder(username: username, repo: repo, collaborator: collaborator, body: body).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Add user as a collaborator
     - PUT /repos/{username}/{repo}/collaborators/{collaborator}
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 
     - parameter collaborator: (path) collaborator username 
     - parameter body: (body)  (optional)

     - returns: RequestBuilder<Void> 
     */
    open class func addCollaboratorWithRequestBuilder(username: String, repo: String, collaborator: String, body: CollaboratorsCollaboratorBody? = nil) -> RequestBuilder<Void> {
        var path = "/repos/{username}/{repo}/collaborators/{collaborator}"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let collaboratorPreEscape = "\(collaborator)"
        let collaboratorPostEscape = collaboratorPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{collaborator}", with: collaboratorPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Get collaborators

     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCollaborators(username: String, repo: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCollaboratorsWithRequestBuilder(username: username, repo: repo).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get collaborators
     - GET /repos/{username}/{repo}/collaborators
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 

     - returns: RequestBuilder<Void> 
     */
    open class func getCollaboratorsWithRequestBuilder(username: String, repo: String) -> RequestBuilder<Void> {
        var path = "/repos/{username}/{repo}/collaborators"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Delete collaborator

     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 
     - parameter collaborator: (path) collaborator username 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func removeCollaborator(username: String, repo: String, collaborator: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        removeCollaboratorWithRequestBuilder(username: username, repo: repo, collaborator: collaborator).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Delete collaborator
     - DELETE /repos/{username}/{repo}/collaborators/{collaborator}
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 
     - parameter collaborator: (path) collaborator username 

     - returns: RequestBuilder<Void> 
     */
    open class func removeCollaboratorWithRequestBuilder(username: String, repo: String, collaborator: String) -> RequestBuilder<Void> {
        var path = "/repos/{username}/{repo}/collaborators/{collaborator}"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let collaboratorPreEscape = "\(collaborator)"
        let collaboratorPostEscape = collaboratorPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{collaborator}", with: collaboratorPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
