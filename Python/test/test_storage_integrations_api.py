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
from dagshub_api.api.storage_integrations_api import StorageIntegrationsApi  # noqa: E501
from dagshub_api.rest import ApiException


class TestStorageIntegrationsApi(unittest.TestCase):
    """StorageIntegrationsApi unit test stubs"""

    def setUp(self):
        self.api = StorageIntegrationsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_bucket_content(self):
        """Test case for get_bucket_content

        List contents in the path  # noqa: E501
        """
        pass

    def test_get_bucket_file(self):
        """Test case for get_bucket_file

        Get file in the bucket  # noqa: E501
        """
        pass

    def test_get_buckets(self):
        """Test case for get_buckets

        List integrated storages in the repository  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
