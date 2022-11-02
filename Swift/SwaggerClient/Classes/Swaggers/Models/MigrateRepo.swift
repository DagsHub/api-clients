//
// MigrateRepo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MigrateRepo: Codable {

    public enum Visibility: String, Codable { 
        case _private = "private"
        case _public = "public"
    }
    /** Remote Git address (HTTP/HTTPS URL or local path) */
    public var cloneAddr: String
    /** Authorization username */
    public var authUsername: String?
    /** Authorization password */
    public var authPassword: String?
    /** User ID who takes ownership of this repository */
    public var userId: Int
    /** Name of the repository */
    public var repoName: String?
    /** Repository will be a mirror (connected repository). */
    public var mirror: Bool?
    /** Repository will be private or public. */
    public var visibility: Visibility?
    /** Description of the repository */
    public var _description: String?

    public init(cloneAddr: String, authUsername: String? = nil, authPassword: String? = nil, userId: Int, repoName: String? = nil, mirror: Bool? = nil, visibility: Visibility? = nil, _description: String? = nil) {
        self.cloneAddr = cloneAddr
        self.authUsername = authUsername
        self.authPassword = authPassword
        self.userId = userId
        self.repoName = repoName
        self.mirror = mirror
        self.visibility = visibility
        self._description = _description
    }

    public enum CodingKeys: String, CodingKey { 
        case cloneAddr = "clone_addr"
        case authUsername = "auth_username"
        case authPassword = "auth_password"
        case userId = "user_id"
        case repoName = "repo_name"
        case mirror
        case visibility
        case _description = "description"
    }

}
