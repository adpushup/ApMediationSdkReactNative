package com.apmediationsdk

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.allstudio.apmediationsdk.ApMediationSdk

class ApMediationSdkModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  fun enableDebug(status: Boolean) {
    ApMediationSdk.enableDebug(status)
  }

  companion object {
    const val NAME = "ApMediationSdk"
  }
}
