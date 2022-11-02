# coding: utf-8

"""
    DagsHub API

    This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training.   # noqa: E501

    OpenAPI spec version: 1.0.2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from dagshub_api.api_client import ApiClient


class CollaboratorsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def add_collaborator(self, username, repo, collaborator, **kwargs):  # noqa: E501
        """Add user as a collaborator  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_collaborator(username, repo, collaborator, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str collaborator: collaborator username (required)
        :param CollaboratorsCollaboratorBody body:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.add_collaborator_with_http_info(username, repo, collaborator, **kwargs)  # noqa: E501
        else:
            (data) = self.add_collaborator_with_http_info(username, repo, collaborator, **kwargs)  # noqa: E501
            return data

    def add_collaborator_with_http_info(self, username, repo, collaborator, **kwargs):  # noqa: E501
        """Add user as a collaborator  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_collaborator_with_http_info(username, repo, collaborator, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str collaborator: collaborator username (required)
        :param CollaboratorsCollaboratorBody body:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['username', 'repo', 'collaborator', 'body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method add_collaborator" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'username' is set
        if ('username' not in params or
                params['username'] is None):
            raise ValueError("Missing the required parameter `username` when calling `add_collaborator`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `add_collaborator`")  # noqa: E501
        # verify the required parameter 'collaborator' is set
        if ('collaborator' not in params or
                params['collaborator'] is None):
            raise ValueError("Missing the required parameter `collaborator` when calling `add_collaborator`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'username' in params:
            path_params['username'] = params['username']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'collaborator' in params:
            path_params['collaborator'] = params['collaborator']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{username}/{repo}/collaborators/{collaborator}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_collaborators(self, username, repo, **kwargs):  # noqa: E501
        """Get collaborators  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_collaborators(username, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_collaborators_with_http_info(username, repo, **kwargs)  # noqa: E501
        else:
            (data) = self.get_collaborators_with_http_info(username, repo, **kwargs)  # noqa: E501
            return data

    def get_collaborators_with_http_info(self, username, repo, **kwargs):  # noqa: E501
        """Get collaborators  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_collaborators_with_http_info(username, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['username', 'repo']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_collaborators" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'username' is set
        if ('username' not in params or
                params['username'] is None):
            raise ValueError("Missing the required parameter `username` when calling `get_collaborators`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `get_collaborators`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'username' in params:
            path_params['username'] = params['username']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{username}/{repo}/collaborators', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def remove_collaborator(self, username, repo, collaborator, **kwargs):  # noqa: E501
        """Delete collaborator  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.remove_collaborator(username, repo, collaborator, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str collaborator: collaborator username (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.remove_collaborator_with_http_info(username, repo, collaborator, **kwargs)  # noqa: E501
        else:
            (data) = self.remove_collaborator_with_http_info(username, repo, collaborator, **kwargs)  # noqa: E501
            return data

    def remove_collaborator_with_http_info(self, username, repo, collaborator, **kwargs):  # noqa: E501
        """Delete collaborator  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.remove_collaborator_with_http_info(username, repo, collaborator, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str collaborator: collaborator username (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['username', 'repo', 'collaborator']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method remove_collaborator" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'username' is set
        if ('username' not in params or
                params['username'] is None):
            raise ValueError("Missing the required parameter `username` when calling `remove_collaborator`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `remove_collaborator`")  # noqa: E501
        # verify the required parameter 'collaborator' is set
        if ('collaborator' not in params or
                params['collaborator'] is None):
            raise ValueError("Missing the required parameter `collaborator` when calling `remove_collaborator`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'username' in params:
            path_params['username'] = params['username']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'collaborator' in params:
            path_params['collaborator'] = params['collaborator']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{username}/{repo}/collaborators/{collaborator}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
