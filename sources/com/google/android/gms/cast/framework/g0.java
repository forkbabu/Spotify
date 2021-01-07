package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

public interface g0 extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.cast.a implements g0 {
        public static g0 D3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof g0) {
                return (g0) queryLocalInterface;
            }
            return new i0(iBinder);
        }
    }

    IBinder G(Intent intent);

    void onDestroy();

    int p3(Intent intent, int i, int i2);

    void q();
}
