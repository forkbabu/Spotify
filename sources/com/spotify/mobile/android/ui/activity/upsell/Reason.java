package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
public enum Reason {
    NO_UPSELL("no-upsell", r1),
    BAD_TYPE("bad type", r1),
    USER_REQUEST("user-initiated", r1);
    
    private final String mAdSlotName;
    private final c mViewUri;

    static {
        c cVar = ViewUris.a1;
    }

    private Reason(String str, c cVar) {
        this.mAdSlotName = str;
        this.mViewUri = cVar;
    }

    public String d() {
        return this.mAdSlotName;
    }
}
