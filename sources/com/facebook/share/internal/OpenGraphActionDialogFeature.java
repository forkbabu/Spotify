package com.facebook.share.internal;

import com.facebook.internal.g;

public enum OpenGraphActionDialogFeature implements g {
    OG_ACTION_DIALOG(20130618);
    
    private int minVersion;

    private OpenGraphActionDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.g
    public String d() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    @Override // com.facebook.internal.g
    public int g() {
        return this.minVersion;
    }
}
