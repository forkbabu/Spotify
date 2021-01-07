package com.facebook.share.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.facebook.a;
import com.facebook.e;
import com.facebook.k;

/* access modifiers changed from: package-private */
public final class i extends e {
    i() {
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.e
    public void c(a aVar, a aVar2) {
        Context d = k.d();
        if (aVar2 == null) {
            int unused = e.w = (e.w + 1) % Constants.ONE_SECOND;
            d.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", e.w).apply();
            e.q.clear();
            e.p.e();
        }
        e.B(null, "com.facebook.sdk.LikeActionController.DID_RESET");
    }
}
