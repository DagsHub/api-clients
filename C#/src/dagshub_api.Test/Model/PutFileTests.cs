/* 
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using dagshub_api.Api;
using dagshub_api.Model;
using dagshub_api.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace dagshub_api.Test
{
    /// <summary>
    ///  Class for testing PutFile
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class PutFileTests
    {
        // TODO uncomment below to declare an instance variable for PutFile
        //private PutFile instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of PutFile
            //instance = new PutFile();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PutFile
        /// </summary>
        [Test]
        public void PutFileInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" PutFile
            //Assert.IsInstanceOfType<PutFile> (instance, "variable 'instance' is a PutFile");
        }


        /// <summary>
        /// Test the property 'CommitSummary'
        /// </summary>
        [Test]
        public void CommitSummaryTest()
        {
            // TODO unit test for the property 'CommitSummary'
        }
        /// <summary>
        /// Test the property 'CommitMessage'
        /// </summary>
        [Test]
        public void CommitMessageTest()
        {
            // TODO unit test for the property 'CommitMessage'
        }
        /// <summary>
        /// Test the property 'CommitChoice'
        /// </summary>
        [Test]
        public void CommitChoiceTest()
        {
            // TODO unit test for the property 'CommitChoice'
        }
        /// <summary>
        /// Test the property 'LastCommit'
        /// </summary>
        [Test]
        public void LastCommitTest()
        {
            // TODO unit test for the property 'LastCommit'
        }
        /// <summary>
        /// Test the property 'NewBranchName'
        /// </summary>
        [Test]
        public void NewBranchNameTest()
        {
            // TODO unit test for the property 'NewBranchName'
        }
        /// <summary>
        /// Test the property 'Versioning'
        /// </summary>
        [Test]
        public void VersioningTest()
        {
            // TODO unit test for the property 'Versioning'
        }
        /// <summary>
        /// Test the property 'Files'
        /// </summary>
        [Test]
        public void FilesTest()
        {
            // TODO unit test for the property 'Files'
        }

    }

}