import { NativeModules } from 'react-native';

const LINKING_ERROR = `The package 'ap-mediation-sdk' doesn't seem to be linked. Make sure: \n\n` +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const ApMediationSdk = NativeModules.ApMediationSdk
  ? NativeModules.ApMediationSdk
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function enableDebug(isEnabled: boolean): void {
  return ApMediationSdk.enableDebug(isEnabled);
}
