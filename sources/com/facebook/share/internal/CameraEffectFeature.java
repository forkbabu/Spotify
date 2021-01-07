package com.facebook.share.internal;

import com.facebook.internal.g;

public enum CameraEffectFeature implements g {
    SHARE_CAMERA_EFFECT(20170417);
    
    private int minVersion;

    private CameraEffectFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.g
    public String d() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    @Override // com.facebook.internal.g
    public int g() {
        return this.minVersion;
    }
}
