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
    ///  Class for testing WebhookConfig
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class WebhookConfigTests
    {
        // TODO uncomment below to declare an instance variable for WebhookConfig
        //private WebhookConfig instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of WebhookConfig
            //instance = new WebhookConfig();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of WebhookConfig
        /// </summary>
        [Test]
        public void WebhookConfigInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" WebhookConfig
            //Assert.IsInstanceOfType<WebhookConfig> (instance, "variable 'instance' is a WebhookConfig");
        }


        /// <summary>
        /// Test the property 'Url'
        /// </summary>
        [Test]
        public void UrlTest()
        {
            // TODO unit test for the property 'Url'
        }
        /// <summary>
        /// Test the property 'ContentType'
        /// </summary>
        [Test]
        public void ContentTypeTest()
        {
            // TODO unit test for the property 'ContentType'
        }
        /// <summary>
        /// Test the property 'Secret'
        /// </summary>
        [Test]
        public void SecretTest()
        {
            // TODO unit test for the property 'Secret'
        }

    }

}
