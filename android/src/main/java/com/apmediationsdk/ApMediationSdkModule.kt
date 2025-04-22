package com.apmediationsdk

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.adpushup.apmediationsdk.ApMediationSdk

class ApMediationSdkModule(private val reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  fun enableDebug(status: Boolean) {
    ApMediationSdk.enableDebug(reactContext, status)
  }

  companion object {
    const val NAME = "ApMediationSdk"
  }
}
