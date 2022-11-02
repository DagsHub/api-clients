//
// IssueAssignee.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct IssueAssignee: Codable {

    public var _id: Int?
    public var login: String?
    public var fullName: String?
    public var avatarUrl: String?
    public var username: String?

    public init(_id: Int? = nil, login: String? = nil, fullName: String? = nil, avatarUrl: String? = nil, username: String? = nil) {
        self._id = _id
        self.login = login
        self.fullName = fullName
        self.avatarUrl = avatarUrl
        self.username = username
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case login
        case fullName = "full_name"
        case avatarUrl = "avatar_url"
        case username
    }

}
