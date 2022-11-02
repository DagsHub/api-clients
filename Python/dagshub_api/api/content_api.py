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


class ContentApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_archive(self, username, repo, ref, format, **kwargs):  # noqa: E501
        """Download archive  # noqa: E501

        This method returns archive by given format.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_archive(username, repo, ref, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str ref: The name of the commit/branch/tag (required)
        :param str format: The format of archive, either .zip or .tar.gz (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_archive_with_http_info(username, repo, ref, format, **kwargs)  # noqa: E501
        else:
            (data) = self.get_archive_with_http_info(username, repo, ref, format, **kwargs)  # noqa: E501
            return data

    def get_archive_with_http_info(self, username, repo, ref, format, **kwargs):  # noqa: E501
        """Download archive  # noqa: E501

        This method returns archive by given format.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_archive_with_http_info(username, repo, ref, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str ref: The name of the commit/branch/tag (required)
        :param str format: The format of archive, either .zip or .tar.gz (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['username', 'repo', 'ref', 'format']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_archive" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'username' is set
        if ('username' not in params or
                params['username'] is None):
            raise ValueError("Missing the required parameter `username` when calling `get_archive`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `get_archive`")  # noqa: E501
        # verify the required parameter 'ref' is set
        if ('ref' not in params or
                params['ref'] is None):
            raise ValueError("Missing the required parameter `ref` when calling `get_archive`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `get_archive`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'username' in params:
            path_params['username'] = params['username']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'ref' in params:
            path_params['ref'] = params['ref']  # noqa: E501
        if 'format' in params:
            path_params['format'] = params['format']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{username}/{repo}/archive/{ref}/{format}', 'GET',
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

    def get_content(self, owner, repo, branch, path, **kwargs):  # noqa: E501
        """List data in a repository folder  # noqa: E501

        List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result slower response.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_content(owner, repo, branch, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param str branch: branch of the repository (required)
        :param str path: path of a folder in the repository (required)
        :param bool include_size:
        :return: Files
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_content_with_http_info(owner, repo, branch, path, **kwargs)  # noqa: E501
        else:
            (data) = self.get_content_with_http_info(owner, repo, branch, path, **kwargs)  # noqa: E501
            return data

    def get_content_with_http_info(self, owner, repo, branch, path, **kwargs):  # noqa: E501
        """List data in a repository folder  # noqa: E501

        List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result slower response.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_content_with_http_info(owner, repo, branch, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param str branch: branch of the repository (required)
        :param str path: path of a folder in the repository (required)
        :param bool include_size:
        :return: Files
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'branch', 'path', 'include_size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_content" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `get_content`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `get_content`")  # noqa: E501
        # verify the required parameter 'branch' is set
        if ('branch' not in params or
                params['branch'] is None):
            raise ValueError("Missing the required parameter `branch` when calling `get_content`")  # noqa: E501
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `get_content`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'branch' in params:
            path_params['branch'] = params['branch']  # noqa: E501
        if 'path' in params:
            path_params['path'] = params['path']  # noqa: E501

        query_params = []
        if 'include_size' in params:
            query_params.append(('include_size', params['include_size']))  # noqa: E501

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
            '/repos/{owner}/{repo}/content/{branch}/{path}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Files',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_raw(self, username, repo, ref, path, **kwargs):  # noqa: E501
        """Download raw content  # noqa: E501

        This method returns the raw content of a file.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_raw(username, repo, ref, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str ref: The name of the commit/branch/tag (required)
        :param str path: The content path (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_raw_with_http_info(username, repo, ref, path, **kwargs)  # noqa: E501
        else:
            (data) = self.get_raw_with_http_info(username, repo, ref, path, **kwargs)  # noqa: E501
            return data

    def get_raw_with_http_info(self, username, repo, ref, path, **kwargs):  # noqa: E501
        """Download raw content  # noqa: E501

        This method returns the raw content of a file.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_raw_with_http_info(username, repo, ref, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str username: A DagsHub username (required)
        :param str repo: name of the repository (required)
        :param str ref: The name of the commit/branch/tag (required)
        :param str path: The content path (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['username', 'repo', 'ref', 'path']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_raw" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'username' is set
        if ('username' not in params or
                params['username'] is None):
            raise ValueError("Missing the required parameter `username` when calling `get_raw`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `get_raw`")  # noqa: E501
        # verify the required parameter 'ref' is set
        if ('ref' not in params or
                params['ref'] is None):
            raise ValueError("Missing the required parameter `ref` when calling `get_raw`")  # noqa: E501
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `get_raw`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'username' in params:
            path_params['username'] = params['username']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'ref' in params:
            path_params['ref'] = params['ref']  # noqa: E501
        if 'path' in params:
            path_params['path'] = params['path']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{username}/{repo}/raw/{ref}/{path}', 'GET',
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

    def upload_content(self, owner, repo, branch, path, **kwargs):  # noqa: E501
        """Upload data to a repository  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.upload_content(owner, repo, branch, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param str branch: branch of the repository (required)
        :param str path: path of a folder in the repository (required)
        :param str commit_summary:
        :param str commit_message:
        :param str commit_choice:
        :param str last_commit:
        :param str new_branch_name:
        :param str versioning:
        :param str files:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.upload_content_with_http_info(owner, repo, branch, path, **kwargs)  # noqa: E501
        else:
            (data) = self.upload_content_with_http_info(owner, repo, branch, path, **kwargs)  # noqa: E501
            return data

    def upload_content_with_http_info(self, owner, repo, branch, path, **kwargs):  # noqa: E501
        """Upload data to a repository  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.upload_content_with_http_info(owner, repo, branch, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param str branch: branch of the repository (required)
        :param str path: path of a folder in the repository (required)
        :param str commit_summary:
        :param str commit_message:
        :param str commit_choice:
        :param str last_commit:
        :param str new_branch_name:
        :param str versioning:
        :param str files:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'branch', 'path', 'commit_summary', 'commit_message', 'commit_choice', 'last_commit', 'new_branch_name', 'versioning', 'files']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method upload_content" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `upload_content`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `upload_content`")  # noqa: E501
        # verify the required parameter 'branch' is set
        if ('branch' not in params or
                params['branch'] is None):
            raise ValueError("Missing the required parameter `branch` when calling `upload_content`")  # noqa: E501
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `upload_content`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'branch' in params:
            path_params['branch'] = params['branch']  # noqa: E501
        if 'path' in params:
            path_params['path'] = params['path']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'commit_summary' in params:
            form_params.append(('commit_summary', params['commit_summary']))  # noqa: E501
        if 'commit_message' in params:
            form_params.append(('commit_message', params['commit_message']))  # noqa: E501
        if 'commit_choice' in params:
            form_params.append(('commit_choice', params['commit_choice']))  # noqa: E501
        if 'last_commit' in params:
            form_params.append(('last_commit', params['last_commit']))  # noqa: E501
        if 'new_branch_name' in params:
            form_params.append(('new_branch_name', params['new_branch_name']))  # noqa: E501
        if 'versioning' in params:
            form_params.append(('versioning', params['versioning']))  # noqa: E501
        if 'files' in params:
            form_params.append(('files', params['files']))  # noqa: E501

        body_params = None
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['multipart/form-data'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{owner}/{repo}/content/{branch}/{path}', 'PUT',
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
