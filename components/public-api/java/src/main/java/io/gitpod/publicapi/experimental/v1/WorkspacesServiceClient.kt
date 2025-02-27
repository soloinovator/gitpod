// Copyright (c) 2025 Gitpod GmbH. All rights reserved.
// Licensed under the GNU Affero General Public License (AGPL).
// See License.AGPL.txt in the project root for license information.

// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/experimental/v1/workspaces.proto
//
package io.gitpod.publicapi.experimental.v1

import com.connectrpc.Headers
import com.connectrpc.MethodSpec
import com.connectrpc.ProtocolClientInterface
import com.connectrpc.ResponseMessage
import com.connectrpc.ServerOnlyStreamInterface
import com.connectrpc.StreamType

public class WorkspacesServiceClient(
  private val client: ProtocolClientInterface,
) : WorkspacesServiceClientInterface {
  /**
   *  ListWorkspaces enumerates all workspaces belonging to the authenticated user.
   */
  override suspend fun listWorkspaces(request: Workspaces.ListWorkspacesRequest, headers: Headers):
      ResponseMessage<Workspaces.ListWorkspacesResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/ListWorkspaces",
      io.gitpod.publicapi.experimental.v1.Workspaces.ListWorkspacesRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.ListWorkspacesResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetWorkspace returns a single workspace.
   */
  override suspend fun getWorkspace(request: Workspaces.GetWorkspaceRequest, headers: Headers):
      ResponseMessage<Workspaces.GetWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/GetWorkspace",
      io.gitpod.publicapi.experimental.v1.Workspaces.GetWorkspaceRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.GetWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  StreamWorkspaceStatus returns workspace status once it changed.
   */
  override suspend fun streamWorkspaceStatus(headers: Headers):
      ServerOnlyStreamInterface<Workspaces.StreamWorkspaceStatusRequest, Workspaces.StreamWorkspaceStatusResponse>
      = client.serverStream(
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/StreamWorkspaceStatus",
      io.gitpod.publicapi.experimental.v1.Workspaces.StreamWorkspaceStatusRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.StreamWorkspaceStatusResponse::class,
      StreamType.SERVER,
    ),
  )


  /**
   *  GetOwnerToken returns an owner token.
   */
  override suspend fun getOwnerToken(request: Workspaces.GetOwnerTokenRequest, headers: Headers):
      ResponseMessage<Workspaces.GetOwnerTokenResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/GetOwnerToken",
      io.gitpod.publicapi.experimental.v1.Workspaces.GetOwnerTokenRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.GetOwnerTokenResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  CreateAndStartWorkspace creates a new workspace and starts it.
   */
  override suspend fun createAndStartWorkspace(request: Workspaces.CreateAndStartWorkspaceRequest,
      headers: Headers): ResponseMessage<Workspaces.CreateAndStartWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/CreateAndStartWorkspace",
      io.gitpod.publicapi.experimental.v1.Workspaces.CreateAndStartWorkspaceRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.CreateAndStartWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  StartWorkspace starts an existing workspace.
   */
  override suspend fun startWorkspace(request: Workspaces.StartWorkspaceRequest, headers: Headers):
      ResponseMessage<Workspaces.StartWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/StartWorkspace",
      io.gitpod.publicapi.experimental.v1.Workspaces.StartWorkspaceRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.StartWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  StopWorkspace stops a running workspace (instance).
   *  Errors:
   *    NOT_FOUND:           the workspace_id is unkown
   *    FAILED_PRECONDITION: if there's no running instance
   */
  override suspend fun stopWorkspace(request: Workspaces.StopWorkspaceRequest, headers: Headers):
      ResponseMessage<Workspaces.StopWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/StopWorkspace",
      io.gitpod.publicapi.experimental.v1.Workspaces.StopWorkspaceRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.StopWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  DeleteWorkspace deletes a workspace.
   *  When the workspace is running, it will be stopped as well.
   *  Deleted workspaces cannot be started again.
   */
  override suspend fun deleteWorkspace(request: Workspaces.DeleteWorkspaceRequest,
      headers: Headers): ResponseMessage<Workspaces.DeleteWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/DeleteWorkspace",
      io.gitpod.publicapi.experimental.v1.Workspaces.DeleteWorkspaceRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.DeleteWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  override suspend fun updatePort(request: Workspaces.UpdatePortRequest, headers: Headers):
      ResponseMessage<Workspaces.UpdatePortResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/UpdatePort",
      io.gitpod.publicapi.experimental.v1.Workspaces.UpdatePortRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.UpdatePortResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ListWorkspaceClasses enumerates all available workspace classes.
   */
  override suspend fun listWorkspaceClasses(request: Workspaces.ListWorkspaceClassesRequest,
      headers: Headers): ResponseMessage<Workspaces.ListWorkspaceClassesResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/ListWorkspaceClasses",
      io.gitpod.publicapi.experimental.v1.Workspaces.ListWorkspaceClassesRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.ListWorkspaceClassesResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetDefaultWorkspaceImage returns the default workspace image from different sources.
   */
  override suspend fun getDefaultWorkspaceImage(request: Workspaces.GetDefaultWorkspaceImageRequest,
      headers: Headers): ResponseMessage<Workspaces.GetDefaultWorkspaceImageResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.experimental.v1.WorkspacesService/GetDefaultWorkspaceImage",
      io.gitpod.publicapi.experimental.v1.Workspaces.GetDefaultWorkspaceImageRequest::class,
      io.gitpod.publicapi.experimental.v1.Workspaces.GetDefaultWorkspaceImageResponse::class,
      StreamType.UNARY,
    ),
  )

}
