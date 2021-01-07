package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: zr  reason: default package */
public abstract class zr extends tu implements yr {
    public zr() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static yr asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof yr) {
            return (yr) queryLocalInterface;
        }
        return new as(iBinder);
    }
}
