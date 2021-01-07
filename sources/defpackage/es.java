package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: es  reason: default package */
public final class es implements cs, IInterface {
    private final IBinder a;
    private final String b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    es(IBinder iBinder) {
        this.a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel T(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.cs
    public final String getId() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        Parcel T = T(1, obtain);
        String readString = T.readString();
        T.recycle();
        return readString;
    }

    @Override // defpackage.cs
    public final boolean q0(boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = bs.a;
        boolean z2 = true;
        obtain.writeInt(1);
        Parcel T = T(2, obtain);
        if (T.readInt() == 0) {
            z2 = false;
        }
        T.recycle();
        return z2;
    }
}
