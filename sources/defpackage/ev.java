package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ev  reason: default package */
public final class ev extends nt implements fv {
    ev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // defpackage.fv
    public final void w1(iv ivVar, dv dvVar) {
        Parcel T = T();
        ot.b(T, ivVar);
        T.writeStrongBinder((mt) dvVar);
        C0(12, T);
    }
}
