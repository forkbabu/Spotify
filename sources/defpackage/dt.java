package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;
import defpackage.oq;

/* renamed from: dt  reason: default package */
public final class dt extends f<jt> {
    private final oq.a L;

    public dt(Context context, Looper looper, c cVar, oq.a aVar, c.a aVar2, c.b bVar) {
        super(context, looper, 68, cVar, aVar2, bVar);
        oq.a.C0661a aVar3 = new oq.a.C0661a(aVar == null ? oq.a.f : aVar);
        aVar3.a(os.a());
        this.L = aVar3.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof jt) {
            return (jt) queryLocalInterface;
        }
        return new it(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final Bundle w() {
        return this.L.b();
    }
}
