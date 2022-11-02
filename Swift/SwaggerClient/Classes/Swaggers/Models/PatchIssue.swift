//
// PatchIssue.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PatchIssue: Codable {

    public var title: Title?
    public var body: Body?
    public var assignee: Assignee?
    public var milestone: Milestone?
    public var state: State?

    public init(title: Title? = nil, body: Body? = nil, assignee: Assignee? = nil, milestone: Milestone? = nil, state: State? = nil) {
        self.title = title
        self.body = body
        self.assignee = assignee
        self.milestone = milestone
        self.state = state
    }


}
