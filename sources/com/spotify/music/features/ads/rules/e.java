package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ Boolean a;

    public /* synthetic */ e(Boolean bool) {
        this.a = bool;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0025: APUT  (r8v4 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r1v3 java.lang.String) */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x003f: APUT  (r8v3 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r1v1 java.lang.String) */
    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Boolean bool = this.a;
        String str = "enabled";
        if (((Response) obj).getStatus() == 202) {
            Object[] objArr = new Object[2];
            objArr[0] = AdSlot.MIDROLL_WATCHNOW.getSlotId();
            if (!bool.booleanValue()) {
                str = "disabled";
            }
            objArr[1] = str;
            Logger.b("%s ad slot state updated %s", objArr);
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = AdSlot.MIDROLL_WATCHNOW.getSlotId();
        if (!bool.booleanValue()) {
            str = "disabled";
        }
        objArr2[1] = str;
        Logger.b("Failed to update ad slot state: %s to %s", objArr2);
    }
}
