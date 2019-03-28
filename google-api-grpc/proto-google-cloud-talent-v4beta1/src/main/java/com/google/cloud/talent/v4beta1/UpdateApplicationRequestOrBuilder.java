// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

public interface UpdateApplicationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.UpdateApplicationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The application resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
   */
  boolean hasApplication();
  /**
   *
   *
   * <pre>
   * Required.
   * The application resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
   */
  com.google.cloud.talent.v4beta1.Application getApplication();
  /**
   *
   *
   * <pre>
   * Required.
   * The application resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
   */
  com.google.cloud.talent.v4beta1.ApplicationOrBuilder getApplicationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional but strongly recommended for the best service
   * experience.
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask]
   * is provided, only the specified fields in
   * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application]
   * are updated. Otherwise all the fields are updated.
   * A field mask to specify the application fields to be updated. Only
   * top level fields of [Application][google.cloud.talent.v4beta1.Application]
   * are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended for the best service
   * experience.
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask]
   * is provided, only the specified fields in
   * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application]
   * are updated. Otherwise all the fields are updated.
   * A field mask to specify the application fields to be updated. Only
   * top level fields of [Application][google.cloud.talent.v4beta1.Application]
   * are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended for the best service
   * experience.
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask]
   * is provided, only the specified fields in
   * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application]
   * are updated. Otherwise all the fields are updated.
   * A field mask to specify the application fields to be updated. Only
   * top level fields of [Application][google.cloud.talent.v4beta1.Application]
   * are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}