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
    ///  Class for testing ExperimentsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ExperimentsApiTests
    {
        private ExperimentsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ExperimentsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ExperimentsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ExperimentsApi
            //Assert.IsInstanceOfType(typeof(ExperimentsApi), instance, "instance is a ExperimentsApi");
        }

        /// <summary>
        /// Test AddExperimentLabel
        /// </summary>
        [Test]
        public void AddExperimentLabelTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //string experimentKey = null;
            //string experimentLabel = null;
            //instance.AddExperimentLabel(owner, repo, experimentKey, experimentLabel);
            
        }
        /// <summary>
        /// Test DeleteExperiment
        /// </summary>
        [Test]
        public void DeleteExperimentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //string experimentKey = null;
            //instance.DeleteExperiment(owner, repo, experimentKey);
            
        }
        /// <summary>
        /// Test DeleteExperimentLabel
        /// </summary>
        [Test]
        public void DeleteExperimentLabelTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //string experimentKey = null;
            //string experimentLabel = null;
            //instance.DeleteExperimentLabel(owner, repo, experimentKey, experimentLabel);
            
        }
        /// <summary>
        /// Test EditExperiment
        /// </summary>
        [Test]
        public void EditExperimentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //string experimentKey = null;
            //EditExperimentPost body = null;
            //instance.EditExperiment(owner, repo, experimentKey, body);
            
        }
        /// <summary>
        /// Test GetExperimentMetrics
        /// </summary>
        [Test]
        public void GetExperimentMetricsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //ExperimentKeys body = null;
            //instance.GetExperimentMetrics(owner, repo, body);
            
        }
        /// <summary>
        /// Test GetExperiments
        /// </summary>
        [Test]
        public void GetExperimentsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //instance.GetExperiments(owner, repo);
            
        }
    }

}
