package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.d;
import com.google.android.gms.common.ConnectionResult;

public interface c0 extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.cast.a implements c0 {
        public static c0 D3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof c0) {
                return (c0) queryLocalInterface;
            }
            return new e0(iBinder);
        }
    }

    void C(d dVar, String str, String str2, boolean z);

    void H0(boolean z, int i);

    void g(Bundle bundle);

    void i(int i);

    void n(ConnectionResult connectionResult);

    void z(int i);
}
