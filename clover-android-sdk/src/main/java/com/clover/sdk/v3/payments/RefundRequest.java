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
 * <li>{@link #getRefund refund}</li>
 * <li>{@link #getCard card}</li>
 * <li>{@link #getIsAdjustment isAdjustment}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RefundRequest extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.payments.Refund getRefund() {
    return genClient.cacheGet(CacheKey.refund);
  }

  public com.clover.sdk.v3.pay.PaymentRequestCardDetails getCard() {
    return genClient.cacheGet(CacheKey.card);
  }

  public java.lang.Boolean getIsAdjustment() {
    return genClient.cacheGet(CacheKey.isAdjustment);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<RefundRequest> {
    refund {
      @Override
      public Object extractValue(RefundRequest instance) {
        return instance.genClient.extractRecord("refund", com.clover.sdk.v3.payments.Refund.JSON_CREATOR);
      }
    },
    card {
      @Override
      public Object extractValue(RefundRequest instance) {
        return instance.genClient.extractRecord("card", com.clover.sdk.v3.pay.PaymentRequestCardDetails.JSON_CREATOR);
      }
    },
    isAdjustment {
      @Override
      public Object extractValue(RefundRequest instance) {
        return instance.genClient.extractOther("isAdjustment", java.lang.Boolean.class);
      }
    },
      ;
  }

  private GenericClient<RefundRequest> genClient;

  /**
   * Constructs a new empty instance.
   */
  public RefundRequest() {
    genClient = new GenericClient<RefundRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected RefundRequest(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RefundRequest(String json) throws IllegalArgumentException {
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
  public RefundRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RefundRequest(RefundRequest src) {
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
  }

  /** Checks whether the 'refund' field is set and is not null */
  public boolean isNotNullRefund() {
    return genClient.cacheValueIsNotNull(CacheKey.refund);
  }

  /** Checks whether the 'card' field is set and is not null */
  public boolean isNotNullCard() {
    return genClient.cacheValueIsNotNull(CacheKey.card);
  }

  /** Checks whether the 'isAdjustment' field is set and is not null */
  public boolean isNotNullIsAdjustment() {
    return genClient.cacheValueIsNotNull(CacheKey.isAdjustment);
  }



  /** Checks whether the 'refund' field has been set, however the value could be null */
  public boolean hasRefund() {
    return genClient.cacheHasKey(CacheKey.refund);
  }

  /** Checks whether the 'card' field has been set, however the value could be null */
  public boolean hasCard() {
    return genClient.cacheHasKey(CacheKey.card);
  }

  /** Checks whether the 'isAdjustment' field has been set, however the value could be null */
  public boolean hasIsAdjustment() {
    return genClient.cacheHasKey(CacheKey.isAdjustment);
  }


  /**
   * Sets the field 'refund'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public RefundRequest setRefund(com.clover.sdk.v3.payments.Refund refund) {
    return genClient.setRecord(refund, CacheKey.refund);
  }

  /**
   * Sets the field 'card'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public RefundRequest setCard(com.clover.sdk.v3.pay.PaymentRequestCardDetails card) {
    return genClient.setRecord(card, CacheKey.card);
  }

  /**
   * Sets the field 'isAdjustment'.
   */
  public RefundRequest setIsAdjustment(java.lang.Boolean isAdjustment) {
    return genClient.setOther(isAdjustment, CacheKey.isAdjustment);
  }


  /** Clears the 'refund' field, the 'has' method for this field will now return false */
  public void clearRefund() {
    genClient.clear(CacheKey.refund);
  }
  /** Clears the 'card' field, the 'has' method for this field will now return false */
  public void clearCard() {
    genClient.clear(CacheKey.card);
  }
  /** Clears the 'isAdjustment' field, the 'has' method for this field will now return false */
  public void clearIsAdjustment() {
    genClient.clear(CacheKey.isAdjustment);
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
  public RefundRequest copyChanges() {
    RefundRequest copy = new RefundRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RefundRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RefundRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RefundRequest> CREATOR = new android.os.Parcelable.Creator<RefundRequest>() {
    @Override
    public RefundRequest createFromParcel(android.os.Parcel in) {
      RefundRequest instance = new RefundRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RefundRequest[] newArray(int size) {
      return new RefundRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RefundRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RefundRequest>() {
    @Override
    public RefundRequest create(org.json.JSONObject jsonObject) {
      return new RefundRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean REFUND_IS_REQUIRED = false;
    public static final boolean CARD_IS_REQUIRED = false;
    public static final boolean ISADJUSTMENT_IS_REQUIRED = false;

  }

}
