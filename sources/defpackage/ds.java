package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ds  reason: default package */
public abstract class ds extends Binder implements cs, IInterface {
    public static cs C3(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof cs ? (cs) queryLocalInterface : new es(iBinder);
    }
}
