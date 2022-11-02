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
from dagshub_api.models.webhook_events import WebhookEvents  # noqa: E501
from dagshub_api.rest import ApiException


class TestWebhookEvents(unittest.TestCase):
    """WebhookEvents unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testWebhookEvents(self):
        """Test WebhookEvents"""
        # FIXME: construct object with mandatory attributes with example values
        # model = dagshub_api.models.webhook_events.WebhookEvents()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
