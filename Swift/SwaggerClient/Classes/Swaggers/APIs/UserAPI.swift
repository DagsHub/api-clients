//
// UserAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class UserAPI {
    /**
     Get authenticated user information

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAuthenticatedUser(completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getAuthenticatedUserWithRequestBuilder().execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get authenticated user information
     - GET /user
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth

     - returns: RequestBuilder<Void> 
     */
    open class func getAuthenticatedUserWithRequestBuilder() -> RequestBuilder<Void> {
        let path = "/user"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get information about a user

     - parameter username: (path) A DagsHub username or organization name 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getUser(username: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getUserWithRequestBuilder(username: username).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get information about a user
     - GET /users/{username}
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter username: (path) A DagsHub username or organization name 

     - returns: RequestBuilder<Void> 
     */
    open class func getUserWithRequestBuilder(username: String) -> RequestBuilder<Void> {
        var path = "/users/{username}"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
