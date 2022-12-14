/* 
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using dagshub_api.Client;
using dagshub_api.Api;
using dagshub_api.Model;

namespace dagshub_api.Test
{
    /// <summary>
    ///  Class for testing CollaboratorsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CollaboratorsApiTests
    {
        private CollaboratorsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CollaboratorsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CollaboratorsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CollaboratorsApi
            //Assert.IsInstanceOfType(typeof(CollaboratorsApi), instance, "instance is a CollaboratorsApi");
        }

        /// <summary>
        /// Test AddCollaborator
        /// </summary>
        [Test]
        public void AddCollaboratorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //string collaborator = null;
            //CollaboratorsCollaboratorBody body = null;
            //instance.AddCollaborator(owner, repo, collaborator, body);
            
        }
        /// <summary>
        /// Test GetCollaborators
        /// </summary>
        [Test]
        public void GetCollaboratorsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //instance.GetCollaborators(owner, repo);
            
        }
        /// <summary>
        /// Test RemoveCollaborator
        /// </summary>
        [Test]
        public void RemoveCollaboratorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //string collaborator = null;
            //instance.RemoveCollaborator(owner, repo, collaborator);
            
        }
    }

}
