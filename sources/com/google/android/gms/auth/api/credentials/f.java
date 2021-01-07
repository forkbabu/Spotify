package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.b;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import defpackage.oq;

public class f extends b<oq.a> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    f(android.content.Context r4, defpackage.oq.a r5) {
        /*
            r3 = this;
            com.google.android.gms.common.api.a<oq$a> r0 = defpackage.oq.e
            com.google.android.gms.common.api.internal.a r1 = new com.google.android.gms.common.api.internal.a
            r1.<init>()
            com.google.android.gms.common.api.b$a$a r2 = new com.google.android.gms.common.api.b$a$a
            r2.<init>()
            r2.c(r1)
            com.google.android.gms.common.api.b$a r1 = r2.a()
            r3.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.f.<init>(android.content.Context, oq$a):void");
    }

    public PendingIntent u(HintRequest hintRequest) {
        String str;
        Context m = m();
        oq.a aVar = (oq.a) l();
        String a = ((oq.a) l()).a();
        g.k(m, "context must not be null");
        g.k(hintRequest, "request must not be null");
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.d();
        }
        if (TextUtils.isEmpty(a)) {
            a = os.a();
        } else if (a == null) {
            throw new NullPointerException("null reference");
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", str);
        putExtra.putExtra("logSessionId", a);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        return PendingIntent.getActivity(m, SnackbarUtilsKt.SNACKBAR_ACTION_DURATION, putExtra, 134217728);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    f(android.app.Activity r4, defpackage.oq.a r5) {
        /*
            r3 = this;
            com.google.android.gms.common.api.a<oq$a> r0 = defpackage.oq.e
            com.google.android.gms.common.api.internal.a r1 = new com.google.android.gms.common.api.internal.a
            r1.<init>()
            com.google.android.gms.common.api.b$a$a r2 = new com.google.android.gms.common.api.b$a$a
            r2.<init>()
            r2.c(r1)
            android.os.Looper r1 = r4.getMainLooper()
            r2.b(r1)
            com.google.android.gms.common.api.b$a r1 = r2.a()
            r3.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.f.<init>(android.app.Activity, oq$a):void");
    }
}
