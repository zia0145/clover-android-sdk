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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMessage message}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PlatformError extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Description of the error.
   */
  public java.lang.String getMessage() {
    return genClient.cacheGet(CacheKey.message);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PlatformError> {
    message {
      @Override
      public Object extractValue(PlatformError instance) {
        return instance.genClient.extractOther("message", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<PlatformError> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PlatformError() {
    genClient = new GenericClient<PlatformError>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PlatformError(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PlatformError(String json) throws IllegalArgumentException {
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
  public PlatformError(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PlatformError(PlatformError src) {
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

  /** Checks whether the 'message' field is set and is not null */
  public boolean isNotNullMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.message);
  }



  /** Checks whether the 'message' field has been set, however the value could be null */
  public boolean hasMessage() {
    return genClient.cacheHasKey(CacheKey.message);
  }


  /**
   * Sets the field 'message'.
   */
  public PlatformError setMessage(java.lang.String message) {
    return genClient.setOther(message, CacheKey.message);
  }


  /** Clears the 'message' field, the 'has' method for this field will now return false */
  public void clearMessage() {
    genClient.clear(CacheKey.message);
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
  public PlatformError copyChanges() {
    PlatformError copy = new PlatformError();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PlatformError src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PlatformError(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PlatformError> CREATOR = new android.os.Parcelable.Creator<PlatformError>() {
    @Override
    public PlatformError createFromParcel(android.os.Parcel in) {
      PlatformError instance = new PlatformError(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PlatformError[] newArray(int size) {
      return new PlatformError[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PlatformError> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PlatformError>() {
    @Override
    public PlatformError create(org.json.JSONObject jsonObject) {
      return new PlatformError(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean MESSAGE_IS_REQUIRED = false;

  }

}
