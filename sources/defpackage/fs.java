package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;

/* renamed from: fs  reason: default package */
public final class fs extends f<hs> {
    private final Bundle L = new Bundle();

    public fs(Context context, Looper looper, c cVar, com.google.android.gms.common.api.internal.f fVar, n nVar) {
        super(context, looper, 223, cVar, fVar, nVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final boolean D() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean I() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof hs) {
            return (hs) queryLocalInterface;
        }
        return new gs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final com.google.android.gms.common.c[] t() {
        return ps.h;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final Bundle w() {
        return this.L;
    }
}
