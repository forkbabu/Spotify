package com.facebook.share.internal;

import com.facebook.internal.g;

public enum MessageDialogFeature implements g {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    
    private int minVersion;

    private MessageDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.g
    public String d() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    @Override // com.facebook.internal.g
    public int g() {
        return this.minVersion;
    }
}
