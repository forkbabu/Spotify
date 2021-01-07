package com.facebook.share.internal;

import com.facebook.internal.g;

public enum ShareDialogFeature implements g {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    
    private int minVersion;

    private ShareDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.g
    public String d() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    @Override // com.facebook.internal.g
    public int g() {
        return this.minVersion;
    }
}
