package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;
import com.spotify.mobile.android.spotlets.bixbyhomecards.f;

public class a extends RegisterableCardReceiver {
    private final f d;

    public a(Context context, f fVar) {
        super(context);
        this.d = fVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.p60
    public void a(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            this.d.b(BixbyHomeCardService.Request.DISABLE, iArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.p60
    public void b(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            this.d.b(BixbyHomeCardService.Request.ENABLE, iArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.p60
    public void c(Context context, o60 o60, int i, y60 y60) {
        if (context != null && i != -1) {
            this.d.a(BixbyHomeCardService.Request.RECEIVE_EVENT, i, y60.a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.p60
    public void d(Context context, o60 o60, int[] iArr) {
        if (context != null && iArr != null) {
            this.d.b(BixbyHomeCardService.Request.UPDATE, iArr);
        }
    }
}
