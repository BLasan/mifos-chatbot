/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.GetFromAccountTypeStandingInstructionSwagger;
import org.mifos.chatbot.client.model.GetFromOfficeStandingInstructionSwagger;
import org.mifos.chatbot.client.model.GetStandingInstructionHistoryFromAccount;
import org.mifos.chatbot.client.model.GetStandingInstructionHistoryPageItemsFromClient;
import org.mifos.chatbot.client.model.GetStandingInstructionHistoryToAccount;
import org.mifos.chatbot.client.model.GetStandingInstructionHistoryToClient;
import org.mifos.chatbot.client.model.GetToAccountTypeStandingInstructionSwagger;
import org.mifos.chatbot.client.model.GetToOfficeStandingInstructionSwagger;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetStandingInstructionHistoryPageItemsResponse
 */

public class GetStandingInstructionHistoryPageItemsResponse {
  @SerializedName("standingInstructionId")
  private Long standingInstructionId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fromOffice")
  private GetFromOfficeStandingInstructionSwagger fromOffice = null;

  @SerializedName("fromClient")
  private GetStandingInstructionHistoryPageItemsFromClient fromClient = null;

  @SerializedName("fromAccountType")
  private GetFromAccountTypeStandingInstructionSwagger fromAccountType = null;

  @SerializedName("fromAccount")
  private GetStandingInstructionHistoryFromAccount fromAccount = null;

  @SerializedName("toAccountType")
  private GetToAccountTypeStandingInstructionSwagger toAccountType = null;

  @SerializedName("toAccount")
  private GetStandingInstructionHistoryToAccount toAccount = null;

  @SerializedName("toOffice")
  private GetToOfficeStandingInstructionSwagger toOffice = null;

  @SerializedName("toClient")
  private GetStandingInstructionHistoryToClient toClient = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("executionTime")
  private LocalDate executionTime = null;

  @SerializedName("errorLog")
  private String errorLog = null;

  public GetStandingInstructionHistoryPageItemsResponse standingInstructionId(Long standingInstructionId) {
    this.standingInstructionId = standingInstructionId;
    return this;
  }

   /**
   * Get standingInstructionId
   * @return standingInstructionId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getStandingInstructionId() {
    return standingInstructionId;
  }

  public void setStandingInstructionId(Long standingInstructionId) {
    this.standingInstructionId = standingInstructionId;
  }

  public GetStandingInstructionHistoryPageItemsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "ACC Transfer", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetStandingInstructionHistoryPageItemsResponse fromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @ApiModelProperty(value = "")
  public GetFromOfficeStandingInstructionSwagger getFromOffice() {
    return fromOffice;
  }

  public void setFromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
  }

  public GetStandingInstructionHistoryPageItemsResponse fromClient(GetStandingInstructionHistoryPageItemsFromClient fromClient) {
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @ApiModelProperty(value = "")
  public GetStandingInstructionHistoryPageItemsFromClient getFromClient() {
    return fromClient;
  }

  public void setFromClient(GetStandingInstructionHistoryPageItemsFromClient fromClient) {
    this.fromClient = fromClient;
  }

  public GetStandingInstructionHistoryPageItemsResponse fromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @ApiModelProperty(value = "")
  public GetFromAccountTypeStandingInstructionSwagger getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public GetStandingInstructionHistoryPageItemsResponse fromAccount(GetStandingInstructionHistoryFromAccount fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @ApiModelProperty(value = "")
  public GetStandingInstructionHistoryFromAccount getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(GetStandingInstructionHistoryFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }

  public GetStandingInstructionHistoryPageItemsResponse toAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @ApiModelProperty(value = "")
  public GetToAccountTypeStandingInstructionSwagger getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
  }

  public GetStandingInstructionHistoryPageItemsResponse toAccount(GetStandingInstructionHistoryToAccount toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @ApiModelProperty(value = "")
  public GetStandingInstructionHistoryToAccount getToAccount() {
    return toAccount;
  }

  public void setToAccount(GetStandingInstructionHistoryToAccount toAccount) {
    this.toAccount = toAccount;
  }

  public GetStandingInstructionHistoryPageItemsResponse toOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @ApiModelProperty(value = "")
  public GetToOfficeStandingInstructionSwagger getToOffice() {
    return toOffice;
  }

  public void setToOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
  }

  public GetStandingInstructionHistoryPageItemsResponse toClient(GetStandingInstructionHistoryToClient toClient) {
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @ApiModelProperty(value = "")
  public GetStandingInstructionHistoryToClient getToClient() {
    return toClient;
  }

  public void setToClient(GetStandingInstructionHistoryToClient toClient) {
    this.toClient = toClient;
  }

  public GetStandingInstructionHistoryPageItemsResponse amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "10.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetStandingInstructionHistoryPageItemsResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "success", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetStandingInstructionHistoryPageItemsResponse executionTime(LocalDate executionTime) {
    this.executionTime = executionTime;
    return this;
  }

   /**
   * Get executionTime
   * @return executionTime
  **/
  @ApiModelProperty(example = "[2014, 6, 30]", value = "")
  public LocalDate getExecutionTime() {
    return executionTime;
  }

  public void setExecutionTime(LocalDate executionTime) {
    this.executionTime = executionTime;
  }

  public GetStandingInstructionHistoryPageItemsResponse errorLog(String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

   /**
   * Get errorLog
   * @return errorLog
  **/
  @ApiModelProperty(example = " ", value = "")
  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStandingInstructionHistoryPageItemsResponse getStandingInstructionHistoryPageItemsResponse = (GetStandingInstructionHistoryPageItemsResponse) o;
    return Objects.equals(this.standingInstructionId, getStandingInstructionHistoryPageItemsResponse.standingInstructionId) &&
        Objects.equals(this.name, getStandingInstructionHistoryPageItemsResponse.name) &&
        Objects.equals(this.fromOffice, getStandingInstructionHistoryPageItemsResponse.fromOffice) &&
        Objects.equals(this.fromClient, getStandingInstructionHistoryPageItemsResponse.fromClient) &&
        Objects.equals(this.fromAccountType, getStandingInstructionHistoryPageItemsResponse.fromAccountType) &&
        Objects.equals(this.fromAccount, getStandingInstructionHistoryPageItemsResponse.fromAccount) &&
        Objects.equals(this.toAccountType, getStandingInstructionHistoryPageItemsResponse.toAccountType) &&
        Objects.equals(this.toAccount, getStandingInstructionHistoryPageItemsResponse.toAccount) &&
        Objects.equals(this.toOffice, getStandingInstructionHistoryPageItemsResponse.toOffice) &&
        Objects.equals(this.toClient, getStandingInstructionHistoryPageItemsResponse.toClient) &&
        Objects.equals(this.amount, getStandingInstructionHistoryPageItemsResponse.amount) &&
        Objects.equals(this.status, getStandingInstructionHistoryPageItemsResponse.status) &&
        Objects.equals(this.executionTime, getStandingInstructionHistoryPageItemsResponse.executionTime) &&
        Objects.equals(this.errorLog, getStandingInstructionHistoryPageItemsResponse.errorLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingInstructionId, name, fromOffice, fromClient, fromAccountType, fromAccount, toAccountType, toAccount, toOffice, toClient, amount, status, executionTime, errorLog);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStandingInstructionHistoryPageItemsResponse {\n");
    
    sb.append("    standingInstructionId: ").append(toIndentedString(standingInstructionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

