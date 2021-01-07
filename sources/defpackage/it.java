package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.a;

/* renamed from: it  reason: default package */
public final class it extends rs implements jt {
    it(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // defpackage.jt
    public final void E0(ht htVar) {
        Parcel T = T();
        ss.b(T, htVar);
        a0(4, T);
    }

    @Override // defpackage.jt
    public final void H2(ht htVar, ft ftVar) {
        Parcel T = T();
        ss.b(T, htVar);
        ss.c(T, ftVar);
        a0(3, T);
    }

    @Override // defpackage.jt
    public final void X(ht htVar, a aVar) {
        Parcel T = T();
        ss.b(T, htVar);
        ss.c(T, aVar);
        a0(1, T);
    }

    @Override // defpackage.jt
    public final void d0(ht htVar, lt ltVar) {
        Parcel T = T();
        ss.b(T, htVar);
        ss.c(T, ltVar);
        a0(2, T);
    }
}
