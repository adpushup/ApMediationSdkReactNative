import Foundation

@objc(ApMediationSdk)
class ApMediationSdk: NSObject {

  @objc
  func enableDebug(_ isEnabled: Bool) {
    print("[ApMediationSdk] enableDebug(\(isEnabled)) called — iOS support coming soon.")
  }

  @objc
  static func requiresMainQueueSetup() -> Bool {
    return false
  }
}