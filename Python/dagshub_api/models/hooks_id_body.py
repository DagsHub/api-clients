# coding: utf-8

"""
    DagsHub API

    This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training.   # noqa: E501

    OpenAPI spec version: 1.0.2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class HooksIdBody(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'config': 'WebhookConfig',
        'events': 'WebhookEvents',
        'active': 'bool'
    }

    attribute_map = {
        'config': 'config',
        'events': 'events',
        'active': 'active'
    }

    def __init__(self, config=None, events=None, active=None):  # noqa: E501
        """HooksIdBody - a model defined in Swagger"""  # noqa: E501
        self._config = None
        self._events = None
        self._active = None
        self.discriminator = None
        if config is not None:
            self.config = config
        if events is not None:
            self.events = events
        if active is not None:
            self.active = active

    @property
    def config(self):
        """Gets the config of this HooksIdBody.  # noqa: E501


        :return: The config of this HooksIdBody.  # noqa: E501
        :rtype: WebhookConfig
        """
        return self._config

    @config.setter
    def config(self, config):
        """Sets the config of this HooksIdBody.


        :param config: The config of this HooksIdBody.  # noqa: E501
        :type: WebhookConfig
        """

        self._config = config

    @property
    def events(self):
        """Gets the events of this HooksIdBody.  # noqa: E501


        :return: The events of this HooksIdBody.  # noqa: E501
        :rtype: WebhookEvents
        """
        return self._events

    @events.setter
    def events(self, events):
        """Sets the events of this HooksIdBody.


        :param events: The events of this HooksIdBody.  # noqa: E501
        :type: WebhookEvents
        """

        self._events = events

    @property
    def active(self):
        """Gets the active of this HooksIdBody.  # noqa: E501

        Weather the hook is actually triggered on pushes or not. Ignore this field to leave it unchanged.  # noqa: E501

        :return: The active of this HooksIdBody.  # noqa: E501
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active):
        """Sets the active of this HooksIdBody.

        Weather the hook is actually triggered on pushes or not. Ignore this field to leave it unchanged.  # noqa: E501

        :param active: The active of this HooksIdBody.  # noqa: E501
        :type: bool
        """

        self._active = active

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(HooksIdBody, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, HooksIdBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
