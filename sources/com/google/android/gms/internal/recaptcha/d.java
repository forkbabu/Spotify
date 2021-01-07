package com.google.android.gms.internal.recaptcha;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;

public final class d extends f<b3> {
    public d(Context context, Looper looper, c cVar, com.google.android.gms.common.api.internal.f fVar, n nVar) {
        super(context, looper, 205, cVar, fVar, nVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.recaptcha.internal.IRecaptchaService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.recaptcha.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 17108000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptcha.internal.IRecaptchaService");
        if (queryLocalInterface instanceof b3) {
            return (b3) queryLocalInterface;
        }
        return new a3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final com.google.android.gms.common.c[] t() {
        return com.google.android.gms.recaptcha.f.e;
    }
}
