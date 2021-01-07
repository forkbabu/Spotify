package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;
import com.spotify.mobile.android.spotlets.bixbyhomecards.f;
import com.spotify.mobile.android.spotlets.bixbyhomecards.h;
import java.util.Random;

public class BixbyHomeCardContentProvider extends q60 {
    private static f g(Context context) {
        return new f(context, new h2e(e2e.a.a(context, new Random(), new aqe())), new h(context));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.q60
    public void a(Context context, int[] iArr) {
        if (iArr != null) {
            g(context).b(BixbyHomeCardService.Request.DISABLE, iArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.q60
    public void b(Context context, int[] iArr) {
        if (iArr != null) {
            g(context).b(BixbyHomeCardService.Request.ENABLE, iArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.q60
    public void e(Context context, o60 o60, int i, y60 y60) {
        if (i != -1) {
            g(context).a(BixbyHomeCardService.Request.RECEIVE_EVENT, i, y60.a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.q60
    public void f(Context context, o60 o60, int[] iArr) {
        if (iArr != null) {
            g(context).b(BixbyHomeCardService.Request.UPDATE, iArr);
        }
    }
}
