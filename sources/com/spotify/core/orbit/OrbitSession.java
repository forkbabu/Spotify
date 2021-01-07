package com.spotify.core.orbit;

public final class OrbitSession implements OrbitSessionInterface {
    private long nOrbitSessionPtr;

    private OrbitSession() {
    }

    @Override // com.spotify.core.orbit.OrbitSessionInterface
    public native void log(String str);
}
