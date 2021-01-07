package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.cast.x;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;

public final class b0 extends f<k> {
    public b0(Context context, Looper looper, c cVar, c.a aVar, c.b bVar) {
        super(context, looper, 161, cVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new j(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final com.google.android.gms.common.c[] t() {
        return x.h;
    }
}
