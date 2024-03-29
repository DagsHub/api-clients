/* tslint:disable */
/* eslint-disable */
/**
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import globalAxios, { AxiosResponse, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
import { Files } from '../models';
/**
 * ContentApi - axios parameter creator
 * @export
 */
export const ContentApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This method returns archive by given format.
         * @summary Download archive
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {string} format The format of archive, either .zip or .tar.gz
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getArchive: async (owner: string, repo: string, ref: string, format: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling getArchive.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling getArchive.');
            }
            // verify required parameter 'ref' is not null or undefined
            if (ref === null || ref === undefined) {
                throw new RequiredError('ref','Required parameter ref was null or undefined when calling getArchive.');
            }
            // verify required parameter 'format' is not null or undefined
            if (format === null || format === undefined) {
                throw new RequiredError('format','Required parameter format was null or undefined when calling getArchive.');
            }
            const localVarPath = `/repos/{owner}/{repo}/archive/{ref}{format}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"ref"}}`, encodeURIComponent(String(ref)))
                .replace(`{${"format"}}`, encodeURIComponent(String(format)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result in a slower response. 
         * @summary List data in a repository folder
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} branch branch of the repository
         * @param {string} path path of a folder in the repository
         * @param {boolean} [includeSize] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getContent: async (owner: string, repo: string, branch: string, path: string, includeSize?: boolean, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling getContent.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling getContent.');
            }
            // verify required parameter 'branch' is not null or undefined
            if (branch === null || branch === undefined) {
                throw new RequiredError('branch','Required parameter branch was null or undefined when calling getContent.');
            }
            // verify required parameter 'path' is not null or undefined
            if (path === null || path === undefined) {
                throw new RequiredError('path','Required parameter path was null or undefined when calling getContent.');
            }
            const localVarPath = `/repos/{owner}/{repo}/content/{branch}/{path}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"branch"}}`, encodeURIComponent(String(branch)))
                .replace(`{${"path"}}`, encodeURIComponent(String(path)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            if (includeSize !== undefined) {
                localVarQueryParameter['include_size'] = includeSize;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This method returns the raw content of a file.
         * @summary Download raw content
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {string} path The content path
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getRaw: async (owner: string, repo: string, ref: string, path: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling getRaw.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling getRaw.');
            }
            // verify required parameter 'ref' is not null or undefined
            if (ref === null || ref === undefined) {
                throw new RequiredError('ref','Required parameter ref was null or undefined when calling getRaw.');
            }
            // verify required parameter 'path' is not null or undefined
            if (path === null || path === undefined) {
                throw new RequiredError('path','Required parameter path was null or undefined when calling getRaw.');
            }
            const localVarPath = `/repos/{owner}/{repo}/raw/{ref}/{path}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"ref"}}`, encodeURIComponent(String(ref)))
                .replace(`{${"path"}}`, encodeURIComponent(String(path)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Upload data to a repository
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} branch branch of the repository
         * @param {string} path path of a folder in the repository
         * @param {string} [commitSummary] 
         * @param {string} [commitMessage] 
         * @param {string} [commitChoice] 
         * @param {string} [lastCommit] 
         * @param {string} [newBranchName] 
         * @param {string} [versioning] 
         * @param {string} [files] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        uploadContentForm: async (owner: string, repo: string, branch: string, path: string, commitSummary?: string, commitMessage?: string, commitChoice?: string, lastCommit?: string, newBranchName?: string, versioning?: string, files?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling uploadContentForm.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling uploadContentForm.');
            }
            // verify required parameter 'branch' is not null or undefined
            if (branch === null || branch === undefined) {
                throw new RequiredError('branch','Required parameter branch was null or undefined when calling uploadContentForm.');
            }
            // verify required parameter 'path' is not null or undefined
            if (path === null || path === undefined) {
                throw new RequiredError('path','Required parameter path was null or undefined when calling uploadContentForm.');
            }
            const localVarPath = `/repos/{owner}/{repo}/content/{branch}/{path}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"branch"}}`, encodeURIComponent(String(branch)))
                .replace(`{${"path"}}`, encodeURIComponent(String(path)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;
            const localVarFormParams = new FormData();

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }


            if (commitSummary !== undefined) { 
                localVarFormParams.append('commit_summary', commitSummary as any);
            }

            if (commitMessage !== undefined) { 
                localVarFormParams.append('commit_message', commitMessage as any);
            }

            if (commitChoice !== undefined) { 
                localVarFormParams.append('commit_choice', commitChoice as any);
            }

            if (lastCommit !== undefined) { 
                localVarFormParams.append('last_commit', lastCommit as any);
            }

            if (newBranchName !== undefined) { 
                localVarFormParams.append('new_branch_name', newBranchName as any);
            }

            if (versioning !== undefined) { 
                localVarFormParams.append('versioning', versioning as any);
            }

            if (files !== undefined) { 
                localVarFormParams.append('files', files as any);
            }

            localVarHeaderParameter['Content-Type'] = 'multipart/form-data';
            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = localVarFormParams;

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * ContentApi - functional programming interface
 * @export
 */
export const ContentApiFp = function(configuration?: Configuration) {
    return {
        /**
         * This method returns archive by given format.
         * @summary Download archive
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {string} format The format of archive, either .zip or .tar.gz
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getArchive(owner: string, repo: string, ref: string, format: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await ContentApiAxiosParamCreator(configuration).getArchive(owner, repo, ref, format, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result in a slower response. 
         * @summary List data in a repository folder
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} branch branch of the repository
         * @param {string} path path of a folder in the repository
         * @param {boolean} [includeSize] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getContent(owner: string, repo: string, branch: string, path: string, includeSize?: boolean, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<Files>>> {
            const localVarAxiosArgs = await ContentApiAxiosParamCreator(configuration).getContent(owner, repo, branch, path, includeSize, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This method returns the raw content of a file.
         * @summary Download raw content
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {string} path The content path
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getRaw(owner: string, repo: string, ref: string, path: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await ContentApiAxiosParamCreator(configuration).getRaw(owner, repo, ref, path, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * 
         * @summary Upload data to a repository
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} branch branch of the repository
         * @param {string} path path of a folder in the repository
         * @param {string} [commitSummary] 
         * @param {string} [commitMessage] 
         * @param {string} [commitChoice] 
         * @param {string} [lastCommit] 
         * @param {string} [newBranchName] 
         * @param {string} [versioning] 
         * @param {string} [files] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async uploadContentForm(owner: string, repo: string, branch: string, path: string, commitSummary?: string, commitMessage?: string, commitChoice?: string, lastCommit?: string, newBranchName?: string, versioning?: string, files?: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await ContentApiAxiosParamCreator(configuration).uploadContentForm(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * ContentApi - factory interface
 * @export
 */
export const ContentApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * This method returns archive by given format.
         * @summary Download archive
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {string} format The format of archive, either .zip or .tar.gz
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getArchive(owner: string, repo: string, ref: string, format: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return ContentApiFp(configuration).getArchive(owner, repo, ref, format, options).then((request) => request(axios, basePath));
        },
        /**
         * List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result in a slower response. 
         * @summary List data in a repository folder
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} branch branch of the repository
         * @param {string} path path of a folder in the repository
         * @param {boolean} [includeSize] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getContent(owner: string, repo: string, branch: string, path: string, includeSize?: boolean, options?: AxiosRequestConfig): Promise<AxiosResponse<Files>> {
            return ContentApiFp(configuration).getContent(owner, repo, branch, path, includeSize, options).then((request) => request(axios, basePath));
        },
        /**
         * This method returns the raw content of a file.
         * @summary Download raw content
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {string} path The content path
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getRaw(owner: string, repo: string, ref: string, path: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return ContentApiFp(configuration).getRaw(owner, repo, ref, path, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Upload data to a repository
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} branch branch of the repository
         * @param {string} path path of a folder in the repository
         * @param {string} [commitSummary] 
         * @param {string} [commitMessage] 
         * @param {string} [commitChoice] 
         * @param {string} [lastCommit] 
         * @param {string} [newBranchName] 
         * @param {string} [versioning] 
         * @param {string} [files] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async uploadContentForm(owner: string, repo: string, branch: string, path: string, commitSummary?: string, commitMessage?: string, commitChoice?: string, lastCommit?: string, newBranchName?: string, versioning?: string, files?: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return ContentApiFp(configuration).uploadContentForm(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * ContentApi - object-oriented interface
 * @export
 * @class ContentApi
 * @extends {BaseAPI}
 */
export class ContentApi extends BaseAPI {
    /**
     * This method returns archive by given format.
     * @summary Download archive
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {string} ref The name of the commit/branch/tag
     * @param {string} format The format of archive, either .zip or .tar.gz
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ContentApi
     */
    public async getArchive(owner: string, repo: string, ref: string, format: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return ContentApiFp(this.configuration).getArchive(owner, repo, ref, format, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result in a slower response. 
     * @summary List data in a repository folder
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {string} branch branch of the repository
     * @param {string} path path of a folder in the repository
     * @param {boolean} [includeSize] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ContentApi
     */
    public async getContent(owner: string, repo: string, branch: string, path: string, includeSize?: boolean, options?: AxiosRequestConfig) : Promise<AxiosResponse<Files>> {
        return ContentApiFp(this.configuration).getContent(owner, repo, branch, path, includeSize, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This method returns the raw content of a file.
     * @summary Download raw content
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {string} ref The name of the commit/branch/tag
     * @param {string} path The content path
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ContentApi
     */
    public async getRaw(owner: string, repo: string, ref: string, path: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return ContentApiFp(this.configuration).getRaw(owner, repo, ref, path, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * 
     * @summary Upload data to a repository
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {string} branch branch of the repository
     * @param {string} path path of a folder in the repository
     * @param {string} [commitSummary] 
     * @param {string} [commitMessage] 
     * @param {string} [commitChoice] 
     * @param {string} [lastCommit] 
     * @param {string} [newBranchName] 
     * @param {string} [versioning] 
     * @param {string} [files] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ContentApi
     */
    public async uploadContentForm(owner: string, repo: string, branch: string, path: string, commitSummary?: string, commitMessage?: string, commitChoice?: string, lastCommit?: string, newBranchName?: string, versioning?: string, files?: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return ContentApiFp(this.configuration).uploadContentForm(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files, options).then((request) => request(this.axios, this.basePath));
    }
}
