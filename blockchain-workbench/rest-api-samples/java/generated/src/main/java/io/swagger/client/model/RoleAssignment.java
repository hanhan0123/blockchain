/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import java.io.IOException;

/**
 * RoleAssignment
 */

public class RoleAssignment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("applicationRoleId")
  private Integer applicationRoleId = null;

  @SerializedName("user")
  private User user = null;

  public RoleAssignment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RoleAssignment applicationRoleId(Integer applicationRoleId) {
    this.applicationRoleId = applicationRoleId;
    return this;
  }

   /**
   * Get applicationRoleId
   * @return applicationRoleId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationRoleId() {
    return applicationRoleId;
  }

  public void setApplicationRoleId(Integer applicationRoleId) {
    this.applicationRoleId = applicationRoleId;
  }

  public RoleAssignment user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssignment roleAssignment = (RoleAssignment) o;
    return Objects.equals(this.id, roleAssignment.id) &&
        Objects.equals(this.applicationRoleId, roleAssignment.applicationRoleId) &&
        Objects.equals(this.user, roleAssignment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, applicationRoleId, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    applicationRoleId: ").append(toIndentedString(applicationRoleId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

