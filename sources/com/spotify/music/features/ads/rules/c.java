package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ Boolean a;

    public /* synthetic */ c(Boolean bool) {
        this.a = bool;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x001c: APUT  (r4v3 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r0v2 java.lang.String) */
    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Boolean bool = this.a;
        Throwable th = (Throwable) obj;
        Object[] objArr = new Object[2];
        objArr[0] = AdSlot.MIDROLL_WATCHNOW.getSlotId();
        objArr[1] = bool.booleanValue() ? "enabled" : "disabled";
        Logger.b("Request to update %s ad slot to %s failed", objArr);
    }
}
