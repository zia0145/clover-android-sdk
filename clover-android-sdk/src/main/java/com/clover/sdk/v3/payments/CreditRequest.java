/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getOrderId orderId}</li>
 * <li>{@link #getCredit credit}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CreditRequest extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier of the order with which this payment is associated
   */
  public java.lang.String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }

  public com.clover.sdk.v3.payments.Credit getCredit() {
    return genClient.cacheGet(CacheKey.credit);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<CreditRequest> {
    orderId {
      @Override
      public Object extractValue(CreditRequest instance) {
        return instance.genClient.extractOther("orderId", java.lang.String.class);
      }
    },
    credit {
      @Override
      public Object extractValue(CreditRequest instance) {
        return instance.genClient.extractRecord("credit", com.clover.sdk.v3.payments.Credit.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<CreditRequest> genClient;

  /**
   * Constructs a new empty instance.
   */
  public CreditRequest() {
    genClient = new GenericClient<CreditRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected CreditRequest(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CreditRequest(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public CreditRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CreditRequest(CreditRequest src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getOrderId(), 13);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'credit' field is set and is not null */
  public boolean isNotNullCredit() {
    return genClient.cacheValueIsNotNull(CacheKey.credit);
  }



  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'credit' field has been set, however the value could be null */
  public boolean hasCredit() {
    return genClient.cacheHasKey(CacheKey.credit);
  }


  /**
   * Sets the field 'orderId'.
   */
  public CreditRequest setOrderId(java.lang.String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'credit'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CreditRequest setCredit(com.clover.sdk.v3.payments.Credit credit) {
    return genClient.setRecord(credit, CacheKey.credit);
  }


  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'credit' field, the 'has' method for this field will now return false */
  public void clearCredit() {
    genClient.clear(CacheKey.credit);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public CreditRequest copyChanges() {
    CreditRequest copy = new CreditRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CreditRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CreditRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CreditRequest> CREATOR = new android.os.Parcelable.Creator<CreditRequest>() {
    @Override
    public CreditRequest createFromParcel(android.os.Parcel in) {
      CreditRequest instance = new CreditRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CreditRequest[] newArray(int size) {
      return new CreditRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CreditRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CreditRequest>() {
    @Override
    public CreditRequest create(org.json.JSONObject jsonObject) {
      return new CreditRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final long ORDERID_MAX_LEN = 13;
    public static final boolean CREDIT_IS_REQUIRED = false;

  }

}
