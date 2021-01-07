package com.facebook.share.internal;

import com.facebook.internal.g;

public enum ShareStoryFeature implements g {
    SHARE_STORY_ASSET(20170417);
    
    private int minVersion;

    private ShareStoryFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.g
    public String d() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    @Override // com.facebook.internal.g
    public int g() {
        return this.minVersion;
    }
}
