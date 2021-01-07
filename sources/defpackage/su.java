package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: su  reason: default package */
public class su implements IInterface {
    private final IBinder a;

    protected su(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
