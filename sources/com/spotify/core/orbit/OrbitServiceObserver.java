package com.spotify.core.orbit;

public abstract class OrbitServiceObserver {
    public void onForgetCredentials() {
    }

    public abstract void onIncognitoModeDisabledByTimer();

    public void onOfflineSyncError(int i) {
    }

    public abstract void onOrbitStarted();

    public abstract void onOrbitStartupFailed(int i);

    public abstract void onOrbitStopped();

    public void onPlaybackError(int i, String str) {
    }
}
