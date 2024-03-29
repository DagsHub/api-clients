# coding: utf-8

"""
    DagsHub API

    This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training.   # noqa: E501

    OpenAPI spec version: 1.0.2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import dagshub_api
from dagshub_api.api.experiments_api import ExperimentsApi  # noqa: E501
from dagshub_api.rest import ApiException


class TestExperimentsApi(unittest.TestCase):
    """ExperimentsApi unit test stubs"""

    def setUp(self):
        self.api = ExperimentsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_experiment_label(self):
        """Test case for add_experiment_label

        Add label to experiment  # noqa: E501
        """
        pass

    def test_delete_experiment(self):
        """Test case for delete_experiment

        Delete experiment  # noqa: E501
        """
        pass

    def test_delete_experiment_label(self):
        """Test case for delete_experiment_label

        Delete experiment label  # noqa: E501
        """
        pass

    def test_edit_experiment(self):
        """Test case for edit_experiment

        Edit experiment info  # noqa: E501
        """
        pass

    def test_get_experiment_metrics(self):
        """Test case for get_experiment_metrics

        Get experiment metrics for experiment  # noqa: E501
        """
        pass

    def test_get_experiments(self):
        """Test case for get_experiments

        List Experiments  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
